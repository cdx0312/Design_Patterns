package com.proxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class Proxy {



    public static Object newProxyInstance(Class clazz, InvocationHandler h) throws Exception{
        String methodString = "";
        String rt = "\r\n";

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            methodString += "@Override" + rt + "public void " + method.getName() + "()" + "{" + rt +
                    "Method md = null;" + rt +
                    "try {" + rt +
                    "md = " + clazz.getName() + ".class.getMethod(\"" + method.getName() + "\");" + rt +
                    "} catch (NoSuchMethodException e) {" + rt +
                    "e.printStackTrace();" + rt + "}" + rt +
                    "h.invoke(this, md);" + rt +
                    "}";
        }

        String src =
                "package com.proxy;" + rt +
                        "import java.lang.reflect.Method;" + rt +
                        "public class $Proxy implements " + clazz.getName()+ "{" + rt +
                        "Moveable moveable;" + rt +
                        "public $Proxy(InvocationHandler h) {" + rt +
                        "this.h = h;" + rt +
                        "}" + rt +
                        "com.proxy.InvocationHandler h;" + rt +
                        methodString + rt +
                        "}";
        String fileName = System.getProperty("user.dir") + "/src/com/proxy/$Proxy.java";
//        System.out.println(fileName);
        File file = new File(fileName);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(src);
        fileWriter.flush();
        fileWriter.close();
        //拿到编译器
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
//        System.out.println(compiler.getClass().getName());
        //获得文件管理器
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null,null,null);
        //找到Java文件的数组集合
        Iterable units = fileManager.getJavaFileObjects(fileName);
        //编译任务
        JavaCompiler.CompilationTask task = compiler.getTask(null,fileManager, null, null, null, units);
        task.call();
        fileManager.close();
        //将.class文件载入内存中
        URL[] urls = new URL[] {new URL("file:/" + System.getProperty("user.dir") + "/src")};
        URLClassLoader url = new URLClassLoader(urls);
        Class c = url.loadClass("com.proxy.$Proxy");
//        System.out.println(c);

        //生成class文件的一个实例
        //拿到class文件的非空构造方法
        Constructor constructor = c.getConstructor(InvocationHandler.class);
        Object object = constructor.newInstance(h);

        return object;

    }
}

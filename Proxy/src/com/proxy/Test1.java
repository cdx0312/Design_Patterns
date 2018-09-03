package com.proxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String rt = "\r\n";
        String src =
                "package com.proxy;" + rt +
                        "public class TankTimeProxy implements Moveable{" + rt +
                        "Moveable moveable;" + rt +
                        "public TankTimeProxy(Moveable moveable) {" + rt +
                        "this.moveable = moveable;" + rt +
                        "}" + rt +
                        "@Override" + rt +
                        "public void move() {" + rt +
                        "long start = System.currentTimeMillis();" + rt +
                        "System.out.println(\"startTime: \" + start);" + rt +
                        "moveable.move();" + rt +
                        "long end = System.currentTimeMillis();" + rt +
                        "System.out.println(\"endTime: \" + end); " + rt +
                        "System.out.println(\"time: \" + (end - start) + \"ms\");" + rt +
                        "}" + rt +
                "}";
        String fileName = System.getProperty("user.dir") + "/src/com/proxy/TankTimeProxy.java";
//        System.out.println(fileName);
        File file = new File(fileName);
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(src);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        Class c = url.loadClass("com.proxy.TankTimeProxy");
//        System.out.println(c);

        //生成class文件的一个实例
        //拿到class文件的非空构造方法
        Constructor constructor = c.getConstructor(Moveable.class);
        Moveable moveable = (Moveable) constructor.newInstance(new Tank());
        moveable.move();
    }
}

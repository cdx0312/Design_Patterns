package proxy;

import org.apache.commons.io.FileUtils;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by cdx0312
 * 2018/3/25
 */
public class Proxy {

    public static Object newProxyInstance(Class infce, InvocationHandler h) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //创建源码
        String rt = "\r\n";
        String methodStr = "";
        for(Method m : infce.getMethods()){
            methodStr += "	@Override" + rt +
                    "	public void " + m.getName() + "() {" + rt +
                    "  try{" + rt +
                    "  Method md = " + infce.getName() + ".class.getMethod(\""
                    + m.getName() + "\");" + rt +
                    "  h.invoke(this,md);" +rt+
                    "  }catch(Exception e){ e.printStackTrace();}" + rt +
                    "	}" ;
        }

        String str =
                "package proxy;" + rt +
                        "import java.lang.reflect.Method;" + rt +
                        "import proxy.InvocationHandler;" +  rt+
                        "public class $Proxy0 implements " + infce.getName() + " {" + rt +
                        "	public $Proxy0(InvocationHandler h) {" + rt +
                        "		this.h = h;" + rt +
                        "	}" + rt +
                        "  private InvocationHandler h;" + rt+
                        methodStr + rt +
                        "}" ;
        String fileName = System.getProperty("user.dir") + "/out/production/Design_Patterns_new/proxy/$Proxy0.java";
        File file = new File(fileName);
        FileUtils.writeStringToFile(file, str);

        //编译源码
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        Iterable units = fileManager.getJavaFileObjects(fileName);
        //编译任务
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null, null, null, units);
        //执行任务
        task.call();
        fileManager.close();

        //load到内存
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class<?> c = loader.loadClass("proxy.$Proxy0");

        Constructor constructor = c.getConstructor(InvocationHandler.class);
        return constructor.newInstance(h);

    }
}

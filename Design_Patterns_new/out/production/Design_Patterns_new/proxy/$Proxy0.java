package proxy;
import java.lang.reflect.Method;
import proxy.InvocationHandler;
public class $Proxy0 implements proxy.staticProxy.Moveable {
	public $Proxy0(InvocationHandler h) {
		this.h = h;
	}
  private InvocationHandler h;
	@Override
	public void move() {
  try{
  Method md = proxy.staticProxy.Moveable.class.getMethod("move");
  h.invoke(this,md);
  }catch(Exception e){ e.printStackTrace();}
	}
}
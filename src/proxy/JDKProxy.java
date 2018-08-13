package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKProxy implements InvocationHandler {

	private Object target;
	
	JDKProxy(){
		super();
	}
	JDKProxy(Object target){
		super();
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("befor "+ method.getName());
		Object object = method.invoke(target, args);
		System.out.println("after "+ method.getName());
		return object;
	}

}

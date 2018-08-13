package proxy;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class JDKProxyDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		JDKProxy jdkProxy = new JDKProxy(list);
		List<String> proxy = (List<String>)Proxy.newProxyInstance(list.getClass().getClassLoader(), 
				list.getClass().getInterfaces(), jdkProxy);
		proxy.add("first");
		String s = proxy.toString();
		System.out.println(s);
		
	}

}

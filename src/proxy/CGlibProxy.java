package proxy;

/**
 * jdk动态代理是由java内部的反射机制来实现的，cglib动态代理底层则是借助asm来实现的。
 * 
 * Cglib 是一个优秀的动态代理框架，底层使用asm在内存中动态的生成被代理的子类，使用cglib即使被代理的类没有实现任何接口也可以实现动态代理功能。
 * 
 * cglib简单易用，运行速度远快于jdk动态代理
 * cglib可以使用继承和引用两种方式使用，第一种是基于继承的动态代理，可以直接用super调用target方法，但在spring中不支持，因为这样的话，这个target
 * 对象就不能为spring管理。
 * 所以，cglib使用引用的方式代理来达到拦截的效果。
 * 
 * 核心类：
 * net.sf.cglib.proxy.Enhancer主要的增强类
 * net.sf.cglib.proxy.MethodInterceptor – 主要的方法拦截类，它是Callback接口的子接口，需要用户实现
 * net.sf.cglib.proxy.MethodProxy – JDK的java.lang.reflect.Method类的代理类，可以方便的实现对源对象方法的调用,如使用：
 * Object o = methodProxy.invokeSuper(proxy, args);
 * @author cy
 *
 */
public class CGlibProxy{

}

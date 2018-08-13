package singleton;

/**
 * 静态内部类 推荐使用
 * 
 * 该方式和饿汉模式相似，但又不同
 * 两者都采用了类装载机制来保证初始化实例时只有一个线程。不同的地方在于饿汉方式只要singleton类加载就会实例化，没有达到懒加载的目的。
 * 而静态内部类在singleton加载时并不会立即加载，而是在实例化时，调用getInstance方法才会加载singletonHandler，完成实例化
 * @author cuiyao
 *
 */
public class Singleton7 {
	private Singleton7(){}
	
	private static class SingletonHandler{
		private static final Singleton7 INSTANCE = new Singleton7();
	}
	
	public static Singleton7 getInstance(){
		return SingletonHandler.INSTANCE;
	}
}

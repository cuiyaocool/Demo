package singleton;

/**
 * 懒汉式(线程安全，同步方法)[不推荐用]
 * 缺点：
 * 效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
 * 而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。方法进行同步效率太低要改进。
 * @author cy
 *
 */
public class Singleton4 {
	private static Singleton4 singleton;
	private Singleton4() {
		
	}
	public static synchronized Singleton4 getInstance() {
		if (singleton == null) {
            singleton = new Singleton4();
        }
        return singleton;
	}
}

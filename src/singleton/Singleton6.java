package singleton;

/**
 * 双重检查[推荐用] 实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，直接return实例化对象。
 * 
 * 优点：线程安全；延迟加载；效率较高。
 * 
 * @author cuiyao
 *
 */
public class Singleton6 {
	private static volatile Singleton6 instance;

	private Singleton6() {
	}

	public static Singleton6 getInstance() {
		if (instance == null) {
			synchronized (instance.getClass()) {
				if (instance == null) {
					instance = new Singleton6();
				}
			}
		}
		return instance;
	}

}

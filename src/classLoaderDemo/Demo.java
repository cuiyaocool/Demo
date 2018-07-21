package classLoaderDemo;

/**
 * 加载ClassToBeLoad类
 * 在D盘下建一个目录classLoaderDemo,写一个ClassToBeLoad。java,为区别本包中的ClassToBeLoad，写为如下;
 * package classLoaderDemo;
 * public class ClassToBeLoad {
 * 		public ClassToBeLoad() {
 * 			System.out.print("我在D盘");
 * 		}
 * }
 * 并编译产生ClassToBeLoad。class
 * @author cuiyao
 *
 */
public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 定义自定义加载器父类为系统设定的父加载器，即应用加载器
		MyClassLoader myClassLoader = new MyClassLoader("D:/", "自定义加载器1");
		Class<?> clazz = myClassLoader.loadClass("classLoaderDemo.ClassToBeLoad");
		clazz.newInstance();
		//定义自定义加载器，父加载器为上一个加载器
		MyClassLoader myClassLoader2 = new MyClassLoader(myClassLoader, "D:/", "自定义加载器2");
		Class<?> clazz2 = myClassLoader2.loadClass("classLoaderDemo.ClassToBeLoad");
		clazz2.newInstance();
		//定义自定义加载器，父加载器为系统加载器bootstrap
		MyClassLoader myClassLoader3 = new MyClassLoader(null, "D:/", "自定义加载器3");
		Class<?> clazz3 = myClassLoader3.loadClass("classLoaderDemo.ClassToBeLoad");
		clazz3.newInstance();
	}
/**
 * 我在包里sun.misc.Launcher$AppClassLoader@382f3bf0
 * 我在包里sun.misc.Launcher$AppClassLoader@382f3bf0
 * 我在D盘自定义加载器
 */
/**
 * 结果分析：
 * 第一个类加载器的父加载器为系统设定的父加载器，为AppClassLoader，从classPath下加载类，所以加载的是包中的类
 * 第二个类加载器的父加载器为第一个，第一个的父加载器为AppClassLoader，同上，所以结果一样
 * 第三个类加载器的父加载器为bootstrap，加载不到该类，所以从自定义加载器中加载，加载到了D盘预置的类
 */
}

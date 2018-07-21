package classLoaderDemo;

public class ClassToBeLoad {
	public ClassToBeLoad() {
		System.out.println("我在包里" + this.getClass().getClassLoader());
	}
}

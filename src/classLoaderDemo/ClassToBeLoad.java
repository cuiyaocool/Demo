package classLoaderDemo;

public class ClassToBeLoad {
	public ClassToBeLoad() {
		System.out.println("���ڰ���" + this.getClass().getClassLoader());
	}
}

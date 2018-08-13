package singleton;


/**
 * ����ʽ(�̰߳�ȫ��ͬ�������)[������]
 * 
 * ���ڵ�����ʵ�ַ�ʽͬ��Ч��̫�ͣ���������ͬ����������Ϊͬ������ʵ�����ĵĴ���顣��������ͬ�����������߳�ͬ�������á�����3��ʵ�ַ�ʽ����������һ�£�
 * ����һ���߳̽�����if (singleton == null)�ж����飬��δ���ü�����ִ�У���һ���߳�Ҳͨ��������ж���䣬��ʱ���������ʵ����
 * 
 * @author cy
 *
 */
public class Singleton5 {
	private static Singleton5 instance;
	private Singleton5() {}
	public static Singleton5 getInstance() {
		if (instance == null) {
			synchronized (instance.getClass()) {
				instance = new Singleton5();
			}
		}
		return instance;
	}
}

package singleton;
/**
 * ����д������Lazy Loading��Ч��������ֻ���ڵ��߳���ʹ�á�
 * ����ڶ��߳��£�һ���߳̽�����if (singleton == null)�ж����飬
 * ��δ���ü�����ִ�У���һ���߳�Ҳͨ��������ж���䣬��ʱ���������ʵ���������ڶ��̻߳����²���ʹ�����ַ�ʽ��
 * @author cy
 *
 */
public class Singleton3 {
	private static Singleton3 instance;
	private Singleton3(){
		
	}
	public static Singleton3 getInstance(){
		if (instance == null) {
			instance = new Singleton3();
		}
		return instance;
	}
}

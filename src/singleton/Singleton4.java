package singleton;

/**
 * ����ʽ(�̰߳�ȫ��ͬ������)[���Ƽ���]
 * ȱ�㣺
 * Ч��̫���ˣ�ÿ���߳����������ʵ��ʱ��ִ��getInstance()������Ҫ����ͬ����
 * ����ʵ�������ִֻ��һ��ʵ��������͹��ˣ���������ø���ʵ����ֱ��return�����ˡ���������ͬ��Ч��̫��Ҫ�Ľ���
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

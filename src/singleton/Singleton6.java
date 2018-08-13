package singleton;

/**
 * ˫�ؼ��[�Ƽ���] ʵ��������ֻ��ִ��һ�Σ������ٴη���ʱ���ж�if (singleton == null)��ֱ��returnʵ��������
 * 
 * �ŵ㣺�̰߳�ȫ���ӳټ��أ�Ч�ʽϸߡ�
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

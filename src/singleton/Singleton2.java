package singleton;
//����ʽ����̬����飩[����]

/**
 * ���ַ�ʽ������ķ�ʽ��ʵ���ƣ�ֻ��������ʵ�����Ĺ��̷����˾�̬������У�
 * 
 * Ҳ������װ�ص�ʱ�򣬾�ִ�о�̬������еĴ��룬��ʼ�����ʵ������ȱ���������һ���ġ�
 * 
 * @author cy
 *
 */
public class Singleton2 {
	private static Singleton2 instance;
	static{
		instance = new Singleton2();
	}
	private Singleton2(){}
	public Singleton2 getInstance() {
		return instance;
	}
}

package singleton;

/**
 * ��̬�ڲ��� �Ƽ�ʹ��
 * 
 * �÷�ʽ�Ͷ���ģʽ���ƣ����ֲ�ͬ
 * ���߶���������װ�ػ�������֤��ʼ��ʵ��ʱֻ��һ���̡߳���ͬ�ĵط����ڶ�����ʽֻҪsingleton����ؾͻ�ʵ������û�дﵽ�����ص�Ŀ�ġ�
 * ����̬�ڲ�����singleton����ʱ�������������أ�������ʵ����ʱ������getInstance�����Ż����singletonHandler�����ʵ����
 * @author cuiyao
 *
 */
public class Singleton7 {
	private Singleton7(){}
	
	private static class SingletonHandler{
		private static final Singleton7 INSTANCE = new Singleton7();
	}
	
	public static Singleton7 getInstance(){
		return SingletonHandler.INSTANCE;
	}
}

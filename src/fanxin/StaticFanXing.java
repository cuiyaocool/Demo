package fanxin;

public class StaticFanXing<T> {
	/**
	 * �������еľ�̬�����������������ķ��ͣ������Լ�����
	 * 
	 * ����һ�����ͷ����ܼ򵥣�ֻҪ�ڷ�������ǰ�����һ������<K, V>����ʽ������
	 * 
	 * 
	 * @return
	 */
//	public static T staticMethod() {
//		System.out.println("staticMethod");
//	}
	
	public static <M> M staticMethodCorrect(M t) {
		System.out.println("staticMethod");
		M m = null;
		return m;
	}
}

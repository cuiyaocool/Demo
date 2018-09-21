package innerClass;

public class OuterClass {
	private String name;
	public int age;
	public void dispaly() {
		System.out.println(name);
	}
	
	/**
	 * ��Ա�ڲ���Ҳ������ͨ���ڲ��࣬������Χ���һ����Ա��
	 * �������ǿ��������Ƶķ�����Χ������� ��Ա���Ժͷ�����������private�ģ�������Χ��Ҫ�����ڲ���ĳ�Ա���Ժͷ�������Ҫͨ���ڲ���ʵ�������ʡ�
	 * �ڳ�Ա�ڲ�����Ҫע�����㣬
	 * ��һ����Ա�ڲ����в��ܴ����κ�static�ı����ͷ�����
	 * �ڶ�����Ա�ڲ�������������Χ��ģ�����ֻ���ȴ�������Χ����ܹ������ڲ��ࡣ
	 * @author cy
	 *
	 */
	public class InnerClass{
		public InnerClass(){
			name = "Lily";
		}
		void dispaly() {
			OuterClass.this.dispaly();
		}
	}
	/**
	 * �ֲ��ڲ���ͳ�Ա�ڲ���һ�������룬ֻ���������������˸ı䣬��ֻ���ڸ÷����������б�ʹ�ã����˸÷��������Ծͻ�ʧЧ��
	 */
	public void demoMethod() {
		class Inner{
			private String nameString;
			public int age;
			public String getNameString() {
				return nameString;
			}
			
			public int getAge() {
				return age;
			}
			
		}
		Inner inner = new Inner();
		inner.age = 12;
		System.out.println(inner.getAge() + inner.getNameString());
	}
	
	/**
	 * 1�� �����ڲ�����û�з������η��ġ�
	 * 
	 * 2�� new �����ڲ��࣬�����������Ҫ���ڵġ�������ǽ��Ǹ�A�ӿ�ע�͵����ͻ���ֱ������
	 * 
	 * 3��ע��getInnerClass()�������βΣ��β�����final���εģ�
	 * �����Ե����ڷ������β���Ҫ�������ڲ���ʹ�ã���ô����βξͱ���Ϊfinal��
	 * 
	 * 4�� �����ڲ�����û�й��췽���ġ���Ϊ�������ֶ�û�к������췽����
	 * ���ڲ��ಢ����ֱ�ӵ��÷������ݵĲ�����������������Ĺ������Դ���Ĳ������б��ݣ��Լ��ڲ��������õ�ʵ����ʱ�Լ������Զ������ⲿ�������ݽ����Ĳ�����
	 * 
	 * ֱ�����ﻹû�н���Ϊʲô��final�����ڲ����е����Ժ��ⲿ�����Ĳ������ߴ�����Ͽ���ͬһ����������ʵ����ȴ���ǣ��������������ǿ�������仯�ģ�
	 * Ҳ����˵���ڲ������Ҷ����Եĸı䲢����Ӱ�쵽�ⲿ���β�
	 * ����Ȼ��ӳ���Ա�ĽǶ��������ǲ����еģ��Ͼ�վ�ڳ���ĽǶ�������������������ͬһ��������ڲ���ñ���
	 * �����ⲿ�������β�ȴû�иı������������Ͳ��ɽ��ܵģ�����Ϊ�˱��ֲ�����һ���ԣ��͹涨ʹ��final�������βεĲ��ı䡣
	 * 
	 * �������ǣ��������ã�Ϊ�˱�������ֵ�����ı䣬���类�ⲿ��ķ����޸ĵȣ��������ڲ���õ���ֵ��һ�£�������final���ø����ò��ɸı䡣
	 * 
	 * �����������һ�������ڲ��࣬����ϣ����ʹ��һ�����ⲿ����Ĳ�������ô��������Ҫ��ò���������final�ġ�
	 * 
	 * 
	 * @param a
	 * @return
	 */
	public A getA(final int a){
		return new A(){
			@Override
			public int getA() {
				// TODO Auto-generated method stub
				return a;
			}
			
		};//ע�⣺�ֺŲ���ʡ
	}
	
	interface A {
		public abstract int getA();
	}
	
	/**
	 * ��̬�ڲ�����Ǿ�̬�ڲ���֮�����һ��������������֪���Ǿ�̬�ڲ����ڱ������֮��������ر�����һ�����ã���������ָ�򴴽�������Χ�ڣ����Ǿ�̬�ڲ���ȴû�С�û��������þ���ζ�ţ�

      1�� ���Ĵ����ǲ���Ҫ��������Χ��ġ�

      2�� ������ʹ���κ���Χ��ķ�static��Ա�����ͷ�����

	 * @author Administrator
	 *
	 */
	static class staticClass {
		public static int a = 1;
		public void display() {
			System.out.println(a);
		}
	}
	
}

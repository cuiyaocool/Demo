package innerClass;

import innerClass.OuterClass.staticClass;

public class Test {
/**
 * �����ڲ���������Ҫָ�������������ͣ�OuterClasName.InnerClassName��
 * ͬʱ���������Ҫ����ĳ���ڲ�����󣬱���Ҫ�����ⲿ��Ķ���ͨ��.new�������ڲ��ࣺ 
 * OuterClass.InnerClass innerClass = outerClass.new InnerClass();��
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		outerClass.dispaly();
		innerClass.dispaly();
		staticClass aClass = new staticClass();
		aClass.display();
	}

}

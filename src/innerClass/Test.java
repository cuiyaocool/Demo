package innerClass;

import innerClass.OuterClass.staticClass;

public class Test {
/**
 * 引用内部类我们需要指明这个对象的类型：OuterClasName.InnerClassName。
 * 同时如果我们需要创建某个内部类对象，必须要利用外部类的对象通过.new来创建内部类： 
 * OuterClass.InnerClass innerClass = outerClass.new InnerClass();。
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

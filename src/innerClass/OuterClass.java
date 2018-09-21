package innerClass;

public class OuterClass {
	private String name;
	public int age;
	public void dispaly() {
		System.out.println(name);
	}
	
	/**
	 * 成员内部类也是最普通的内部类，它是外围类的一个成员，
	 * 所以他是可以无限制的访问外围类的所有 成员属性和方法，尽管是private的，但是外围类要访问内部类的成员属性和方法则需要通过内部类实例来访问。
	 * 在成员内部类中要注意两点，
	 * 第一：成员内部类中不能存在任何static的变量和方法；
	 * 第二：成员内部类是依附于外围类的，所以只有先创建了外围类才能够创建内部类。
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
	 * 局部内部类和成员内部类一样被编译，只是它的作用域发生了改变，它只能在该方法和属性中被使用，出了该方法和属性就会失效。
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
	 * 1、 匿名内部类是没有访问修饰符的。
	 * 
	 * 2、 new 匿名内部类，这个类首先是要存在的。如果我们将那个A接口注释掉，就会出现编译出错。
	 * 
	 * 3、注意getInnerClass()方法的形参，形参是用final修饰的，
	 * ，所以当所在方法的形参需要被匿名内部类使用，那么这个形参就必须为final。
	 * 
	 * 4、 匿名内部类是没有构造方法的。因为它连名字都没有何来构造方法。
	 * ，内部类并不是直接调用方法传递的参数，而是利用自身的构造器对传入的参数进行备份，自己内部方法调用的实际上时自己的属性而不是外部方法传递进来的参数。
	 * 
	 * 直到这里还没有解释为什么是final？在内部类中的属性和外部方法的参数两者从外表上看是同一个东西，但实际上却不是，所以他们两者是可以任意变化的，
	 * 也就是说在内部类中我对属性的改变并不会影响到外部的形参
	 * ，而然这从程序员的角度来看这是不可行的，毕竟站在程序的角度来看这两个根本就是同一个，如果内部类该变了
	 * ，而外部方法的形参却没有改变这是难以理解和不可接受的，所以为了保持参数的一致性，就规定使用final来避免形参的不改变。
	 * 
	 * 简单理解就是，拷贝引用，为了避免引用值发生改变，例如被外部类的方法修改等，而导致内部类得到的值不一致，于是用final来让该引用不可改变。
	 * 
	 * 故如果定义了一个匿名内部类，并且希望它使用一个其外部定义的参数，那么编译器会要求该参数引用是final的。
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
			
		};//注意：分号不能省
	}
	
	interface A {
		public abstract int getA();
	}
	
	/**
	 * 静态内部类与非静态内部类之间存在一个最大的区别，我们知道非静态内部类在编译完成之后会隐含地保存着一个引用，该引用是指向创建它的外围内，但是静态内部类却没有。没有这个引用就意味着：

      1、 它的创建是不需要依赖于外围类的。

      2、 它不能使用任何外围类的非static成员变量和方法。

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

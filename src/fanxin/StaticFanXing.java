package fanxin;

public class StaticFanXing<T> {
	/**
	 * 泛形类中的静态方法不能用类申明的泛型，必须自己申明
	 * 
	 * 声明一个泛型方法很简单，只要在返回类型前面加上一个类似<K, V>的形式就行了
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

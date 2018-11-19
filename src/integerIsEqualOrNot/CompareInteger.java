package integerIsEqualOrNot;

public class CompareInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		Integer b = Integer.valueOf(1);
		Integer c = Integer.valueOf(1);
		Integer d = new Integer(1);

		System.out.println(b == d);
		System.out.println(b.equals(d));
		System.out.println(b.equals(a));
		System.out.println(a == b);
		System.out.println(b == c);
		System.out.println(b.equals(c));
		System.out.println(c == d);

		/**
		 * false true true true true true false
		 */
	}

}

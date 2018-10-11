package package01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thing[] bags = {new Thing(10, 20),new Thing(30, 10),new Thing(15, 90),new Thing(25, 90)};
		Package01 package01 = new Package01(bags, 24);
		package01.solve();
		System.out.println(package01.getBestValue());
	}

}

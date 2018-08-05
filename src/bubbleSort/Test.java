package bubbleSort;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ts = {3,4,2,1,4,6,3};
		for (int i = 0; i < ts.length; i++) {
			System.out.print(ts[i] + ", ");
		}
		System.out.println();
		BubbleSort.bubbleSort(ts);
		for (int i = 0; i < ts.length; i++) {
			System.out.print(ts[i] + ", ");
		}
	}

}

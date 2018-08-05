package quickSort;

public class Test {
	
	public static void main(String[] args) {
		int ts[] = {4,2,4,6,3,9,7};
		for (int i = 0; i < ts.length; i++) {
			System.out.print(ts[i] + ", ");
		}
		System.out.println();
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(ts, 0, ts.length - 1);
		for (int i = 0; i < ts.length; i++) {
			System.out.print(ts[i] + ", ");
		}
	}
}

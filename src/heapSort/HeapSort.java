package heapSort;

public class HeapSort {
	//对堆的一次调整，即从顶结点一次向下判断。
	public static void Sift(int[] R, int low, int high){
		int i = low;
		int j = 2 * i + 1;
		int temp = R[i];
		while (j <= high) {
			if (j  < high && R[j] < R[j + 1]) {
				j++;
			}
			if (temp < R[j]) {
				R[i] = R[j];
				i = j;
				j = 2 * i + 1;
			}else {
				break;
			}
		}
		R[i] = temp;
	}
	
	public static void heapSort(int[] R){
		int len = R.length;
		for (int i = R.length/2 -1; i >= 0 ; i--) {
			Sift(R, i, len - 1);
		}
		System.out.println();
		System.out.println("首次排序完的堆：");
		for (int i = 0; i < R.length; i++) {
			System.out.print(R[i] + " ");
		}
		for (int i = len - 1; i >= 1; i--) {
			int t = R[0];
			R[0] = R[i];
			R[i] = t;
			//System.out.println(R[i]);
			Sift(R, 0, i - 1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] R = {3,2,5,6,1,9,0,2};
		System.out.println("初始堆：");
		for (int i = 0; i < R.length; i++) {
			System.out.print(R[i] + " ");
		}
		heapSort(R);
		System.out.println();
		System.out.println("最终堆：");
		for (int i = 0; i < R.length; i++) {
			System.out.print(R[i] + " ");
		}
	}

}

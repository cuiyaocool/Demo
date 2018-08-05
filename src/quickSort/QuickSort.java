package quickSort;

/**
 * 无序更好
 * 
 * 在最好情况下，每次划分所取的基准都是当前无序区的"中值"记录，划分的结果是基准的左、右两个无序子区间的长度大致相等。总的关键字比较次数：O(nlgn)
 * 最坏时间为O(n2)，但就平均性能而言，它是基于关键字比较的内部排序算法中速度最快者，快速排序亦因此而得名。它的平均时间复杂度为O(nlgn)。
 * 
 * @author cy
 *
 */
public class QuickSort {
	int[] ts;
	public int[] getTs() {
		return ts;
	}
	public void setTs(int[] ts) {
		this.ts = ts;
	}
	public void quickSort(int[] ts, int start, int end) {
		int low = start;
		int high = end;
		if (ts == null || start < 0 || end >= ts.length || start > end) {
			return;
		}
		int temp  = ts[start];
		while (low < high) {
			while (ts[high] > temp && low < high) {
				high--;
			}
			if (low < high) {
				ts[low] = ts[high];
				low++;
			}
			while (ts[low] < temp && low < high) {
				low++;
			}
			if (low < high) {
				ts[high] = ts[low];
				high--;
			}
		}
		ts[low] = temp;
		quickSort(ts, start, low - 1);
		quickSort(ts, low  + 1, end);
	}
}

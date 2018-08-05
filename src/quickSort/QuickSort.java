package quickSort;

/**
 * �������
 * 
 * ���������£�ÿ�λ�����ȡ�Ļ�׼���ǵ�ǰ��������"��ֵ"��¼�����ֵĽ���ǻ�׼��������������������ĳ��ȴ�����ȡ��ܵĹؼ��ֱȽϴ�����O(nlgn)
 * �ʱ��ΪO(n2)������ƽ�����ܶ��ԣ����ǻ��ڹؼ��ֱȽϵ��ڲ������㷨���ٶ�����ߣ�������������˶�����������ƽ��ʱ�临�Ӷ�ΪO(nlgn)��
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

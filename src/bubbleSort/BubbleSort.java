package bubbleSort;

public class BubbleSort {

	public static void bubbleSort(int nums[]) {
		if (nums == null) {
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			int temp = 0;
            boolean exchange = false;
			for (int j = nums.length - 1; j > 0 ; j--) {
				if (nums[j] < nums[j - 1]) {
					temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
					exchange = true;
				}
			}
			if (!exchange) {
				break;
			}
		}
	}
}

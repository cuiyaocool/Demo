package mergeSort;


public class MergeSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {49,38,65,97,76,13,27};
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		mergeSort(nums);
		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	private static void mergeSort(int[] nums) {
		if (nums == null || nums.length <= 0) {
			return;
		}
		
		Sort(nums, 0, nums.length -1 );
	}

	private static void Sort(int[] nums, int low, int high) {
		if (low == high) {
			return;
		}
		int mid = (low + high)/2;
		if (low < high) {
			Sort(nums, low, mid);
			Sort(nums, mid + 1, high);
			merge(nums, low, high, mid);
		}
	}

	private static void merge(int[] nums, int low, int high, int mid) {
		int[] temp = new int[high - low + 1];
		int i = low;
		int j = mid + 1;
		int k=0;
        // 把较小的数先移到新数组中
        while(i<=mid && j<=high){ 
            if(nums[i]<nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }
        while(i<=mid){
            temp[k++] = nums[i++];
        }
        // 把右边边剩余的数移入数组
        while(j<=high){
            temp[k++] = nums[j++];
        }
       // 把新数组中的数覆盖nums数组
        for(int x=0;x<temp.length;x++){
            nums[x+low] = temp[x];
        }
	}

}

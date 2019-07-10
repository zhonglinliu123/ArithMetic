package sort;

public class Quick {
	// 快速排序
	public void upSort(int[] arr, int start, int end) {
		if(start <= end-1) {
			int p = partition(arr, start, end);
			upSort(arr, start, p-1);
			upSort(arr, p+1, end);
		}
	}
	
	public int partition(int[] arr, int start, int end) {
		int temp = arr[start];
		while(start < end) {
			while(start < end && arr[end] >= temp) {
				end--;
			}
			arr[start] = arr[end];
			
			while(start < end && arr[start] <= temp) {
				start++;
			}
			arr[end] = arr[start];
		}
		arr[start] = temp;
		return start;
	}
}

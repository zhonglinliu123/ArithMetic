package sort;

public class XuanZe {
	//选择排序
	public void upSort(int[] arr) {
		for(int i=0; i<arr.length ; i++) {
			int min = i;
			for(int j=i+1; j<arr.length ; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	
	public void downSort(int[] arr) {
		for(int i=0; i<arr.length ; i++) {
			int min = i;
			for(int j=i+1; j<arr.length ; j++) {
				if(arr[j] > arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
}

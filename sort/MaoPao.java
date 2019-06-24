package sort;

public class MaoPao {
	//冒泡排序
	public void upSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length ;j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public void downSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length ;j++) {
				if(arr[j] > arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
}

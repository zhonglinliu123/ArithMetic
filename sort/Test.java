package sort;

public class Test {
	public static void main(String[] args) {
		int[] arr = new int[] {5,2,9,15,1,22,19,25,95,10,111,255,85,66,7};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
//		MaoPao maopao = new MaoPao();
//		maopao.upSort(arr);
//		maopao.downSort(arr);
		
//		XuanZe xuanze = new XuanZe();
//		xuanze.upSort(arr);
//		xuanze.downSort(arr);
		
//		ChaRu cr = new ChaRu();
//		cr.upSort(arr);
		
		Quick quick = new Quick();
		quick.upSort(arr, 0, arr.length-1);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
}

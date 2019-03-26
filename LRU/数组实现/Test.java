package arrayImp;

public class Test {
	public static void main(String[] arr) {
		ArrayImp arrimp = new ArrayImp();
		arrimp.add("1str");
		arrimp.add("2str");
		arrimp.add("3str");
		arrimp.add("4str");
		arrimp.add("5str");
		arrimp.add("6str");
		arrimp.add("7str");
		arrimp.add("8str");
		arrimp.add("9str");
		arrimp.add("10str");
		arrimp.find(0);
		arrimp.change(1, "qqq");
		arrimp.delete(9);
		arrimp.add("11str");
		arrimp.add("2str");
//		arrimp.add("1str");
//		arrimp.add("2str");
//		arrimp.add("1str");
//		arrimp.add("2str");
		for(int i=0;i<arrimp.taskarr.length;i++) {
			System.out.print(arrimp.taskarr[i]);
		}
	}
}	

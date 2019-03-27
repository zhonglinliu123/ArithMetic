package arrayImp;

public class Test {
	public static void main(String[] arr) {
		Cache cache = new Cache();
		cache.add("1str");
		cache.add("2str");
		cache.add("3str");
		cache.add("4str");
		cache.add("5str");
		cache.add("6str");
		cache.add("7str");
		cache.add("8str");
		cache.add("9str");
		cache.add("10str");
		cache.find(0);
		cache.change(1, "qqq");
		cache.delete(9);
		cache.add("11str");
		cache.add("2str");
//		cache.add("1str");
//		cache.add("2str");
//		cache.add("1str");
//		cache.add("2str");
		for(int i=0;i<cache.taskarr.length;i++) {
			System.out.print(cache.taskarr[i]);
		}
	}
}	

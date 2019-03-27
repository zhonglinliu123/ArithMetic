package listImp;

public class Test {
	public static void main(String[] arr) {
		Cache cache = new Cache(15);
		cache.add("c1");
		cache.add("c2");
		cache.add("c3");
		cache.add("c4");
		cache.add("c5");
		cache.add("c6");
		cache.add("c7");
		cache.add("c8");
		cache.add("c9");
		cache.add("c10");
		cache.find("c8");
		cache.change(9, "9999");
		cache.delete(6);
		cache.add("1111111");
		System.out.println(cache.find(4));
//		cache.find(9);
	//	cache.add("c11");
//		cache.add("c1");
//		cache.add("c1");
//		cache.add("c1");
		cache.bianli();
	}
}	

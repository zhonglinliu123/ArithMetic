package list_and_hashmap_Imp;

public class Test {
	public static void main(String[] arr) {
		Cache cache = new Cache();
		cache.add("T1","v1");
		cache.add("T2","v2");
		cache.add("T3","v3");
		cache.add("T4","v4");
		cache.add("T5","v5");
		cache.add("T6","v6");
		cache.add("T7","v7");
		cache.add("T8","v8");
		cache.add("T9","v9");
		cache.add("T10","v10");
		cache.find("T8");
		cache.change("T9", "9999");
		cache.add("T11","v11");
		cache.delete("T6");
		cache.add("T12","v12");
		System.out.println(cache.find("T5"));
		cache.bianli();
	}
}	

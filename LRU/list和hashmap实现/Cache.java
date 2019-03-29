package list_and_hashmap_Imp;

import java.util.HashMap;

//缓存    根据url  查找value
public class Cache {
	private Task head = null; // 双向链表头结点
	private int capacity;  // 缓存容量
	private int length = 0;
	private HashMap<String,Task> hm = null;
	
	public Cache() {
		hm = new HashMap<String,Task>();   ////map默认容量 16
		capacity = 10;
	}
	public Cache(int capacity) {
		hm=new HashMap<String,Task>(capacity);
		this.capacity = capacity;
	}

	//新增
	public void add(String url,String value) {
		if(head==null) {
			Task task=new Task(url);
			head = task;
			hm.put(url, task);
			this.length++;
			return;
		}
		if(length<capacity) {   //list没满
			Task task=new Task(url);
			hm.put(url, task);
			task.next=head;
			head.previous=task;
			head=task;
			this.length++;
			return;
		}
		// list满了，删除末尾的Task
		Task temp=head;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		temp.next.previous=null;
		temp.next=null;
		// 新结点放入头部
		Task task = new Task(url);
		hm.put(url, task);
		head.previous=task;
		task.next=head;
		head=task;
		this.length++;
	}
	
	// 返回指定url的value
	public String find(String url) {
		String value = null;
		Task task = hm.get(url);
		task.previous.next=task.next;
		task.next.previous=task.previous;
		task.next=head;
		head.previous=task;
		task.previous=null;
		head=task;
		value = task.getValue();
		
		return value;
	}
	
	//修改
	public void change(String url,String value) {
		Task task = hm.get(url);
		task.setValue(value);
		task.previous.next=task.next;
		task.next.previous=task.previous;
		task.next=head;
		head.previous=task;
		task.previous=null;
		head=task;
	}
	//删除
	public void delete(String url) {
		Task task = hm.get(url);
		task.previous.next=task.next;
		task.next.previous=task.previous;
		task.next=null;
		task.previous=null;
		hm.remove(url);
		this.length--;
	}
	//遍历
	public void bianli() {
		Task temp = head;
		while(temp!=null) {
			System.out.print(temp);
			temp=temp.next;
		}
	}
}

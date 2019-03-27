package listImp;

public class Cache {
	private Task head = null; //头结点
	private int capacity = 10;  //默认容量
	private int length = 0;
	
	public Cache() {}
	public Cache(int capacity) {
		this.capacity=capacity;
	}
	public Cache(int capacity,String str) {
		this.capacity=capacity;
		this.head=new Task(str);
		this.length++;
	}	

	//新增
	public void add(String str) {
		if(head==null) {
			head=new Task(str);
			this.length++;
			return;
		}
		if(length<capacity) {   //list没满
			Task task = new Task(str);
			task.next=head;
			head=task;
			this.length++;
			return;
		}
		// list满了，删除末尾的Task
		Task temp=head;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		temp.next=null;
		// 新结点放入头部
		Task task = new Task(str);
		task.next=head;
		head=task;
		this.length++;
	}
	
	//访问指定下标的字符串
	public String find(int i) {
		Task temp = head;
		if(i!=0) {
			Task beforetemp = temp;
			for(int j=0;j<i;j++) {
				beforetemp=temp;
				temp=temp.next;
			}
			beforetemp.next=temp.next;
			temp.next=head;
			head=temp;
		}	
		return head.getValue();
	}
	// 返回指定字符串的下标
	public int find(String str) {
		int f = -1;
		Task temp = head;
		if(str.equals(temp.getValue())) {
			return 0;
		}
		while(temp.next!=null) {
			f++;
			if(str.equals(temp.next.getValue())) {
				Task task = temp.next;
				temp.next=temp.next.next;
				task.next=head;
				head=task;
			}
			temp = temp.next;
		}
		return f;
	}
	//修改
	public void change(int i,String str) {
		Task temp = head;
		if(i!=0) {
			Task beforetemp = temp;
			for(int j=0;j<i;j++) {
				beforetemp=temp;
				temp=temp.next;
			}
			temp.setValue(str);
			beforetemp.next=temp.next;
			temp.next=head;
			head=temp;
		}	
		head.setValue(str);
	}
	//删除
	public void delete(int i) {
		Task temp = head;
		if(i!=0) {
			Task beforetemp = temp;
			for(int j=0;j<i;j++) {
				beforetemp=temp;
				temp=temp.next;
			}
			beforetemp.next=temp.next;
		}	
		head=head.next;
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

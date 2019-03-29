package list_and_hashmap_Imp;

public class Task {
	private String value;
	Task next;
	Task previous;
	
	public Task() {}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	public Task(String value) {
		super();
		this.value = value;
	}

	public String toString() {
		return "["+this.getValue()+"]";
	}
}

package listImp;

public class Task {
	private String value;
	Task next;
	
	public Task() {}
	public Task(String value) {
		super();
		this.value=value;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String toString() {
		return "["+this.getValue()+"]";
	}
}

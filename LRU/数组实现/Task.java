package arrayImp;

public class Task {
	private String value;
	private int number;
	public Task() {}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Task(String value, int number) {
		super();
		this.value = value;
		this.number = number;
	}
	public String toString() {
		return "["+this.getValue()+","+this.getNumber()+"]";
	}
}

package arrayImp;

public class ArrayImp {
	public Task[] taskarr = new Task[10];  //默认是10
	public ArrayImp() {}
	public ArrayImp(int i) {
		 taskarr = new Task[i];
	}
	public void add(String str) {
		for(int i=0;i<taskarr.length;i++) {
			if(taskarr[i]==null) {   //数组没满
				taskarr[i]=new Task(str,0);
				//其他的number++
				for(int j=0;j<taskarr.length;j++) {
					if(j!=i && taskarr[j]!=null) {
						taskarr[j].setNumber(taskarr[j].getNumber()+1);
					}
				}
				return;
			}
		}
		// 数组满了，删除最大的number
		int max = taskarr[0].getNumber();
		int num = 0;
		for(int i=1;i<taskarr.length;i++) {
			if(taskarr[i]!=null && taskarr[i].getNumber()>max) {
				num = i;
				max = taskarr[i].getNumber();
			}
		}
		taskarr[num]=new Task(str,0);
		//其他的number++
		for(int i=0;i<taskarr.length;i++) {
			if(i!=num && taskarr[i]!=null) {
				taskarr[i].setNumber(taskarr[i].getNumber()+1);
			}
		}
	}
	//访问指定下标的字符串
	public String find(int i) {
		String str = null;
		for(int j=0;j<taskarr.length;j++) {
			if(i!=j && taskarr[j]!=null) {
				taskarr[j].setNumber(taskarr[j].getNumber()+1);   //不是i,++
			}else if(i==j && taskarr[i]!=null){
				taskarr[i].setNumber(0);   //将i设置为0
				str=taskarr[i].getValue();
			}
		}
		return str;
	}
	// 返回指定字符串的下标
	public int find(String str) {
		int f = -1;
		for(int i=0;i<taskarr.length;i++) {
			if(taskarr[i]!=null && str.equals(taskarr[i].getValue())) {
				taskarr[i].setNumber(0);   //将i设置为0
				f = i;
			}else if(taskarr[i]!=null && !str.equals(taskarr[i].getValue())){
				taskarr[i].setNumber(taskarr[i].getNumber()+1);   //不是i,++
			}
		}
		return f;
	}
	//修改
	public void change(int i,String str) {
		for(int j=0;j<taskarr.length;j++) {
			if(i!=j && taskarr[j]!=null ) {
				taskarr[j].setNumber(taskarr[j].getNumber()+1);   //不是i,++
			}else {
				taskarr[i]=new Task(str,0);
			}
		}
	}
	//删除
	public void delete(int i) {
		for(int j=0;j<taskarr.length;j++) {
			if(i!=j && taskarr[j]!=null ) {
				taskarr[j].setNumber(taskarr[j].getNumber()+1);   //不是i,++
			}else {
				taskarr[i]=null;  
			}
		}
	}
}

package arrayImp;

public class ArrayImp {
	public Task[] taskarr = new Task[10];  //Ĭ����10
	public ArrayImp() {}
	public ArrayImp(int i) {
		 taskarr = new Task[i];
	}
	public void add(String str) {
		for(int i=0;i<taskarr.length;i++) {
			if(taskarr[i]==null) {   //����û��
				taskarr[i]=new Task(str,0);
				//������number++
				for(int j=0;j<taskarr.length;j++) {
					if(j!=i && taskarr[j]!=null) {
						taskarr[j].setNumber(taskarr[j].getNumber()+1);
					}
				}
				return;
			}
		}
		// �������ˣ�ɾ������number
		int max = taskarr[0].getNumber();
		int num = 0;
		for(int i=1;i<taskarr.length;i++) {
			if(taskarr[i]!=null && taskarr[i].getNumber()>max) {
				num = i;
				max = taskarr[i].getNumber();
			}
		}
		taskarr[num]=new Task(str,0);
		//������number++
		for(int i=0;i<taskarr.length;i++) {
			if(i!=num && taskarr[i]!=null) {
				taskarr[i].setNumber(taskarr[i].getNumber()+1);
			}
		}
	}
	//����ָ���±���ַ���
	public String find(int i) {
		String str = null;
		for(int j=0;j<taskarr.length;j++) {
			if(i!=j && taskarr[j]!=null) {
				taskarr[j].setNumber(taskarr[j].getNumber()+1);   //����i,++
			}else if(i==j && taskarr[i]!=null){
				taskarr[i].setNumber(0);   //��i����Ϊ0
				str=taskarr[i].getValue();
			}
		}
		return str;
	}
	// ����ָ���ַ������±�
	public int find(String str) {
		int f = -1;
		for(int i=0;i<taskarr.length;i++) {
			if(taskarr[i]!=null && str.equals(taskarr[i].getValue())) {
				taskarr[i].setNumber(0);   //��i����Ϊ0
				f = i;
			}else if(taskarr[i]!=null && !str.equals(taskarr[i].getValue())){
				taskarr[i].setNumber(taskarr[i].getNumber()+1);   //����i,++
			}
		}
		return f;
	}
	//�޸�
	public void change(int i,String str) {
		for(int j=0;j<taskarr.length;j++) {
			if(i!=j && taskarr[j]!=null ) {
				taskarr[j].setNumber(taskarr[j].getNumber()+1);   //����i,++
			}else {
				taskarr[i]=new Task(str,0);
			}
		}
	}
	//ɾ��
	public void delete(int i) {
		for(int j=0;j<taskarr.length;j++) {
			if(i!=j && taskarr[j]!=null ) {
				taskarr[j].setNumber(taskarr[j].getNumber()+1);   //����i,++
			}else {
				taskarr[i]=null;  
			}
		}
	}
}

package mum.lesson8List.problem1_personList;



public class MyPersonList {
	private final int INITIAL_LENGTH = 4;
	private Person[] pArr;
	private int size;

	public MyPersonList() {
		pArr = new Person[INITIAL_LENGTH];
		size = 0;
	}
	
	// utility methods
	public void add(Person p) {
		if(size==pArr.length){
			resize();
		}
		pArr[size++] =p;
	}

	public Person get(int i) {
		if(i<0 || i>size) {
			return null;
		}else {
			return pArr[i];
		}
	}

	// need to override equals and hashcode
	public boolean find(Person person) {
		for(Person p:pArr) {
			if(p.equals(person)) {
				return true;
			}
		}
		return false;
	}

	public void insert(Person p, int pos) {
		if(pos>size){
			return;
		}
		if(pos>pArr.length || size+1>pArr.length){
			resize();
		}
		Person[] tempArr = new Person[pArr.length+1];
		System.arraycopy(pArr, 0, tempArr, 0, pos);
		tempArr[pos] = p;
		System.arraycopy(pArr, pos, tempArr, pos+1, pArr.length-pos);
		pArr = tempArr;
		size++;
	}

	public boolean remove(Person p) {
		if(size == 0) {
			return false;
		}
		int index = -1;
		for(int i=0;i<pArr.length;i++) {
			if(pArr[i].equals(p)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			return false;
		}else {
			Person[] tempArr = new Person[pArr.length];
			System.arraycopy(pArr, 0, tempArr, 0, index);
			System.arraycopy(pArr, index+1, tempArr, index, pArr.length-(index+1));
			pArr = tempArr;
			size--;
			return true;
		}
	}

	private void resize() {
		Person[] temp = new Person[pArr.length*2];
		System.arraycopy(pArr, 0, temp, 0, pArr.length);
		pArr = temp;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(pArr[i] + "\n ");
		}
		sb.append(pArr[size - 1] + "]");

		return sb.toString();
	}

	public int size() {
		return size;
	}

}
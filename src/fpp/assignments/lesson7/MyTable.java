package fpp.assignments.lesson7;


public class MyTable {
	Entry[] entries = new Entry[26];
			
	public void add(char c, String s){
		int index = getIndexForChar(c);
		entries[index] = new Entry(c, s);
	}
	
	public String get(char c){
		int index = (int)c-97;
		return entries[index].s;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Entry e: entries){
			if(e!=null){
				sb.append(e);
				sb.append("\n");
			}
		}
		return sb.toString();
	}
	//helper classes
	private int getIndexForChar(char c){
		return (int)c-97;
	}
	
	//inner class
	private class Entry{
		char c;
		String s;
		public Entry(char c, String s) {
			this.c = c;
			this.s = s;
		}
		@Override
		public String toString() {
			return this.c+"->"+this.s;
		}
	}
		
	//main method to test the MyTable
	public static void main(String[] args) {
		MyTable myTable = new MyTable();
		myTable.add('a', "Andrew");
		myTable.add('b',"Billy");
		myTable.add('w',"Willie");
		System.out.println(myTable.get('b'));
		System.out.println(myTable);
	}
}


/*Input and Output:
	
Output:
	Billy
	a->Andrew
	b->Billy
	w->Willie*/
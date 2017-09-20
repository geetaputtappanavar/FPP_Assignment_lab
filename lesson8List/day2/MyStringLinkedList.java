package mum.lesson8List.day2;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}

	public void addFront(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
			Node n = new Node(null, item, header);
			header.previous = n;
			header = n;
		}
	}

	// Implement the code
	public void addLast(String item) {
		Node lastNode =null;
		lastNode = header;
		if(header==null){
			header = new Node(null, item, null);
		}else{
			while(lastNode.next!=null){
				lastNode = lastNode.next;
			}
		}
		Node tempNode = new Node(lastNode, item, null);
		lastNode.next = tempNode;
		
	}

	// implement the code
	public void postAddNode(Node n, String value) {
		Node postNode;
		if(n==null){
			postNode = new Node(null, value, null);
			header = postNode;
		}else if(n.next==null){
			addLast(value);
		}else{
			postNode = new Node(n, value, n.next);
			n.next = postNode;
			n.next.previous = postNode;
		}
	}

	// implement the code

	public int Size() {
		int count =1;
		if(header==null){
			return 0;
		}else{
			for(Node i=header;i.next!=null;i=i.next){
				count++;
			}
		}
		return count;
	}

	// implement code
	public boolean isEmpty() {
		if(header==null){
			return true;
		}else{
			return false;
		}
	}

	public Node getFirst() {
		return header;
	}

	public Node getLast() {
		if(Size()==1){
			return header;
		}else{
			while(header.next!=null){
				header = header.next;
			}
			return header;
		}
	}

	public void removeFirst() {	
		if(header.next==null){
			header = null;
		}else{
			Node temp = header.next;
			header.next.previous = null;
			header = null;
			header = temp;
		}
	}

	public void removeLast() {
		Node temp=null;
		if(header!=null){
			for(Node i=header;i!=null;i=i.next){
				if(i.next==null){
					temp=i;
				}
			}
			temp.previous.next =null;
			temp=null;
		}
	}

	public void printMin() {
		Node min = header;
			Node temp;
			temp = header;
			while(temp!=null){
				if(temp.value.compareTo(min.value)<0){
					min.value = temp.value;
					min = temp;
				}
				temp = temp.next;
			}
		//}
		System.out.println("print min-->"+min);
	}

	public void printMax() {
		Node max = header;
			Node temp;
			temp = header;
			while(temp != null){
				if(temp.value.compareTo(max.value)>0){
					max.value = temp.value;
					max = temp;
				}
				temp = temp.next;
			}
		System.out.println("Print Max-->"+max);
	}

	public void print(Node n) {
		if(n == null){
			return;
		}else{
			System.out.print("--> "+n.value);
			print(n.next);
		}
	}
	
	public void printHelper(){
		print(header);
	}

	public void preAddNode(Node n, String value) {
		Node newNode;
		if (n == null) {
			// List is empty
			newNode = new Node(null, value, null);
		} else if (n.previous == null) {
			// n is the first node
			addFront(value);
		} else {
			newNode = new Node(n.previous, value, n);
			n.previous.next = newNode;
			n.previous = newNode;
		}

	}

	public Node findLast() {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		}
	}

	public Node findItem(String str) {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp != null)
				if (str.equals(temp.value))
					return temp;
				else
					temp = temp.next;
			return null;
		}
	}

	public void deleteNode(Node n) {
		if (header != null && n != null) {
			if (n.next == null && n.previous == null) {
				// only one node
				header = null;
				n = null;
				System.out.println("I am here 1");

				// remove first node
			} else if (n.previous == null) {
				n.next.previous = null;
				header = n.next;
				n = null;
				System.out.println("I am here 2");
			} else if (n.next == null) {
				// remove last node
				n.previous.next = null;
				n = null;
				System.out.println("I am here 3");
			} else {
				// general case
				n.next.previous = n.previous;
				n.previous.next = n.next;
				n = null;
				System.out.println("I am here 4");
			}

		}

	}

	public void deleteList() {
		Node tempOne = header;
		Node tempTwo = header;
		while (tempOne != null) {
			tempOne = tempOne.next;
			tempTwo = null;
			tempTwo = tempOne;
		}
		header = null;
	}

	public String toString() {
		String str = "";
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public void printReverse() {
		String str = "";
		Node temp = findLast();
		while (temp != null) {
			str = str + "==>[" + temp.value.toString() + "]";
			temp = temp.previous;
		}
		str = str + "==>[" + "NULL" + "]";
		System.out.println(str);
	}

	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Carrot Cake");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Apple Pie");
		mySL.addFront("Blueberry Muffin");
		System.out.println(mySL);
		mySL.printReverse();
		
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addLast("Orange Juice");
		System.out.println(mySL);
		mySL.printReverse();
		
		mySL.addLast("Peach Sauce");
		System.out.println(mySL);
		mySL.printReverse();
		System.out.println(mySL);
		mySL.deleteNode(mySL.findItem("Apple Pie"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Peach Sauce"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Carrot Cake"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Blueberry Muffin"), "Carrot Cake1");
		System.out.println(mySL);
		mySL.printReverse();
		System.out.println(mySL.Size());
		System.out.println(mySL.isEmpty());
		System.out.println(mySL.getFirst());
		System.out.println(mySL.getLast());
		System.out.println(mySL);
		mySL.printMin();
		mySL.printMax();
		mySL.removeFirst();
		System.out.println(mySL);
		System.out.println(mySL.getFirst());
		System.out.println(mySL);
		mySL.removeLast();
		System.out.println(mySL);
		mySL.printHelper();
		mySL.preAddNode(mySL.findItem("Blueberry Muffin"), "Apple Pie");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Carrot Cake"), "Danish Delight");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.preAddNode(mySL.findItem("Orange Juice"), "Mango Smoothie");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Orange Juice"), "Peach Sauce");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteList();
		System.out.println(mySL);
		mySL.printReverse();
	}
}

/*Input and Output:
Output:
	-->[NULL]
			==>[NULL]
			-->[Carrot Cake]-->[NULL]
			==>[Carrot Cake]==>[NULL]
			-->[Blueberry Muffin]-->[Apple Pie]-->[Carrot Cake]-->[NULL]
			==>[Carrot Cake]==>[Apple Pie]==>[Blueberry Muffin]==>[NULL]
			-->[Blueberry Muffin]-->[Apple Pie]-->[Carrot Cake]-->[NULL]
			==>[Carrot Cake]==>[Apple Pie]==>[Blueberry Muffin]==>[NULL]
			-->[Blueberry Muffin]-->[Apple Pie]-->[Carrot Cake]-->[Orange Juice]-->[NULL]
			==>[Orange Juice]==>[Carrot Cake]==>[Apple Pie]==>[Blueberry Muffin]==>[NULL]
			-->[Blueberry Muffin]-->[Apple Pie]-->[Carrot Cake]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
			==>[Peach Sauce]==>[Orange Juice]==>[Carrot Cake]==>[Apple Pie]==>[Blueberry Muffin]==>[NULL]
			-->[Blueberry Muffin]-->[Apple Pie]-->[Carrot Cake]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
			I am here 4
			-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
			==>[Peach Sauce]==>[Orange Juice]==>[Carrot Cake]==>[Blueberry Muffin]==>[NULL]
			I am here 3
			-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[NULL]
			==>[Orange Juice]==>[Carrot Cake]==>[Blueberry Muffin]==>[NULL]
			I am here 4
			-->[Blueberry Muffin]-->[Orange Juice]-->[NULL]
			==>[Orange Juice]==>[Blueberry Muffin]==>[NULL]
			-->[Blueberry Muffin]-->[Carrot Cake1]-->[Orange Juice]-->[NULL]
			==>[Orange Juice]==>[Blueberry Muffin]==>[NULL]
			3
			false
			Blueberry Muffin
			Orange Juice
			-->[Orange Juice]-->[NULL]
			print min-->Orange Juice
			Print Max-->Orange Juice
			-->[NULL]
			null
			-->[NULL]
			-->[NULL]
			-->[NULL]
			==>[NULL]
			-->[Danish Delight]-->[NULL]
			==>[Danish Delight]==>[NULL]
			-->[Danish Delight]-->[NULL]
			==>[Danish Delight]==>[NULL]
			-->[Peach Sauce]-->[NULL]
			==>[Peach Sauce]==>[NULL]
			-->[NULL]
			==>[NULL]
*/
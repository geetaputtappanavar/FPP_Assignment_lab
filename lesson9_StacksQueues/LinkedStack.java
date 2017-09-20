package mum.lesson9_StacksQueues;

public class LinkedStack implements Stack1{
	Node top;
	@Override
	public void push(Object ob) {
		Node temp;
		if(top == null){
			top = new Node(null, ob, null);
			
		}else{
			temp = new Node(top, ob, null);
			top.next = temp;
			top = temp;
		}
	}

	@Override
	public Object pop() {
		Node temp = null;
		if(top == null){
			System.out.println("Stack is empty");
		}else{
			temp = top;
			top.previous.next = null;
			top = top.previous;
		}
		return temp.data;
	}

	@Override
	public Object peek() {	
		return top.data;
	}

	@Override
	public boolean isEmpty() {
		if(top==null){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public int size() {
		int count = 1;
		while(top.previous!=null){
			count++;
			top = top.previous;
		}
		return count;
	}

	public void print(){
		Node temp = top;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.previous;
		}
	}
	class Node{
		Node previous;
		Object data;
		Node next;
		
		public Node(Node previous, Object data, Node next) {
			this.previous = previous;
			this.data = data;
			this.next = next;
		}
	}
	
	public static void main(String[] args) {
		LinkedStack stack = new LinkedStack();
		stack.push("Radha");
		stack.push("Radh");
		stack.push("Rad");
		stack.push("Ra");
		System.out.println("----push-----");
		stack.print();
		System.out.println("\npopped value: "+stack.pop());
		System.out.println("\nstack after pop up:");
		stack.print();
		System.out.println("\nPeek: "+stack.peek());
		System.out.println("\nsize: "+stack.size());
	}
}

/*Input and Output:
Output:
	----push-----
	Ra
	Rad
	Radh
	Radha

	popped value: Ra

	stack after pop up:
	Rad
	Radh
	Radha

	Peek: Rad

	size: 3
*/
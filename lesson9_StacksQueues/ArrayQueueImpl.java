package mum.lesson9_StacksQueues;


public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	private int size =0;
	
	public int peek() {
		return arr[front];
	}

	public void enqueue(int obj) {
		if(size == arr.length){
			resize();
		}
		if(front == -1){
			arr[0]=obj;
			front++;
			size++;
		}else{
			arr[rear+1]=obj;
			rear++;
			size++;
		}
	}

	public int dequeue() {
		if(front==-1){
			System.out.println("Queue is Empty");
			return -1;
		}else if(front == rear){
			front = -1;
			rear = 0;
			size--;
			return arr[front];
		}else{
			front++;
			size--;
			return arr[front];
		}
		
	}

	public boolean isEmpty() {
		if(arr.length == 0){
			return true;
		}
		return false;
	}

	public int size() {
		return size;
	}

	private void resize() {
		int[] tempArr = new int[arr.length*2];
		System.arraycopy(arr, 0, tempArr, 0, arr.length);
		arr = tempArr;
	}
	
	public void printQ() {
		for(int i= front;i<=rear;i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		ArrayQueueImpl intQ = new ArrayQueueImpl();
		intQ.enqueue(12);
		intQ.enqueue(13);
		intQ.enqueue(14);
		intQ.enqueue(12);
		intQ.enqueue(13);
		intQ.enqueue(14);
		System.out.println("-----Enqueue----");
		intQ.printQ();
		System.out.println("\nDequeued element: "+intQ.dequeue());
		System.out.println("\n--- after Dequeue---");
		intQ.printQ();
		System.out.println("\n--- isEmpty ---"+intQ.isEmpty());
		System.out.println("\n---size---"+intQ.size());
	}
}

/*Input and Output:

Output:
	-----Enqueue----
	12
	13
	14
	12
	13
	14

	Dequeued element: 13

	--- after Dequeue---
	13
	14
	12
	13
	14

	--- isEmpty ---false

	---size---5
*/

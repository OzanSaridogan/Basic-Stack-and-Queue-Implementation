
public class Stack {

	int top;
	int capacity;
	int [] stack;
	
	Stack(int size){
		top=-1;
		this.capacity=size;
		stack = new int[capacity];
		
	}
	
	public void push(int data) {
		if(top==capacity-1) {
			System.out.println("overflow");
			
			
		}
		else {
			top++;
			stack[top]=data;
			
			
			
		}
	}
	
	public int pop() {
		if(top<0) {
			System.out.println("underflow");
			return 0;
		}
		else {
			
			int element = stack[top];
			top--;
			System.out.println("blok çalýþtý");
			return element;
		}
	}
}


public class Queue {

	String queve[];
	int capacity,first,last,currentSize;
	
	Queue(int capacity){
		queve = new String[capacity];
		first = 0;
		last=-1;
		currentSize=0;
		this.capacity=capacity;
		
	}
	
	boolean isEmpty() {
		return currentSize==0;
	}
	
	boolean isFull() {
		return currentSize==capacity;
	}
	
	void enqueve(String data) {
		if(isFull()) {
			System.out.println("overflow");
		}
		else {
			System.out.println("ekleniyor");
			last+=1;
			queve[last]=data;
			currentSize++;
			System.out.println("adam");
		}
	}
	void dequeve() {
		if(isEmpty()) {
			System.out.println("underflow");
		}
		else {
			System.out.println("çýkarýlýyor");
			first+=1;
			currentSize--;
			
		}
	}
	
}

package chapter17.Stack_Queue;

import java.util.ArrayList;

class myQueue{
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		
		if(len == 0) {
			System.out.println("큐가 비어 있습니다.");
			return null;
		}
		return (arrayQueue.remove(0)); //stack 과 다르게 input = output 순서 동일 => 0번 인덱스가 빠지만 1번이 0번으로 당겨지기 때문에 결국 다 빠짐
	}
}

public class QueueTest1 {

	public static void main(String[] args) {
		myQueue queue = new myQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
	}
	
	
	
}

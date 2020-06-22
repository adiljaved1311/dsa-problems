package stackQues;
import java.util.*;
public class StackUsingQueue {

	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<>();
		q1.add(10);
		q1.add(20);
		System.out.println(q1.element());
	}
}

class StackByQueue{
	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();
	
	public void push(int x) {
		q1.add(x);
	}
}

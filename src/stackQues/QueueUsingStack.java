package stackQues;
import java.util.*;
public class QueueUsingStack {

	public static void main(String[] args) {
		QueueByStack q1 = new QueueByStack();
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		q1.enqueue(50);
		System.out.println(q1.dequeue());
	}
}

class QueueByStack{
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	public void enqueue(int x)
	{
		s1.push(x);
	}
	public int dequeue()
	{
		if(s2.isEmpty())
		{
			if(s1.isEmpty())
			{
				return -1;
			}else
			{
				while(! s1.isEmpty())
				{
					s2.push(s1.pop());
				}
				return s2.pop();
			}
		}
		return s2.pop();
	}
	// Get the front element
	 public int front() {
	        if(s2.isEmpty()){
	            if(s1.isEmpty()){
	                return -1;
	            }else{
	                while(!s1.isEmpty()){
	                    s2.push(s1.pop());
	                }
	                return s2.peek();
	            }
	        }
	        return s2.peek();
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        if(s1.isEmpty() && s2.isEmpty())
	            return true;
	        return false;
	    }
}
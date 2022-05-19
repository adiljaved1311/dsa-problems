package companies.serviceNow;

import java.util.*;

/*
Need to implement a Queue using a Stack.
Only one stack can be used and no other extra space should be used.
 */
public class QueueUsingStack {
    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();

    public void enqueue(int num){
        stack1.push(num);
    }
    public void dequeue(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int ans = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }
}

package stack;

public class ArrayStack {

	public static void main(String[] args) 
	{
		Stack st = new Stack(4);
		st.push(10);
		st.push(20);
		//st.traverse();
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}

class Stack
{
    int size;
    int stack[];
	public Stack(int n)
	{
		size = n;
	    stack = new int[size];
	}
	public Stack()
	{
		size = 10;
		stack = new int[10];
	}
	
	int top = -1;
	
	public void push(int num)
	{
		if(top == (size-1) )
		{
			System.out.println("stack is Full");
		}else 
		{
			top++;
			stack[top] = num;
		}
	}
	public int pop()
	{
		if(top == -1)
		{
			//System.out.println("Stack is empty");
			throw new RuntimeException("Stack is empty");
		}else
		{
			//System.out.println("Element poped : "+stack[top]);
			return stack[top--];
		}
	}
	public void traverse()
	{
		if(top == -1)
		{
			System.out.println("No Elements to traverse");
		}else
		{
			for(int i=top; i>=0; i--)
			{
				System.out.println(stack[i]);
			}
		}
	}
}


package stack;

public class ArrayStack {

	public static void main(String[] args) 
	{
		Stack st = new Stack(4);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.pop();
		st.push(50);
		st.traverse();
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
	public void pop()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
		}else
		{
			System.out.println("Element poped : "+stack[top]);
			top--;
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


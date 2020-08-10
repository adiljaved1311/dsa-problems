package stack;

public class LinkedStack 
{
	public static void main(String[] args) 
	{
		StackL s = new StackL();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop());
		s.traverse();
	}
}

class StackL
{
	Node top;
	public void push(int num)
	{
		Node node = new Node();
		node.num = num;
		if(top == null )
		{
			top = node;
		}else
		{
			node.next = top;
			top = node; 
		}
	}
	public int pop()
	{
		int popElement;
		if(top == null)
		{
			throw new RuntimeException("Stack is empty");
		}else
		{
			if(top.next == null)
			{
				popElement = top.num;
				top = null;
			}else
			{
				popElement = top.num;
				Node pos = top.next;
				top.next = null;
				top = pos;
			}
			return popElement;
		}
	}
	public void traverse()
	{
		Node pos = top;
	
		while(pos != null)
		{
			System.out.println(pos.num);
			pos = pos.next;
		}
	}
}
class Node
{
	int num;
	Node next;
}
package stack;

public class LinkedStack 
{
	public static void main(String[] args) 
	{
		StackL s = new StackL();
		s.push(10);
		s.push(20);
		s.push(30);
		s.pop();
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
	public void pop()
	{
		if(top == null)
		{
			System.out.println("stack is empty");
		}else
		{
			if(top.next == null)
			{
				top =null;
			}else
			{
				Node pos = top.next;
				top.next = null;
				top = pos;
			}
		}
	}
	public void traverse()
	{
		Node pos = top;
		System.out.println("Elements");
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
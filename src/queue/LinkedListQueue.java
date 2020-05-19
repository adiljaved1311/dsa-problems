package queue;

public class LinkedListQueue {

	public static void main(String[] args) 
	{
		LinkedQueue lq = new LinkedQueue();
		lq.dequeue();
		lq.enqueue(10);
		lq.traverse();
	}
}
class LinkedQueue
{
	private Node head;
	private Node tail;
	private class Node
	{
		int data;
		Node next;
	}
	public void enqueue(int num)
	{
		Node node = new Node();
		node.data = num;
		if(head == null)
		{
			head = node;
			tail = node;
		}else
		{
			tail.next = node;
			tail = node;
		}
	}
	public void dequeue()
	{
		if(head == null)
		{
			System.out.println("Queue is empty");
		}else
		{
		if(head.next == null)
		{
			System.out.println("Element dequeue : "+ head.data);
			head = null;
			tail = null;
		}else
		{
			System.out.println("Element dequeue : "+head.data);
			Node pos = head;
			head = pos.next;
			pos.next = null;
		}
		}
	}
	public void traverse()
	{
		Node pos = head;
		while(pos != null)
		{
			System.out.println(pos.data);
			pos = pos.next;
		}
	}
}

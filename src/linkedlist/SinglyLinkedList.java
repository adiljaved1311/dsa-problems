package linkedlist;

import java.util.Stack;
class Node 
{
	Node next;
	int num;
}
public class SinglyLinkedList 
{
	public Node head;
	private Node end;
	private int size;
	
	public void addAtEnd(int num)
	{
		Node node = new Node();
		node.num = num;
		if(head == null)
		{
			head = node;
			end = node;
		}else
		{
			end.next = node;
			end = node;
		}
	}
	
	public void addAtBegin(int num)
	{
		Node node = new Node();
		node.num = num;
		if(head == null)
		{
			head = node;
			end = node;
		}else
		{
			node.next = head;
			head = node;
		}
	}
	
	public void addAtPosition(int num, int index)
	{
		Node node = new Node();
		node.num = num;
		Node pos = head;
		for(int i=1; i<=index-2;i++)   // if index start from 0 then start i = 0
		{
			pos = pos.next;
		}
		node.next = pos.next;
		pos.next = node;
	}
	
	public void traverse()
	{
		Node pos = head;
		while(pos != null)
		{
			System.out.print(pos.num+" -> ");
			pos = pos.next;
		}
		System.out.println();
	}
	
	public void deleteAtEnd()
	{
		if(head == null || head.next == null)
		{
			head = end = null;
		}else
		{
			Node pos = head;
			while(pos.next != end)
			{
				pos = pos.next;
			}
			pos.next = null;
			end = pos;
		}
	}
	
	public void deleteAtBegin()
	{
		if(head.next == null)
		{
			head = end = null;
		}else
		{
			Node pos = head.next;
			head.next = null;
			head = pos;
		}
	}
	
	public void deleteAtPosition(int index)
	{
		Node pos = head;
		Node prev = null;
		for(int i=1; i<=index-2; i++)
		{
			pos = pos.next;
		}
		prev = pos.next;
		pos.next = prev.next;
		prev.next = null;
	}
	
	public void reverse()
	{
		Node pos = head;
		Node prev = null;
		Node current = null;
		while(pos != null)
		{
			current = pos;
			pos = pos.next;
			current.next = prev;
			prev = current;
		}
		head = current;
	}
	
	public void size()
	{
		Node pos = head;
		int count = 0;
		while(pos != null)
		{
			count++;
			pos = pos.next;
		}
		size = count;
		System.out.println("Size = "+count);
	}
	
	public void middleBySize()
	{
		int mid;
		if(size %2 == 0)
		{
			mid = size/2;
		}else
		{
			mid = (size/2)+1;
		}
		Node pos = head;
		for(int i=1; i<mid; i++)
		{
			pos = pos.next;
		}
		System.out.println("Middle Element : "+pos.num);
	}
	
	public void middleBy2P()
	{
		Node slow = head;
		Node fast = head;
		while(fast.next != null)
		{
			fast = fast.next;
			if(fast.next == null)
				break;
			fast = fast.next;
			slow = slow.next;
		}
		System.out.println("Middle Element : "+slow.num);
	}
	
	public boolean palindromeStack()
	{
		Stack<Integer> st = new Stack<>();
		Node pos = head;
		while(pos != null)
		{
			st.add(0,pos.num);
			pos = pos.next;
		}
		Node prev = head;
		int i=0;
		while(prev != null)
		{
			if(prev.num != st.get(i))
			{
				return false;
			}
			prev = prev.next;
			i++;
		}
		return true;
	}
	
	public boolean palindromeReverse(SinglyLinkedList list)
	{
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null)
		{
			fast = fast.next.next;
			slow = slow.next;
		}
		
		fast = head;
		slow = reversed(slow);
		
		while(slow != null)
		{
			if(slow.num != fast.num)
				return false;
			slow = slow.next;
			fast = fast.next;
		}
		return true;
	}
	private Node reversed(Node head)
	{
		Node pos = head;
		Node prev = null;
		Node current = null;
		while(pos != null)
		{
			current = pos;
			pos = pos.next;
			current.next = prev;
			prev = current;
		}
		head = current;
		return head;
	}
	
	public void removeFromLast1(int n)   // Two Pass Algorithm
	{
		Node dummy = new Node();
        dummy.next = head;
        Node pos = head;
        int length = 0;
        while(pos != null)
        {
            length++;
            pos = pos.next;
        }
        length = length - n;
        pos = dummy;
        while(length > 0)
        {
            pos = pos.next;
            length--;
        }
        pos.next = pos.next.next;
	}
	public void removeFromLast2(int n)   // One pass Algorithm
	{
		Node dummy = new Node();
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;
        for(int i=1; i<=n+1; i++)
        {
            first = first.next;
        }
        while(first != null)
        {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
	}
	
	public void printReverseRec()
	{
		printReverseRecurrsion(head);
		System.out.println();
	}
	
	private void printReverseRecurrsion(Node pos)    // 1->2->5->4->null
	{
		if(pos == null)
			return;
		else
		{
			printReverseRecurrsion(pos.next);
			System.out.print(pos.num+"-> ");
		}
	}
	
	public void printReverseStack()
	{
		Stack<Integer> st = new Stack<>();
		Node pos = head;
		while(pos != null)
		{
			st.push(pos.num);
			pos = pos.next;
		}
		while( ! st.isEmpty())
		{
			System.out.print(st.pop()+"-> ");
		}
		System.out.println();
	}
	
	public boolean isSorted() {
		Node pos = head;
		if(head.next == null)
			return true;
		//int x = -2147483648;
		while(pos.next != null) {
			if(pos.num >= pos.next.num) {
				return false;
			}
			pos = pos.next;
		}
		return true;
	}
	
	public void halfList() {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		Node pos = slow;
		Node current = null;
		Node prev = null;
		while(pos != null) {
			current = pos;
			pos = pos.next;
			current.next = prev;
			prev = current;
		}
		pos = current;
		fast = head;
		while(fast != null)
		{
			System.out.print(fast.num+"-> ");
			fast = fast.next;
		}
		System.out.println();
		while(pos != null)
		{
			System.out.print(pos.num+"-> ");
			pos = pos.next;
		}
		System.out.println();
	}
}













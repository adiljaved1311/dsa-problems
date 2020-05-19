package linkedlist;

public class Runner 
{
	public static void main(String[] args) 
	{
		SinglyLinkedList list = new SinglyLinkedList();
		list.addAtEnd(10);
		list.addAtEnd(20);
		list.addAtEnd(30);
		list.addAtEnd(40);
		//list.addAtEnd(50);
		list.traverse();
		list.printReverseRec();
		list.printReverseStack();
		System.out.println(list.isSorted());
		
	}

}

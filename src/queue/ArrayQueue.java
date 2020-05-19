package queue;

class Queue
{
	int front = -1;   // remove
	int rear = -1;    // add 
	int queue[];
	public Queue(int size)
	{
		queue = new int[size];
	}
	public void enqueue(int num)
	{
		if(rear != queue.length-1)
		{
			if(front == -1)
			{
				front = rear = 0;
			}else
			{
				rear++;
			}
			queue[rear] = num;
		}else
		{
			System.out.println("Queue is full");
		}
	}
	public void dequeue()
	{
		if(front != -1)
		{
			System.out.println("Element dequeue "+queue[front++]);
		}else
		{
			System.out.println("Queue is empty");
		}
	}
	public void show()
	{
		if(front != -1)
		{
			for(int i=front; i<=rear; i++)
			{
				System.out.println(queue[i]);
			}
		}else
		{
			System.out.println("Queue is empty");
		}
	}
}

public class ArrayQueue {

	public static void main(String[] args) 
	{
		Queue q = new Queue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.show();
		q.dequeue();
		q.show();
		q.enqueue(60);
		
	}
}

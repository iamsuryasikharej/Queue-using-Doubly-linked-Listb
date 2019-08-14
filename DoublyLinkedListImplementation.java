class DoublyLinkedListImplementation
{
	public static void main(String[] args) {
			/*
		DoublyLinkedlist dl=new DoublyLinkedlist();
		dl.addAtFirst(1);
		dl.addAtFirst(2);
		System.out.println("showStartingFromRear");
		dl.showStartingFromRear();
		System.out.println("showStartingFromRFront");
		dl.showStartingFromRFront();
		dl.addAtrear(171);
		System.out.println("showing starting from front");
		dl.showStartingFromRFront();
		dl.removeFromFront();
		dl.removeFromFront();
		dl.showStartingFromRFront();
	
				test here
		*/

		


	}

}

class DoublyLinkedlist
{
	Node front;
	Node rear;
	public void addAtFirst(int elem)
	{
		Node obj=new Node(elem);
		if(front==null)
		{
			front=obj;
			rear=obj;
			System.out.println("this code 1");
		}
		else
		{
			System.out.println("this code 2");
			Node temp=front;
			front=obj;
			front.next=temp;
			temp.previous=front;
			if(temp.next==null)
			{
				rear=temp;
			}

		}

	}

	public void addAtrear(int elem)
	{
		Node obj=new Node(elem);
		if(front==null)
		{
			System.out.println("1");
			front=obj;
			rear=obj;
			System.out.println("this code 1");
		}
		else
		{
			Node temp=rear;
			rear=obj;
			temp.next=obj;
			rear.previous=temp;


		}

	}

	public void removeFromEnd()
	{
		Node temp=rear;
		rear=temp.previous;
		System.out.println("removed"+temp.elem);
		rear.next=null;

	}
	public void removeFromFront()
	{
		Node temp=front;
		front=temp.next;
		System.out.println("removed"+temp.elem);
		front.previous=null;
	}





	public void showStartingFromRear()
	{
		Node temp=rear;
		while(temp.previous!=null)
		{
			System.out.println(temp.elem);
			temp=temp.previous;
		}
		System.out.println(temp.elem);
	}
	public void showStartingFromRFront()
	{
		Node temp=front;
		while(temp.next!=null)
		{
			System.out.println(temp.elem);
			temp=temp.next;
		}
		System.out.println(temp.elem);
	}

}

class Node
{
	Node previous;
	int elem;
	Node next;
	Node(int elem)
	{
		this.elem=elem;
	}
}
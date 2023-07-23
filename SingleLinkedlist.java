import java.util.*;
class Link
{
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data =data;
			next = null;
		}
	}
	static Node head = null; 
	static Node tail = null;

	void addNode(int data)
	{
		Node newnode= new Node(data);
		if(head == null)
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			tail.next = newnode;
			tail = newnode;				
		}
	}
	
	void create(Scanner sc)
	{
		System.out.println("Enter -99 to end ");
		System.out.print("Enter the number :");
		int data = sc.nextInt();
		while(data != -99)
		{
			addNode(data);
			System.out.print("Enter the number :");
			data =sc.nextInt();
		}
	}


	void insert(Scanner sc)
	{
		System.out.println("Enter the number");
		int data = sc.nextInt();
		System.out.println("Choose the position to insert :");
		System.out.println("1.At beginning \n2.At the End \n3.At Specific position ");
		int ch = sc.nextInt();
		
		switch(ch)
		{
			case 1:
				insertAtBeginning(data);
				break;
			case 2:
				insertAtEnd(data);
				break;
			case 3:
				System.out.println("Enter the position :");
				int pos = sc.nextInt();
				insertAtposition(data,pos);
				break;
			default:
				System.out.println("Invalid!");
				break;
		}
	}

	void insertAtBeginning(int data)
	{
		Node newnode = new Node(data);
		newnode.next = head ;
		head = newnode;
	}
	void insertAtEnd(int data)
	{
		addNode(data);
	}
	void  insertAtposition(int data ,int pos)
	{
		Node temp = head ;
		if(pos == 1)
		{
			insertAtBeginning(data);
		}
		else
		{
			Node newnode = new Node(data);
			for(int i = 1; i<pos-1;i++)
			{
				temp = temp.next;
			}
			newnode.next = temp.next;
			temp.next = newnode;
		}
	}


	void delete(Scanner sc)
	{
		if(head == null)
		{
			System.out.println("List is Empty ");
		}
		else
		{	
			System.out.println("Choose the position to delete :");
			System.out.println("1.At beginning \n 2.At the End \n 3.At Specific position ");
			int ch = sc.nextInt();
		
			switch(ch)
			{
				case 1:
					deleteAtBeginning();
					break;
				case 2:
					deleteAtEnd();
					break;
				case 3:
					System.out.print("Enter the position :");
					int pos = sc.nextInt();
					deleteAtPosition(pos);
					break;
				default:
					System.out.println("Invalid!");
					break;
			}
		}
	}

	void deleteAtBeginning()
	{	Node temp = head;
		head = head.next;
		System.out.println("Removed data :"+temp.data);
		temp.next = null ;
	}
	void deleteAtEnd()
	{
		Node temp = head;
		if(temp.next == null)
		{		
			deleteAtBeginning();
		}
		else
		{
			while(temp.next.next != null)
			{
				temp = temp.next;
			}
			System.out.println("Removed data :"+temp.next.data);
			temp.next =null;
		}
	}
	void deleteAtPosition(int pos)
	{
		Node temp = head;
		if(pos == 1)
		{
			deleteAtBeginning();
		}
		else
		{	
			for( int i=1; i<(pos-1);i++)
			{
				temp = temp.next;	
			}
			System.out.println("Removed data :"+temp.next.data);
			temp.next = temp.next.next;
		}	

	}


	void display()
	{
		Node temp = head;
		if(temp == null)
		{
			System.out.println("List is Empty ");
		}
		else
		{
			System.out.println("Displaying the list ");
			while(temp.next != null)
			{
				System.out.print(temp.data+"->");
				temp = temp.next ;	
			}
			System.out.println(temp.data+".");
		}
	}

	
}


public class SingleLinkedlist
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Link ob = new Link();
		ob.create(sc);
		
		while(true)
		{
			System.out.println("********MENU********");
			System.out.println("1.insert \n2.delete \n3.display \n4.exit ");
			System.out.print("Choose a number : ");
			int ch= sc.nextInt();

			switch(ch)
			{
				case 1:
    					ob.insert(sc);
					break;
				case 2:
					ob.delete(sc);
					break;
				case 3:
					ob.display();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid !");
					break;
			}
		}
	}
}
					


			

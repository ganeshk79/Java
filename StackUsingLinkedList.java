import java.util.Scanner;
class Stack
{
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.next =null;
			this.data = data;
		}
		
	}
	Node top = null;
	void push(int x)
	{
		Node newNode = new Node(x);
		if(top==null)
		{
			top = newNode;
		}
		else
		{
			newNode.next=top;
			top = newNode;
		}
		
	}
	void pop()
	{
	
		if(top==null)
		{
			System.out.println("Underflow!...");
		}
		else
		{
			System.out.println("Removed data:"+top.data);
			top=top.next;
		}
		
	}
	void display()
	{
		Node temp=top;
		if(temp!=null)
		{
			while(temp.next!=null)
			{
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
		System.out.println(temp.data+".");
		}
		else
		{
			System.out.println("Stack is empty.");
		}
}
	
	void peek()
	{
	
		if(top==null)
		{
			System.out.println("Underflow!...");
		}
		else
		{
			System.out.println("Peek data:"+top.data);
			
		}
		
	}
	void isEmpty()
	{
	
		if(top==null)
		{
			System.out.println("YES!Stack is empty.");
		}
		else
		{
			System.out.println("NO!Stack is not empty");	
		}
		
	}
	
}
public class StackLinkedlist {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Stack s = new Stack();
			boolean  wait= true;
			while(wait)
			{
				System.out.println("*******Menu*******");
				System.out.println("1.push \n 2.pop \n 3.display \n 4.peek \n 5.isEmpty \n 6.exit");
				System.out.println("Enter your choice");
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter the number");
					int x=sc.nextInt();
					s.push(x);
					break;
				case 2:
					s.pop();
					break;
				case 3:
					s.display();
					break;
				case 4:
					s.peek();
					break;
				case 5:
					s.isEmpty();
					break;
				case 6:
					System.out.println("Exiting ....");
						wait=false;
					break;
				default:
					System.out.println("Invalid! Enter a valid number");
					break;
					
				
				}
			}
		}

	}

}

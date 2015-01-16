
public class Stacks {

}



class Node
{
String val;
Node next;

Node(String val)
{
this.val=val;
}

}



class Stack
{
	Node top;

	public void push(String val)
	{
		Node n= new Node(val);
		
		if(top==null)
			top=n;
		else
			n.next=top;
			top=n;
	}
	
	public Node pop()
	{
		if(top==null)
			return null;
		else
		{
			Node n=top;
			top=top.next;
			return n;
		}
		
	}
	
	public Node peek()
	{
		Node n=top;
		return n;
	}
	

}


class LinkedList
{

	Node start;

	public void addNode(Node n)
	{
		if(start==null)
			start=n;
		else
		{
			Node temp=start;
			while(temp.next!=null)
				temp=temp.next;
			
			temp.next=n;
		}
	}
	
	public void deleteNode(String val)
	{
		boolean flag=false;
		if(start==null)
			System.out.println("No nodes");
		else
		{
			
			if(start.val.equals(val))
				{
					start=start.next;
					flag=true;
				}
			Node temp=start;
			
			Node prev=temp;
			temp=temp.next;
			
			while(temp!=null && flag==false)
			{
					if(temp.val.equals(val))
					{
						prev.next=temp.next;
						temp.next=null;
						flag=true;
						
					}
				
			}
			
			if(flag==true)
				System.out.println("Node deleted");
			else
				System.out.println("No nodes found");
		}
		
		
	}


}
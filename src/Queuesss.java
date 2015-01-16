/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Queuesss
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Queuess q=new Queuess();
		q.offer(6);
		q.offer(2);
		q.offer(9);
		q.offer(13);
		
//		Node_ss temp=q.head;
//		
//		while(temp!=null)
//		{
//			System.out.print(temp.data+",");
//			temp=temp.next;
//		}
//		
//		System.out.println();
		
		Iterator<Node_ss> i = q.iterator();
		
		while(i.hasNext())
		{
			Node_ss temp=i.next();
			System.out.print(temp.data+",");
		}
		
		System.out.println();
		
		q.poll();
		q.poll();
		
		Iterator<Node_ss> j = q.iterator();
		
		while(j.hasNext())
		{
			Node_ss temp=j.next();
			System.out.print(temp.data+",");
		}
		
		System.out.println();
		
//		while(temp!=null)
//		{
//			System.out.print(temp.data+",");
//			temp=temp.next;
//		}
//		
//		System.out.println();
//		
//		
	}
}

class Node_ss
{
	public int data;
	public Node_ss next;
	
	Node_ss()
	{
			
	}
	
	Node_ss(int d)
	{
		data=d;
	}
	
}

class NodeIterator implements Iterator<Node_ss>
{
	Queuess q;
	Node_ss temp;
	NodeIterator(Queuess q)
	{
		this.q=q;
		temp=this.q.head;
	}
	
	public Node_ss next()
	{
		Node_ss t=temp;
		temp=temp.next;
		return t;
	}
	
	public boolean hasNext(){
		return temp!=null;
	}
	
	public void remove()
	{
		
	}
	
}

class Queuess implements Iterable<Node_ss>
{
	int count=0;
	Node_ss head;
	Node_ss tail;
	
	
	public Iterator<Node_ss> iterator()
	{
		return new NodeIterator(this);
	}
	
	public void offer(int data)
	{
		count++;
		Node_ss n=new Node_ss(data);
		
		if(head==null)
		{
			head=n;
			tail=n;
		}
		else
		{
			tail.next=n;
			tail=n;
		}
	}
	
	public Node_ss poll()
	{
		if(head==null)	
			return head;
		
		count--;	
		Node_ss temp=head;
		head=head.next;
		temp.next=null;
		if(head==null)	
			tail=null;
			
		return temp;
		
	}
	
	public boolean isEmpty()
	{
		return (head==null);
	}
	
	public int size()
	{
		return count;
	}
	
	
	
	
}




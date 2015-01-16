/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MyStack_Test
{
	public static void main (String[] args) throws java.lang.Exception
	{
		MyStack<String> mystack=new MyStack<String>();
		Node_Test<String> n1=new Node_Test<String>("one",null);
		Node_Test<String> n2=new Node_Test<String>("two",null);
		Node_Test<String> n3=new Node_Test<String>("three",null);
		
		
		System.out.println("Currect array size"+mystack.size());
		
		mystack.push(n1);
		
		System.out.println("Currect array size"+mystack.size());
		
		mystack.push(n2);
		
		System.out.println("Currect array size"+mystack.size());
		
		mystack.push(n3);
		
		System.out.println("Currect array size"+mystack.size());
		
		Node_Test<String> popped=null;
		
		while(mystack.size()>0)
		{
			popped=mystack.pop();
			System.out.println("Popped element is:"+popped.getData());
			System.out.println("Currect array size"+mystack.size());
		}
		
		popped=mystack.pop();
		
		
	}
}

class Node_Test<T>
{
private Node_Test<T> next;
private T data;

	Node_Test()
	{
		next=null;
		data=null;
		
	}
	
	Node_Test(T val, Node_Test<T> next)
	{
		this.data=val;
		this.next=next;
		
	}

	public void setData(T val)
	{
		data=val;	
	}
	
	public T getData()
	{
		return data;
	}
	
	public void setNext(Node_Test<T> next)
	{
		
		this.next=next;
	}
	
	public Node_Test<T> getNext()
	{
		
		return this.next;
	}
	
}

class MyStack<T>
{
	
	private Node_Test<T> top;
	private int size;
	
	
	MyStack()
	{
		top=null;
		size=0;
		
	}
	
	public int size()
	{
		return size;
		
	}
	
	public boolean isEmpty()
	{
		
		return (top==null);
	}
	
	public void push(Node_Test<T> node)
	{
		
		node.setNext(top);
		top=node;
		size++;
		
	}
	
	public Node_Test<T> pop()
	{
		
		if(isEmpty())
		{
			System.out.println("Stack is empty: Nothing to pop");	
			return null;
		}
		else
		{
			Node_Test<T> temp= top;
			top=top.getNext();
			temp.setNext(null);
			size--;
			return temp;
		}
		
	}
	
	
}

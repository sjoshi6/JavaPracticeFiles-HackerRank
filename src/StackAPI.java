
public class StackAPI {

	public static void main(){
		
		My_Stack stack=new My_Stack();
		
		stack.push(6);
		stack.push(5);
		stack.push(4);
		stack.push(10);
		stack.push(11);
		stack.push(1);
		stack.push(7);
		
		
		
		
	}
	
}

class My_Stack
{
	public int size=0;
	StackNode top=null;
	
	My_Stack minstack=new My_Stack();
	
	void push(int x)
	{
		StackNode n=new StackNode(x);
		size++;
		n.next=top;
		top=n;
		
		if(n.data<=minstack.min())
		{
			minstack.push(x);
			
		}
	
	}
	
	StackNode pop()
	{
		size--;
		
		
		
		if(top==null)
			return null;
		else
		{
			if(top.data==minstack.min())
				minstack.pop();
			
			StackNode temp=top;
			top=top.next;
			temp.next=null;
			return temp;
		}
		
	}

	StackNode peek()
	{
		return top;
		
	}
	
	int size()
	{
		return size;	
	}
	
	boolean isEmpty()
	{
		return top==null;
		
	}
	
	int min()
	{
		if(top==null)
			return Integer.MAX_VALUE;
		else
			return top.data;
		
	}
	
	
	int getStackmin()
	{
		return minstack.top.data;
		
	}

}

class StackNode
{
public int data;
public StackNode next;

	StackNode(){};
	
	StackNode(int data)
	{
		this.data=data;
	}
}

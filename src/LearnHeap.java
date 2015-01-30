import java.util.*;

public class LearnHeap {

	public static void main(String []args) throws Exception
	{
		Heap heap=new Heap();
		
		int []arr={2,8,17,54,51,23,45,67,97,22,31,44,7,4,3};
		heapsort(arr,heap);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		
	}
	
	public static void heapsort(int []arr,Heap heap)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			heap.insert(arr[i]);
			
		}
		
		int last=arr.length-1;
		
		while(last>=0)
		{
			arr[last]=heap.delete();
			last--;
		}
		
	}
	
}



class Heap
{

	private ArrayList<Integer> heaplist=new ArrayList<Integer>();

	
	public void insert(int i)
	{
		heaplist.add(i);
		siftup();
	}
	
	private void siftup()
	{
		int k=heaplist.size()-1;
		while(k>0)
		{
			int parent=(k-1)/2;
			
			if(heaplist.get(k)>heaplist.get(parent))
			{
				Integer x=heaplist.get(k);
				heaplist.set(k,heaplist.get(parent));
				heaplist.set(parent, x);	
			}
			else
			{
				break;
				
			}
			
			//set parent as current element
			k=parent;	
				
		}
		
	}
	
	
	public int delete()
	{
		if(heaplist.size()==0)
			return -1;
		
		if(heaplist.size()==1)
			return heaplist.get(0);
		
		int return_value=heaplist.get(0);
		heaplist.set(0, heaplist.get(heaplist.size()-1));
		heaplist.remove(heaplist.size()-1);
		siftdown();
		
		return return_value;
		
	}
	
	private void siftdown()
	{
		int k=0;
		int left=2*k+1;
		int right;
		int max;
		while(left<heaplist.size())
		{
			max=left;
			right=left+1;
			
			if(right<heaplist.size())
			{
				if(heaplist.get(right)>heaplist.get(left))
				{
					max=right;
				}
			}
			
			if(heaplist.get(max)>heaplist.get(k))
			{
				Integer x=heaplist.get(k);
				heaplist.set(k,heaplist.get(max));
				heaplist.set(max, x);
				
			}
			else
				break;
			
			
			k=max;
			left=2*k+1;
			
		}
		
	}
	
	
}
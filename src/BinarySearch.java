import java.io.*;
public class BinarySearch {

	public static void main(String []args) throws Exception
	{
		int a[]={21,13,14,23,54,62,17,19};
		int index=binary_search(a,Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine()) );
		System.out.println("Number found if ans is not -1: answer is::"+index);
	}
	
	public static int binary_search(int a[],int x)
	{
		
		return binary_search(a,0,a.length-1,x);
	}
	
	public static int binary_search(int a[], int low, int high,int x)
	{
		
		if(low>high)
			return -1;
		else
		{
			int mid = (low+high)/2;
			if(a[mid]==x)
				return mid;
			else if(x<a[mid])
				return binary_search(a, low, mid-1, x);
			else if(x>a[mid])
				return binary_search(a,mid+1,high,x );
		}		
		
		return -1;
	}
	
}

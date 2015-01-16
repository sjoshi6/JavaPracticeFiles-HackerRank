
public class MergeSort {

	public static void main(String []args) throws Exception
	{
		int a[]={21,13,14,23,54,62,17,19};
		mergesort(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
			
		}
	}
	
	
	public static void mergesort(int []a)
	{
		int helper[]=new int[a.length];
		mergesort(a,helper,0,a.length-1);
	}
	
	public static void mergesort(int a[],int []helper, int low, int high)
	{
		if(low>=high)
			return;
		else if(low<high)
		{
			int mid=(low+high)/2;
			mergesort(a,helper,low,mid);
			mergesort(a,helper,mid+1,high);
			merge(a,helper,low,mid,high);
		}
		
	}


	private static void merge(int[] a, int[] helper, int low, int mid, int high) {
		// TODO Auto-generated method stub
		int lefthelper=low;
		int righthelper=mid+1;
		int currenthelper=low;
		while(lefthelper<=mid && righthelper<=high)
		{
			if(a[lefthelper]<=a[righthelper])
				helper[currenthelper++]=a[lefthelper++];
			else
				helper[currenthelper++]=a[righthelper++];
		}
		
		while(lefthelper<=mid)
			helper[currenthelper++]=a[lefthelper++];
		
		while(righthelper<=high)
			helper[currenthelper++]=a[righthelper++];
		
		for(int i=low;i<=high;i++)
			a[i]=helper[i];
		
	}
	
}

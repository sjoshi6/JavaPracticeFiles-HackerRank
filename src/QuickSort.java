
public class QuickSort {

	public static void main(String []args)
	{
		
		int []a={11,13,41,31,21,51,76,74,89,22};
		
		quicksort(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(","+a[i]);
			
		}
		System.out.println();
		int sum=82;
		
		int i=0;
		int j=a.length-1;
		
		while(i<=j)
		{
			int total=a[i]+a[j];
			if(total==sum)
			{
				System.out.println(a[i]+":"+a[j]);
				break;
			}
			if(total>sum)
				j--;
			
			if(total<sum)
				i++;
		
		}
		
		if(i>j)
			System.out.println("No element found");
		
		
	}

	private static void quicksort(int[] a, int lo, int hi) {
		// TODO Auto-generated method stub
		if(lo<hi)
		{
			int SplitPoint=split(a,lo,hi);
			quicksort(a,lo,SplitPoint-1);
			quicksort(a,SplitPoint+1,hi);
		}
		else
			return;
	}

	private static int split(int[] a, int lo, int hi) {
		// TODO Auto-generated method stub
		
		int left=lo+1;
		int right=hi;
		int pivot=a[lo];
		
		
		while(true)
		{
			
			while(a[left]<=pivot && left <=right)
				left++;
			
			while(a[right]>pivot && right>left)
				right--;
			
			if(left<right)
			{
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right--;
			}
			else if(left>=right)
				break;
		}
			
		a[lo]=a[left-1];
		a[left-1]=pivot;
		
		return left-1;
	}
	
	
}

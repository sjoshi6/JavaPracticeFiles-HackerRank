
public class SimpleBubbleSort 
{

	public static void main(String []args)
	{
			
		int []a={1,3,6,8,2,4,9,5,7};
		
		int min=999;
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			
			if(a[i]<min)
				min=a[i];
			
		}
		
		
		//Considering three buckets;
		
		int [][]buckets=new int[3][3];
		
		int i1=0;
		int i2=0;
		int i3=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=(max/3))
				buckets[0][i1++]=a[i];
			else if(a[i]<=(max/3)*2)
				buckets[1][i2++]=a[i];
			else if(a[i]<=(max/3)*3)
				buckets[2][i3++]=a[i];

		}
		
		for(int j=0;j<buckets.length;j++)
		{
			buckets[j]=sort(buckets[j]);
			
		}
		
		int k=0;
		
		for(int p=0;p<buckets.length;p++)
		{
			a[k++]=buckets[0][p];
			
		}
		
		for(int p=0;p<buckets.length;p++)
		{
			a[k++]=buckets[1][p];
			
		}
		for(int p=0;p<buckets.length;p++)
		{
			a[k++]=buckets[2][p];
			
		}
		
	
		for(int p=0;p<a.length;p++)
		{
			System.out.print(","+a[p]);
			
		}
		
	
	}
	
	public static int[] sort(int []bucket)
	{
		for(int i=0;i<bucket.length-1;i++)
		{
			for(int k=0;k<bucket.length-1-i;k++)
			{
				if(bucket[k]>bucket[k+1])
				{
					int temp=bucket[k];
					bucket[k]=bucket[k+1];
					bucket[k+1]=temp;
					
				}
				
			}
			
		}
		return bucket;
		
	}
}

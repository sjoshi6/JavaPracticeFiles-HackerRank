
public class InsertionSort
{
	public static void main(String []args)
	{
		int []a={112,154,34,21,66,87,91,0,53,12};
		
		
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp )
			{
				a[j+1]=a[j];
				j--;
			}	
			a[j+1]=temp;
			
			}
			
		
		for(int x=0;x<a.length;x++)
			System.out.print(","+a[x]);
		
	}
}

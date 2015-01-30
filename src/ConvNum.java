import java.util.Vector;


public class ConvNum {

	
	public static void main(String []args) throws Exception
	{
		int n=34722641;
		Vector v= new Vector();
		while(n!=0)
		{
			v.add(n%10);
			n=n/10;
		}
		
		int []a=new int[v.size()];
		for(int i=0;i<v.size();i++)
		{
			a[i]=(int) v.get(v.size()-1-i);
			System.out.println(a[i]);
		}
		
		int i=a.length-1;
		while(i>=1)
		{
			
			if(a[i-1]>a[i])
				i--;
			else
			{
				if(a[i-1]%2==0)
					swap(a,i-1,a.length-1);
					break;
			}
			
		}
		
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]+",");
		}
	
	}
	
	public static void swap(int []a, int i , int n)
	{
		
		while(i<n)
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			i++;
		}
	}
	

}

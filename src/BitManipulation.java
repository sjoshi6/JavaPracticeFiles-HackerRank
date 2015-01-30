
public class BitManipulation {

	
	public static void main(String []args) throws Exception
	{
		
		int num=2224;
		int clearbit=4;
		int mask= ~(1<<clearbit);
		System.out.println("Clearbit 4");
		num=num&mask;
		System.out.println(num);
		
		if((num&(1<<4))!=0)
			System.out.println("1");
		else
			System.out.println("0");
		
		System.out.println("Update bit to 1 at 4th position");
		int updatebit=4;
		num=num&(~(1<<updatebit));
		num=num|(1<<updatebit);
		
		System.out.println(num);
		
		
		if((num&(1<<4))!=0)
			System.out.println("1");
		else
			System.out.println("0");
		
	
		//Number of bits to toggle to get FroM A TO B 
		int a=8;
		int b=7;
		int c=a^b;
		int count=0;
		while(c!=0)
		{
			count+=c&1;
			c=c>>1;
		}
	
		System.out.println(count);
	
	}
	
}

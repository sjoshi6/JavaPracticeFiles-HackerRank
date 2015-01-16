/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RadixSort
{
public static void main (String[] args) throws java.lang.Exception
{
	
	int []inp={112,154,34,21,66,87,91,0,53,12};
	int m=0;
	int div=1;
	int []b=new int[10];
	int n=10;
	
	for(int i=0;i<10;i++)
	{
		if(m<inp[i])
		{
			m=inp[i];
		}
	}
	
	
	while(m/div!=0)
	{
		int []bucket= new int[10];
		
		for(int i=0;i<n;i++)
			bucket[(inp[i]/div)%10]++;
		
		for(int i=1;i<n;i++)
			bucket[i]=bucket[i]+bucket[i-1];
			
		for(int i=n-1;i>=0;i--)
			b[--bucket[(inp[i]/div)%10]]=inp[i];
		
		for(int i=0;i<n;i++)
			inp[i]=b[i];
			
		div=div*10;
	}
		
	for(int i=0;i<n;i++)
		System.out.print(","+inp[i]);
	
}
}
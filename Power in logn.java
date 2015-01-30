/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=3;
		int n=4;
		
		int x= power(a,n);
		
		System.out.println(x);
		
	}
	
	
	public static int power(int a, int n)
	{
		if(n==0)
			return 1;
		
		if(n==1)
			return a;
			
		int x=power(a,n/2);
		
		if(n%2==0)
			return x*x;
		else
			return a*x*x;
		
	}
}
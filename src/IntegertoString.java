/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class IntegertoString
{
	public static void main (String[] args) throws java.lang.Exception
	{
	String number="";
	boolean isNeg=false;
	int num=-445;
	
		if(num<0)
		{	isNeg=true;	
			num=-num;
		}
	
	StringBuilder b=new StringBuilder();
	do
	{
		b.append(num%10);
		num=num/10;
		
	}while(num!=0);
	
	StringBuilder ans=new StringBuilder();
	
	if(isNeg)
	{
		ans.append('-');
	}
		
	int i=b.length()-1;
	
	while(i>=0)
	{
		ans.append(b.charAt(i));	
		i--;
	}
	
	System.out.println(ans);
	}
}
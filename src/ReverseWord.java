/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class ReverseWord
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String inp="i love to code";
		char []inp_arr=inp.toCharArray();
		//char []op=reverse(inp_arr,0,inp_arr.length-1);
		reverse(inp_arr,0,inp_arr.length-1);
		char []op=inp_arr;
			
		for(int i=0;i<op.length;i++)
		{
			int rep_start=i;
			
			while(op[i]!=' ')
			{
				i++;
				if(i==op.length)
					break;
				
			}
			reverse(op,rep_start,i-1);
			
		}
		
			for(int i=0;i<op.length;i++)
				System.out.print(""+op[i]);
		
	}

public static void reverse(char []a,int i, int j)
{
	if(i>=j)
		return;
	else
	{
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		reverse(a,i+1,j-1);
	}

}

}

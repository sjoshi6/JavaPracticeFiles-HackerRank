
import java.util.*;
import java.lang.*;
import java.io.*;

public class RemoveDuplicateChars {

	String []a=new String[5];

}
/* package whatever; // don't place package name! */


/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void test()
	{
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		String str="ABCCBCBA";
		boolean flag;
		String ans="";
  outer: do
		{
			flag=true;
			
			for(int i=0;i<str.length()-1;i++)
			{
				if(str.charAt(i)==str.charAt(i+1))
				{
					if(str.length()==2)
					{
						ans="-1";
						break outer;
					}	
					String str1=str.substring(0,i);
					String str2=str.substring(i+2);
					str=str1+str2;
					flag=false;
					break;
				}
			}
			
		}while(flag==false);
		
		if(!ans.equals("-1"))
			ans=str;
			
		System.out.println(ans);
		
	}
}
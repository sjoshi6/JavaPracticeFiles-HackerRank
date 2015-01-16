/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RemoveSelectCharSTBuilder
{
	public static void main (String[] args) throws java.lang.Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String rmv="AEIOU";
		String str="AABBCXXDDEE";
		HashMap<Character,Boolean> charHash=new HashMap<Character,Boolean>();
		
		for(int i=0;i<rmv.length();i++)
		{
			char c=rmv.charAt(i);
			
			if(!charHash.containsKey(c))
			{
				charHash.put(c,true);
				
			}

		}
		
		
		int i;
		StringBuilder strb=new StringBuilder();
		
		for(i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			if(!charHash.containsKey(c))
			{
				strb.append(c);
			}
		}
		
		
		System.out.println("Output is:"+strb);
		
		
	}
}
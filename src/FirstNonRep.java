/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class FirstNonRep
{
	public static void main (String[] args) throws java.lang.Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str="AABBCXXDDEE";
		HashMap<Character,Boolean> charHash=new HashMap<Character,Boolean>();
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			if(!charHash.containsKey(c))
			{
				charHash.put(c,true);
				
			}
			else
			{
				
				charHash.put(c,false);
			}
			
		}
		
		int i;
		for(i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			if(charHash.get(c)==true)
			{
				System.out.println("First Non Rep is: "+c);
				break;
			}
		}
		
		if(i==str.length())
		{
				System.out.println("All chars rep ");
			
		}

		
	}
}
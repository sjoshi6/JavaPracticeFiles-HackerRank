/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class RemoveSelectCharsArray
{
	public static void main (String[] args) throws java.lang.Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String rmv="AEIOU";
		String str="AABBCXXDDEE";
		
		char []strarray=str.toCharArray();
		HashMap<Character,Boolean> charHash=new HashMap<Character,Boolean>();
		
		for(int i=0;i<rmv.length();i++)
		{
			char c=rmv.charAt(i);
			
			if(!charHash.containsKey(c))
			{
				charHash.put(c,true);
				
			}

		}
		
		int remove_elem=0;
		int head=0;
		
		for(int i=0;i<strarray.length;i++)
		{
			char c=strarray[i];
			if(!charHash.containsKey(c))
			{
				
				if(head!=remove_elem)
				{
					strarray[remove_elem]=strarray[head];	
				}	
				remove_elem++;
			}
			head++;
		}
		
		String temp_str=new String(strarray);
		String finalstr=temp_str.substring(0,remove_elem);
		
		System.out.println("Output is:"+finalstr);
		
		
	}
}
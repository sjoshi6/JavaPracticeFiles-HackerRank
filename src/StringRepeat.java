import java.util.*;
public class StringRepeat {

	public static void main(String []args)throws Exception
	{
		
		ArrayList<String> l=new ArrayList<String>();
		
		String a="teepterr";
		find_first_n_rep(a);
				
	}	
	
	public static void find_first_n_rep(String a)
	{
		HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
		//scan1 to build hash
		for(int i=0;i<a.length();i++)
		{
			if(! hash.containsKey(a.charAt(i)))
			{
				hash.put(a.charAt(i), 1);
				
			}
			else
			{
				hash.put(a.charAt(i),hash.get(a.charAt(i))+1);
				
			}
			
		}
		
		//scan to find an element
		int i;
		for(i=0;i<a.length();i++)
		{
			if(hash.get(a.charAt(i))==1)
			{
				System.out.println("First Non repeating char: "+a.charAt(i));
				break;
			}
			
		}
		
		if(i==a.length())
		{
			System.out.println("All are repeated");
			
		}
		
		
		
	}
}

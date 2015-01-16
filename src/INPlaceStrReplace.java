import java.util.*;
public class INPlaceStrReplace {

	public static void main(String []args) throws Exception
	{
		
		StringBuilder str=new StringBuilder("aabbcccxyzaaaapqccra");
		remove_dup(str);
		
		
	}
	
	public static void remove_dup(StringBuilder str)
	{
		int r1=0;
		int r2=0;
		HashMap<Character,Integer> seen = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(!seen.containsKey(str.charAt(i)))
			{
				if(r1!=r2)
				{
					str.setCharAt(r1, str.charAt(r2));
					
				}
					r1++;
					r2++;
					seen.put(str.charAt(i),1);
			}
			else
			{
				r2++;
			}
			
		}
		
		int size=seen.size();
		
		String sub=str.substring(0,size);
		System.out.println(sub);
		
	}
	
}

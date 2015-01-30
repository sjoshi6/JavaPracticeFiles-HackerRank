import java.util.*;
public class StrinReplacement {

	
	public static void main(String []args) throws Exception
	{
		String str="Mr Saurabh Joshi    ";
		
		int j=str.length()-1;
		int i=str.length()-1;
		char []arr=str.toCharArray();
		while(str.charAt(i)==' ')
		{
			i--;
		}
		
		while(i>=0)
		{
			
			if(str.charAt(i)!=' ')
			{
				arr[j--]=arr[i--];
				
			}
			else
			{
				arr[j--]='0';
				arr[j--]='2';
				arr[j--]='%';
				i--;
						
			}
			
		}
		
		String s=new String(arr);
		
		System.out.println(s);
		
	}
}

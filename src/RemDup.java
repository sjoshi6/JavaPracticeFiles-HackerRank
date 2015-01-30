import java.util.*;
public class RemDup {

	public static void main(String []args) throws Exception
	{
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(2);
		alist.add(2);
		alist.add(1,3);
		alist.add(4);
		alist.add(5);
		alist.add(4);
		alist.add(2);
		alist.add(5);
		alist.add(1);
		
		HashMap<Integer,Boolean> x=new HashMap<Integer,Boolean>();
		
		for(int i=0;i<alist.size();i++)
		{
			int elem=alist.get(i);
			
			if(x.containsKey(elem))
			{
				alist.remove(i);
				i--;
			}
			else
				x.put(elem, true);
			
		}
		
		
		Iterator p=alist.iterator();
		
		while(p.hasNext())
		{
			System.out.println(p.next());
		}
	}
	
}

import java.util.*;

public class CollectionsTester {

	public static void main(String []args) throws Exception
	{
		Integer []a={1,3,4,2,5,7,3};
		List<Integer> alist=Arrays.asList(a);
		
		Arrays.binarySearch(a,4);
		ArrayList<Integer> blist=new ArrayList<Integer>();
		
		blist.add(4);
		blist.add(5);
		blist.add(7);
		Queue<Integer> q =(Queue<Integer>) new LinkedList();
		q.poll();
		ArrayList<Integer> clist=new ArrayList<Integer>();
		
		blist.addAll(clist);
		Collections.sort(blist);
		
		Iterator<Integer> i3=blist.iterator();
		
		while(i3.hasNext())
		{
			System.out.print(i3.next());
		}
		
		Set<Integer> set=new HashSet<Integer>();
		
		set.add(1);
		set.add(3);
		set.add(6);
		set.add(2);
		
		
	}
	
}

import java.util.*;
public class PrisonTest {

	public static void main(String []args) throws Exception
	{
		Prison mainprison= new Prison();
		mainprison.initi();
		Iterator i=mainprison.iterator();
		
		while(i.hasNext())
		{
			
			System.out.println(i.next());
		}
		
	}
}


class Prison implements Iterable
{
	
	ArrayList<PrisonCell> plist = new ArrayList<PrisonCell>();
	
	
	public void initi()
	{
		
		PrisonCell p1=new PrisonCell(10);
		PrisonCell p2=new PrisonCell(13);
		PrisonCell p3=new PrisonCell(14);
		PrisonCell p4=new PrisonCell(16);
		plist.add(p1);
		plist.add(p2);
		plist.add(1,p3);
		plist.add(0,p4);
	}
		
	
	
public Iterator iterator()
{
	
return new PrisonCellIterator(this);
}

}

class PrisonCell
{
	
int p_no;

PrisonCell()
{}

public String toString()
{
		return "Prison Cell Number:"+p_no;	
}

PrisonCell(int p)
{
	p_no=p;
}

}

class PrisonCellIterator implements Iterator<PrisonCell>
{
	
	Prison prison;
	int count;
	
	PrisonCellIterator()
	{
		
		
	}
	
	PrisonCellIterator(Prison p)
	{
		this.prison=p;
		count=0;
	}
	
	public boolean hasNext()
	{
		
		return count<prison.plist.size();
	}
	
	public PrisonCell next()
	{
		
		return prison.plist.get(count++);
	}
	
	public void remove()
	{
		
		
	}

}
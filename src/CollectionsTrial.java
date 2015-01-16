import java.util.*;

public class CollectionsTrial {

	public static void main(String []args)
	{
		
		Line l1=new Line(3,3,2,4);
		Line l2= new Line(3,3,3,4);
		Line l3= new Line(3,3,9,9);
		Line l4= new Line(2,3,7,7);
		Line l5= new Line(3,3,6,6);
		ArrayList<Line> lines=new ArrayList<Line>();
		lines.add(l1);
		lines.add(l2);
		lines.add(l3);
		lines.add(l4);
		lines.add(l5);
		
		Collections.sort(lines,new LineComparator());
		
		Iterator i = lines.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}


class Line
{

	Line()
	{
		
	}
	
int x1,x2,y1,y2;
Line(int x1,int x2, int y1, int y2)
{
	this.x1=x1;
	this.x2=x2;
	this.y1=y1;
	this.y2=y2;
}

public String toString()
{
	return ""+x1+","+x2+","+y1+","+y2+","+length_line();
}
public Double length_line()
{	
	return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
}

/*
public boolean equals(Object o)
{
	if(o instanceof Line && ((Line) o).length_line().compareTo(this.length_line())==0)
		return true;
	
	return false;
}

public int compareTo(Line l)
{
return (this.length_line()).compareTo(l.length_line());
}
*/
}


class LineComparator implements Comparator<Line>
{
	public int compare(Line l1,Line l2)
	{
		return (l1.length_line()).compareTo(l2.length_line());
	}
}

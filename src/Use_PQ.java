import java.util.*;
public class Use_PQ {
	
	public static void main(String []args) throws Exception
	{
		MyComparator e = new MyComparator();
		PriorityQueue<Student> pq=new PriorityQueue<Student>(100,e);
		pq.offer(new Student("a"));
		pq.offer(new Student("z"));
		pq.offer(new Student("q"));
		pq.offer(new Student("p"));
		pq.offer(new Student("x"));
		pq.offer(new Student("e"));
		pq.offer(new Student("r"));
		
		
		
		System.out.println("-------------");
		
		for(int i=0;i<8;i++)
		{
			Student a=pq.poll();
			System.out.println(a);
			
		}
	}
	
	
	

}


class MyComparator implements Comparator<Student>
{
	public int compare(Student o1, Student o2)
	{
			return (o1.name).compareTo(o2.name);
	}
}

class Student
{
	
String name;

	Student(String n)
	{
		name=n;	
	}
	
	
	public String toString()
	{
		
		return this.name;
	}
}
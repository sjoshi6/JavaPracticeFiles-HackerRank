import java.util.ArrayList;
import java.util.Iterator;


public class Test_Collections {

	
	
}


class My_Test_Clone implements Cloneable {
	public My_Test_Clone clone() throws CloneNotSupportedException

	{
		return (My_Test_Clone) super.clone();
		
	}
}


class My_Iterable implements Iterable
{
	ArrayList<My_test> alist=new ArrayList<My_test>();
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new MyIterator(this);
	}
	
}

class My_test
{
	
}

class MyIterator implements Iterator<My_test>
{
	My_Iterable iterate_on;
	int count=0;
	public MyIterator() {
		// TODO Auto-generated constructor stub
	
	}
	
	public MyIterator(My_Iterable i) {
		iterate_on=i;
		// TODO Auto-generated constructor stub
	
	}
	
	
	@Override
	public boolean hasNext() {
		
		return count<iterate_on.alist.size();
	}

	@Override
	public My_test next() {
		// TODO Auto-generated method stub
		
		return iterate_on.alist.get(count++);
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
}
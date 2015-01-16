import java.io.IOException;


public class TemplateTrial {

	public static void main(String []args) throws IOException
	{
		TempClass<String> test=new TempClass<String>();
		test.setValue("Hey");
		System.out.println(test.getValue());
		
		
	}
	
}

class TempClass<T>
{
	
T data;

public void setValue(T val)
{
data=val;	
}

public T getValue()
{
return data;	
}

}

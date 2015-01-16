import java.util.*;

public class Collections_Tester {
public static void main(String []args) throws Exception
{
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	
	hm.containsKey(1);
	hm.clear();
	hm.remove(1);
	hm.containsKey(1);
	hm.containsValue(32);
	hm.isEmpty();

	String x=hm.get(1);
	hm.size();
	hm.put(1,"aa");

}
}

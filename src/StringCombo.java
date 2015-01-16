
class Permute {
	
	private String inp;
	private StringBuilder out= new StringBuilder();
	private boolean used[];
	
	public Permute(String input)
	{
		inp=input;
		used=new boolean[inp.length()];
				
	}
	
	public void compute()
	{
		if(out.length()==inp.length())
		{
			System.out.println(out);
			return;
			
		}
		
		for(int i=0;i<inp.length();i++)
		{
			if(used[i]==true) continue;
			used[i]=true;
			out.append(inp.charAt(i));
			compute();
			used[i]=false;
			out.setLength(out.length()-1);		
			
		}
		
		
	}

}

class StringCombo
{
	public static void main(String [] args) throws Exception
	{
			Permute p = new Permute("abcd");
			p.compute();
	}

}

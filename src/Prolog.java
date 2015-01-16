/*
 Artificial Intellegence assignment 3
 Name: Saurabh Vishwas Joshi
 Unity ID: sjoshi6
 
*/

import java.util.*;
public class Prolog {
	
	public static void main(String []args) throws Exception
	{
		String [][]edge= new String[4][3];
		ArrayList<String []> values = new ArrayList<String []>(); 
		
		edge[0][0] ="david";
		edge[0][1] ="isa";
		edge[0][2]="diabetics";
		
		edge[1][0] ="diabetics";
		edge[1][1] ="shouldAvoid";
		edge[1][2]="sugar";

		edge[2][0] ="snickers";
		edge[2][1] ="ako";
		edge[2][2]="candy";

		edge[3][0] ="candy";
		edge[3][1] ="contains";
		edge[3][2]="sugar";
		
		values.add(edge[0]);
		values.add(edge[1]);
		values.add(edge[2]);
		values.add(edge[3]);
		String inp=args[0];
		String replaced_str=inp.replace(".","");
        replaced_str=replaced_str.replace(")","");
		String trimmed_str=replaced_str.substring(7);
		String []split_parts=trimmed_str.split(",");
		values=compute_infered_entries_from_rules(values);
		compute_combinations(split_parts[0].trim(),split_parts[1].trim(),split_parts[2].trim(),values);
		
	}

	public static void compute_combinations(String Node1, String Slot, String Node2,ArrayList <String[]> values)
	{
      
		if(Node1.equals(Slot) || Slot.equals(Node2) || Node1.equals(Node2))
		{
			System.out.println("False.");
			return;
		}
		
		boolean charflag1=Character.isLowerCase(Node1.charAt(0));
		boolean charflag2=Character.isLowerCase(Slot.charAt(0));
		boolean charflag3=Character.isLowerCase(Node2.charAt(0));
		boolean found_flag=false;
        int intflag1=0;
        int intflag2=0;
        int intflag3=0;
        
        if(charflag1==true)
        { intflag1=1;
        }
        if(charflag2==true)
        { intflag2=1;
        }
        if(charflag3==true)
        { intflag3=1;
        }
        
        int case_number=intflag1*4+intflag2*2+intflag3*1;
        
		String type=""+charflag1+":"+charflag2+":"+charflag3;
        
		switch(case_number)
		{
		
		case 7:
			for(int i=0;i<values.size();i++)
			{
				if(values.get(i)[0].equals(Node1) &&values.get(i)[1].equals(Slot)&&values.get(i)[2].equals(Node2))
					found_flag=true;
						
			}
			break;		
			
		case 0:
			for(int i=0;i<values.size();i++)
				{
					found_flag=true;
					System.out.print( Node1+"="+values.get(i)[0]+",");
					System.out.print( Slot+"="+values.get(i)[1]+",");
					System.out.print( Node2+"="+values.get(i)[2]+"\n");
					
				}
			break;
		
		case 4:
			for(int i=0;i<values.size();i++)
			{
				if(values.get(i)[0].equals(Node1))
				{
					found_flag=true;
					System.out.print( Slot+"="+values.get(i)[1]+",");
					System.out.print( Node2+"="+values.get(i)[2]+"\n");
				}
				
			}
			break;
			
		case 6:
			for(int i=0;i<values.size();i++)
			{
				if(values.get(i)[0].equals(Node1)&&values.get(i)[1].equals(Slot))
				{
					found_flag=true;
					System.out.print( Node2+"="+values.get(i)[2]+"\n");
				}
				
			}
			break;
		
		case 5:
			for(int i=0;i<values.size();i++)
			{	
				if(values.get(i)[0].equals(Node1)&&values.get(i)[2].equals(Node2))
				{
					found_flag=true;
					System.out.print( Slot+"="+values.get(i)[1]+",");
					System.out.print("\n");
				}
				
			}
			break;
		
		case 3:
			for(int i=0;i<values.size();i++)
			{
				if(values.get(i)[1].equals(Slot)&&values.get(i)[2].equals(Node2))
				{
					found_flag=true;
					System.out.print( Node1+"="+values.get(i)[0]+",");
					System.out.print( "\n");
				}
				
			}
			break;
			
		case 1:
			for(int i=0;i<values.size();i++)
			{
				if(values.get(i)[2].equals(Node2))
				{
					found_flag=true;
					System.out.print( Node1+"="+values.get(i)[0]+",");
					System.out.print( Slot+"="+values.get(i)[1]+",");
					System.out.print("\n");
				}
				
			}
			break;
			
		case 2:
			for(int i=0;i<values.size();i++)
			{
				if(values.get(i)[1].equals(Slot))
				{
					found_flag=true;
					System.out.print( Node1+"="+values.get(i)[0]+",");
					System.out.print( Node2+"="+values.get(i)[2]+"\n");
				}
				
			}
			break;
			
			
			
						
		
		}
		
		System.out.println(found_flag);
		
		
	}
	
	public static void compute_true_false(String Node1, String Slot, String Node2,ArrayList <String[]> values)
	{
		boolean flag=false;
		
		for(int i=0;i<values.size();i++)
		{

				if(values.get(i)[0].equals(Node1) && values.get(i)[1].equals(Slot) && values.get(i)[2].equals(Node2))
				{
					flag=true;
					break;
				}
				
		}
		
		if(flag==true)
			System.out.println("True");
		else
			System.out.println("False");
		
	}
	
	public static ArrayList <String[]> compute_infered_entries_from_rules(ArrayList <String[]> values)
	{
		
		for(int i=0;i<values.size();i++)
		{
			if(values.get(i)[1].equals("shouldAvoid"))
			{
				for(int j=0;j<values.size();j++)
				{
					if(values.get(i)[0].equals(values.get(j)[2]) && values.get(j)[1].equals("isa"))
					{
						String newedge[]=new String[3];
						newedge[0]=values.get(j)[0];
						newedge[1]=values.get(i)[1];
						newedge[2]=values.get(i)[2];
						values.add(newedge);	
						
					}
					
				}
				
			}
			
			if(values.get(i)[1].equals("contains"))
			{
				for(int j=0;j<values.size();j++)
				{
					if(values.get(i)[0].equals(values.get(j)[2]) && values.get(j)[1].equals("ako"))
					{
						String newedge[]=new String[3];
						newedge[0]=values.get(j)[0];
						newedge[1]=values.get(i)[1];
						newedge[2]=values.get(i)[2];
						values.add(newedge);
						
						
					}
					
				}
				
			}
			
		}
		
		for(int i=0;i<values.size();i++)
		{
			/* new rules for isa */
			if(values.get(i)[1].equals("shouldAvoid"))
			{
				for(int j=0;j<values.size();j++)
				{
					if(values.get(i)[2].equals(values.get(j)[2]) && values.get(j)[1].equals("contains"))
					{
						String newedge[]=new String[3];
						newedge[0]=values.get(i)[0];
						newedge[1]=values.get(i)[1];
						newedge[2]=values.get(j)[0];
						values.add(newedge);
									
					}
					
				}
				
			}
		}
		return values;
	}
		
}

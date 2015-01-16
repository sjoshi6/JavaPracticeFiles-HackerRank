
public class BSTTest {

	public static void main(String []args) throws Exception
	{
		Tree tree=new Tree();
		My_Node []nodes=new My_Node[15];
			
		for(int i=0;i<15;i++)
				nodes[i]=new My_Node(i+1);
				
		for(int i=7;i>=0;i--)
			tree.insert(nodes[i]);

		for(int i=14;i>=8;i--)
			tree.insert(nodes[i]);
	
		My_Node p=new My_Node(19);
		//tree.insert(p);
		int x=19;
		
		boolean found_elem=tree.search_node(x);
		System.out.println("Element with value "+x+" was found?: "+found_elem);
		System.out.println();
		System.out.println("Number of nodes: "+tree.getCount());
		System.out.println();
		System.out.println("height of the tree is: "+Tree.treeheight(tree.root));
		System.out.println();
		System.out.println("Inorder traversal of tree");
		Tree.display_inorder(tree.root);
		System.out.println();
		Tree mirror=Tree.mirrorTree(tree);
		System.out.println();
		System.out.println("Inorder traversal of mirrored tree");
		Tree.display_inorder(mirror.root);
		
	}
	
}


class My_Node
{
	private int data;
	private My_Node left;
	private My_Node right;
	
	My_Node()
	{}
	
	My_Node(int val)
	{
		data=val;
		
	}
	
	
	public boolean equals(Object o)
	{
		if(o instanceof My_Node && this.getData()==((My_Node) o).getData())
				return true;
		else
			return false;
	}
	
	int getData() {
		return data;
	}
	void setData(int data) {
		this.data = data;
	}
	My_Node getLeft() {
		return left;
	}
	void setLeft(My_Node left) {
		this.left = left;
	}
	My_Node getRight() {
		return right;
	}
	void setRight(My_Node right) {
		this.right = right;
	}
	
	public int hashcode()
	{
		
		return data%10;
	}


}

class Tree implements Cloneable
{
	
My_Node root;
private int count=0;

	Tree()
	{
		
		
	}
	
	Tree(My_Node root)
	{
		this.root=root;
		
	}
	
	
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
	public void insert(My_Node n)
	{
		setCount(getCount() + 1);
		
		if(root==null)
			root=n;
		else
		{
			My_Node prev=null;
			My_Node temp=root;
		
			while(temp!=null)
			{
				if(temp!=null && n.getData()<=temp.getData())
				{
					prev=temp;
					temp=temp.getLeft();
				}
				
				if(temp!=null && n.getData()>temp.getData())
				{
					prev=temp;
					temp=temp.getRight();
					
				}
				
				
			}
			
			if(n.getData()<=prev.getData())
				prev.setLeft(n);
			else
				prev.setRight(n);
			
		}
	}
	
	
	public int number_of_nodes()
	{
		return getCount();
		
	}
	
	public static void display_inorder(My_Node root)
	{
		if(root==null)
			return;
		else
		{
			display_inorder(root.getLeft());
			System.out.print(root.getData()+"--");
			display_inorder(root.getRight());
		}
		
	}
	
	
	public boolean search_node(int val)
	{
		boolean is_found=false;
		My_Node temp=root;
		
		while(temp!=null)
		{
			if(temp.getData()==val)
			{
				is_found=true;
				break;
			}
			else if(val<temp.getData())
			{
				temp=temp.getLeft();
				
			}
			else if(val>temp.getData())
			{
				temp=temp.getRight();
			}
			
		}
		
		return is_found;
	}
	
	public static int treeheight(My_Node root)
	{
		if(root==null)
			return 0;
		else 
			return Math.max(treeheight(root.getLeft()),treeheight(root.getRight()))+1;
	}
	
	
	public static Tree mirrorTree(Tree t) throws CloneNotSupportedException
	{
		Tree mirrored_tree = (Tree) t.clone();
		switchchildren(mirrored_tree.root);
		
		return mirrored_tree;
	}
	
	private static void switchchildren(My_Node root)
	{
		if(root==null)
			return;
		else
		{
			My_Node temp=root.getLeft();
			root.setLeft(root.getRight());
			root.setRight(temp);
			
			switchchildren(root.getLeft());
			switchchildren(root.getRight());
		}
	}

	int getCount() {
		return count;
	}

	void setCount(int count) {
		this.count = count;
	}
	
	
}
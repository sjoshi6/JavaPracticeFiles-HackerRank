
public class AAA {
	
	public static void main(String []args)
	{
	Synced synced=new Synced();
	MySyncedThread t1=new MySyncedThread(synced);
	MySyncedThread t2=new MySyncedThread(synced);
	MySyncedThread t3=new MySyncedThread(synced);
	t1.setName("A");
	t2.setName("B");
	t3.setName("C");
	t1.start();
	t2.start();
	t3.start();
		
	}
	

}

class MySyncedThread extends Thread
{
	Synced synced;

	public MySyncedThread(Synced sync)
	{
		this.synced=sync;
	}
	
	public void run()
	{
		synced.display();
	}
	
}

class Synced
{
	
	public  void display()
	{
		synchronized(this){
		for(int i=0;i<10;i++)
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
	
}
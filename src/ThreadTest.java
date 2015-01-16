
public class ThreadTest {

public static void main(String []args) throws Exception
{
MyRunnable r =new MyRunnable();
Thread t1=new Thread(r);
t1.setName("Sau");
Thread t2=new Thread(r);
t2.setName("Abhi");

Thread t3=new Thread(r);
t3.setName("Amey");
t1.setPriority(8);
t2.setPriority(7);
t3.setPriority(9);
t1.start();
t2.start();
t3.start();
}
	
}


class MyRunnable implements Runnable
{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		for(int i=0;i<10;i++)
		{
			if(i==5)
				Thread.yield();
			
			if(i==7)
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			System.out.println(Thread.currentThread().getName() +"--"+ i);
		}
		
	}
	
}
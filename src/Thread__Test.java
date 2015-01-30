import java.lang.Thread;

public class Thread__Test {

	public static void main(String []args) throws Exception
	{
		MyThread t1=new MyThread();
		t1.start();
		MyRunnable3 r =new MyRunnable3();
		Thread t2=new Thread(r);
		Thread t3=new Thread(r);
		t3.setPriority(4);
		MyRunnable2 r2=new MyRunnable2();
		Thread t4=new Thread(r2);
		t4.setName("outer");
		t4.setPriority(10);;
		t2.setPriority(3);
		
		MyRunnable3 r3=new MyRunnable3();
		Thread tt=new Thread(r3);
		tt.start();
		
		t2.start();
		t3.start();
		t4.start();
		t4.join();
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		
	}
}


class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<50;i++)
			System.out.print("Inside the Mythread"+i);
	}
}


class MyRunnable3 implements Runnable
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			if(i==20)
				Thread.yield();
			if(i==50)
				{
						try
						{
							Thread.sleep(1000);
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
				}
			
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
}

class MyRunnable2 implements Runnable
{
	
	public void run()
	{
		for(int i=100;i<200;i++)
		{
			if(i==150)
			{
				MyRunnable3 n =new MyRunnable3();
				Thread t=new Thread(n);
				t.setName("Inner thread");
				try {
					t.start();
					t.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println(Thread.currentThread().getName()+":"+i);
			
		}
	}

}
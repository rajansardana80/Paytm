package a;

public class Join extends Thread {

	public synchronized void run()
	{
		int i=0;
		for(i=0;i<50;i++)
		{
			System.out.println("No Is ::"+i);
		}
	}
	
	public static void main(String[] args)
	{
		Join t = new Join();
		Join t1 = new Join();

	//	Join t2 = new Join();
		t.start();
		t1.start();
	/*	try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/
	
	}
	
}

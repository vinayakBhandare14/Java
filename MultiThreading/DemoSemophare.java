
import java.util.concurrent.*;
class Resource
{
	int []x = {11,22,33,44,55,66,77,88,99};	
	// Semaphore semaphore = new Semaphore(1);
	// Semaphore semaphore = new Semaphore(2);
	 Semaphore semaphore = new Semaphore(10);
	// Semaphore semaphore = new Semaphore(3,true);
	public void show() {
		try
		{
			semaphore.acquire();
			for(int i=0;i<10;i++)
			{
				System.out.println(Thread.currentThread().getName()+" - "+x[i]);
				try{Thread.sleep(800);}catch(Exception e){}
			}
		}
		catch (Exception e) {}
		finally {
			System.out.println(Thread.currentThread().getName() + " released permit.");
			semaphore.release();
		}
	}
}
class DemoSemophare
{
	public static void main(String[] args) 
	{
		Resource res = new Resource();		
		for(int i=0 ; i<10 ; i++) {
			new Thread(){
				public void run() {
					res.show();
				}
			}.start();
		}
	}
}

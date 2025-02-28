

/**
 * This program demonstrates how to create a single-threaded executor
 * to execute a Runnable task.
 
import java.util.concurrent.*;

class Executer1 
{
	public static void main(String[] args) 
	{
		ExecutorService pool = Executors.newSingleThreadExecutor();
		
		Runnable task = new Runnable(){
			public void run(){
				for (int i=0; i<10; i++)
				{
					System.out.println(Thread.currentThread().getName()+"  -  "+i);
					try{Thread.sleep(500);}catch (Exception e){}
				}
			}
		};
		pool.execute(task);
		pool.shutdown();


	}
}
*/

/*
//multi Thread Executor
import java.util.concurrent.*;

class Executer1
{
	public static void main(String[] args)
	{
		ExecutorService pool = Executors.newCachedThreadPool();
		Runnable task1 = new Runnable(){
			public void run(){
				for (int i=0; i<10; i++)
				{
					System.out.println(Thread.currentThread().getName()+" -  "+i);
					try{Thread.sleep(500);}catch (Exception e){}
				}
			}						
		};
		pool.execute(task1);

		Runnable task2 = new Runnable(){
			public void run(){
				for (int i=0; i<10; i++)
				{
					System.out.println(Thread.currentThread().getName()+" - "+i);
					try{Thread.sleep(500);}	catch (Exception e){}
				}
			}
		};
		pool.execute(task2);
		pool.shutdown();
	}
}
*/

/**
 * This program demonstrates how to create a single-threaded executor
 * to execute a Callable task.
 */

 import java.util.concurrent.*;

 class Executer1
 {
	 public static void main(String[] args)
	 {
		ExecutorService pool = Executors.newCachedThreadPool();
		Callable<Integer> task = new Callable<Integer>(){
			public Integer call(){
				int total=0;
				try
				{
						for (int i=1; i<=10;i++ )
					{
						total += i;
						Thread.sleep(500);
						System.out.println(i);
					}
				}
				catch (Exception e)
				{
					//e.printStacktrace();
				}
				return total;
			}
		};

		Future<Integer>result = pool.submit(task);
			
		try
		{
			Integer returnValue = result.get();
			System.out.println("Final Result :: "+returnValue);
		}
		catch (Exception e)
		{
		}
		pool.shutdown();
	 }
 }

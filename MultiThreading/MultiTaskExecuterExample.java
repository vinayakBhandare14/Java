import java.util.concurrent.*;

class ClockCountDown extends Thread
{
	private String ClockName;

	public ClockCountDown(String ClockName){
		this.ClockName = ClockName;		
	}
	public void run(){
		
		String ThreadName = Thread.currentThread().getName();

		for (int i=5; i>=0; i-- )
		{
			System.out .printf("\n %s --> %s  %d",ThreadName,ClockName,i);
			try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
		}
	}
}

class MultiTaskExecuterExample 
{
	public static void main(String[] args) 
	{
		ExecutorService pool = Executors.newCachedThreadPool();

		pool.execute(new ClockCountDown("A"));
		pool.execute(new ClockCountDown("B"));
		pool.execute(new ClockCountDown("C"));
		pool.execute(new ClockCountDown("D"));

		pool.shutdown();
	}
}

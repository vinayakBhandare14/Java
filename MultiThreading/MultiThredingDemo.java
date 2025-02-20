/*------------------------------------------------------------------
class MultiDemo extends Thread
{
	public MultiDemo(){

			System.out.println("This is MultiDemo class");
	}

	 public void run(){
		System.out.println("This is run method");
	}
}





class MultiThredingDemo 
{
	public static void main(String[] args) 
	{
		MultiDemo d1 = new MultiDemo();
		d1.start();
		System.out.println("Is d1 Alive::------>"+d1.isAlive());
	}
}

----------------------------------------------------------------------------*/

/*
class DemoThread extends Thread
{
	public DemoThread()
	{
		System.out.println("This is cunstructor call");
	}

	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(this+"  run() method called");
			try
			{
				Thread.sleep(200);
			}
			catch (Exception e)
			{
			}
		}
	}
}

class MultiThredingDemo 
{
	public static void main(String [] args)
	{
		System.out.println("main() Started.....!");

		DemoThread d1 = new DemoThread();
		d1.start();

		DemoThread d2 = new DemoThread();
		d2.start();
		d2.setPriority(10);


		System.out.println("d1 is running"+d1.isAlive());

		for(int i=0;i<20;i++)
		{
			System.out.println(Thread.currentThread()); 
			try
			{
				Thread.sleep(400);
			}
			catch (Exception e)
			{

			}
		}
		System.out.println("main() end.....!");
	}
}

*/

/*// ---------------------------------------------------------MultiThreading by using Runnable method


class MultiThredingDemo implements Runnable
{
	public void run()
		{
			System.out.println("Hii.....");
		}
		
	public static void main(String[] args)
	{
		MultiThredingDemo d2 = new MultiThredingDemo();

		Thread t1 = new Thread(d2);

		t1.start();

		
	}
}

*/

/*//----------------------------------------Single tsak from single Thread or Single task using multiple Thraed---------------------------

class MultiThredingDemo implements Runnable
{
	public void run()
	{
		System.out.println(" This run() methos is performed by using Single task from single Thread method");
	}

	public static void main(String [] args){
		
		
		MultiThredingDemo mh1 = new MultiThredingDemo();
		Thread th1 = new Thread(mh1);
		th1.start();

		MultiThredingDemo mh2 = new MultiThredingDemo();
		Thread th2 = new Thread(mh2);
		th2.start();
	}
}
*/

//-------------------------------------------Multipale task from multiple thread-----------------------------------------------------

/*

class MyThread1 extends Thread // by using Thread class
{
	public void run()
	{
		System.out.println("This is Thraed 1");
	}
}

class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("This is Thread 2");
	}
}

class MultiThredingDemo
{
	public static void main(String[] args)
		{
			MyThread1 t1 = new MyThread1();
			t1.start();

			MyThread2 t2 = new MyThread2();
			t2.start();
		}
}

*/

/*
class MyThread1 implements Runnable
{
	public void run()
	{
		System.out.println("This is tread 1........"+this);
	}
}

class MyThread2 implements Runnable
{
	public void run()
	{
		System.out.println("This is tread 2........"+this);
	}
}

class MultiThredingDemo 
{
	public static void main(String[] args)
	{
		
		MyThread1 t1 = new MyThread1();
		Thread th1 = new Thread(t1);
		th1.start();

		MyThread2 t2 = new MyThread2();
		Thread th2 = new Thread(t2);
		th2.start();
	}

}
*/

// ----------------------------------------------Changing tha name in Thread


//
/*
class MultiThredingDemo 
{
	public static void main(String [] args)
	{
		System.out.println(Thread.currentThread().getName());

		Thread.currentThread().setName("Vinayak");

		System.out.println(Thread.currentThread().getName());
	}
}

*/

// -----------------------------------------------MultiThreading By sleep() method

/*
class MultiThredingDemo
{
	public static void main(String[] args){
		
		for(int i=0;i<10;i++){

			try{Thread.sleep(200);} // by using try catch method
			catch (Exception e){}
			
			System.out.println("main :"+i);
		
		}
	}
}
*/

/*
// sleep() by diffrent ways

class MyThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(this+" "+i);
			try{Thread.sleep(600);}
			catch (Exception e){}
		}
	}
}

class MultiThredingDemo
{
	public static void main( String [] args)
	{
		MyThread t1 = new MyThread();
		Thread th = new Thread(t1);
		th.start();
	}
}

*/

//----------------------------------------------------- using join() method



/*

class MultiThredingDemo extends Thread
{

	static Thread mainThread;
	public void run()
	{
		
		for (int i=0;i<10 ;i++ )
		{
			System.out.println(Thread.currentThread().getName()+" "+i);


			try
			{
				mainThread.join();
				Thread.sleep(200);
			}
			catch (Exception e){}
		}
	}

	public static void main(String [] args)
	{
		mainThread = Thread.currentThread();
		
		MultiThredingDemo md = new MultiThredingDemo();
		
		md.start();
		
		


		for (int i=0;i<10 ;i++ )
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try
			{Thread.sleep(200);}
			catch (Exception e){}
		}
		
	}
}

*/


//------------------------------------------------------- Thread intrrupt


/*
class Test extends Thread
{

	public void run()
	{
		for (int i=0; i<10; i++)
		{
			System.out.println(Thread.currentThread().getName()+":: "+i);

			
				try{Thread.sleep(1000);	}
				catch (Exception e){
					System.out.println("Thread Interrupted.............!");
				}
			
		}
	}

}
class MultiThredingDemo 
{
	public static void main(String [] args)
	{
		Test t = new Test();
		t.start();
		try{Thread.sleep(4000);	}
		catch (Exception e){}
		t.interrupt();
	}
}

*/

/*
// Another way

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (Thread.interrupted()) {
                System.out.println("Thread was interrupted! Exiting...");
                return;
            }
            System.out.println("Processing: " + i);
            try {
                Thread.sleep(1000); // Simulate work
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted during sleep!");
                return; // Exit after interruption
            }
        }
        System.out.println("Thread completed normally.");
    }
}

public class MultiThredingDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        try {
            Thread.sleep(2000); // Let thread run for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.interrupt(); // Interrupt the thread
    }
}
*/
//------------------------------------------------------------ Anonymous

/*
class MultiThredingDemo  // by Thread class
{
	public static void  main(String[] args)
	{
		Thread th = new Thread(){
			public void run()
			{
				System.out.println("This is a Anonymous class by Thread");
			}
		};

		th.start();
	}
}
*/

/*
class MultiThredingDemo implements Runnable // runnable interface
{

	public void run()
	{	
	};
	public static void main(String[] args){
		
		Thread th = new Thread(new Runnable(){
			
			public void run(){
				
				System.out.println("This is anonymuos bt using Runnable() method");
			}
		});

		th.start();
	}
}

*/


// ---------------------------------------------------Syncronization

// need of Syncronization

class Book
{
}
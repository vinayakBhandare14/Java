
class Resource
{
	private String []data1 = {"hello", "Good day", "to", "all", "of you","wish", "you ", "all the", "best"};
	private String []data2 = {"THIS", "IS", "THE", "ANOTHER", "MESSAGE","DISPLAYED", "USING ", "DIFFERENT", "METHOD"};
	Object lock = new Object();
	 public void show() {
		System.out.println("The Data show() is: ");
		
		synchronized(lock) {
			for( int i=0 ; i<data1.length ; i++ ) {
				try{ Thread.sleep(200); } catch(Exception e){}
				System.out.println(data1[i]);
			}
		}
		System.out.println("End of show() ");
	}	
	public void display() {
		System.out.println("The Data display() is: ");

		synchronized(lock) {
			for( int i=0 ; i<data2.length ; i++ ) {
				try{ Thread.sleep(200); } catch(Exception e){}
				System.out.println(data2[i]);
			}
		}
		System.out.println("End of display() ");
	}
}
class DemoSyncMethod
{
	public static void main(String[] args) 
	{
		Resource rob = new Resource();

		// Thread 1
		Thread t1 = new Thread(){
			public void run() {
				rob.show();
			}
		};
		t1.start();

		// Thread 2
		Thread t2 = new Thread(){
			public void run() {
				rob.display();
			}
		};
		t2.start();

	}
}
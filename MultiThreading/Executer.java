class Task
{
	int total =0;
	public void calSum(){
		for (int i=0; i<10; i++)
		{
			total += i;
			try{Thread.sleep(500);}catch (Exception e){}
			System.out.println("i :: "+i);
		}
		System.out.println("Total :: "+total);
		}
}


class TaskExecuter extends Thread
{
	Task tob;
	public TaskExecuter(Task tob)
	{
		this.tob=tob;
	}
	public void run(){
		tob.calSum();
	}
}

class Executer 
{
	public static void main(String[] args) 
	{
		Task tob = new Task();
		TaskExecuter te = new TaskExecuter(tob);
		te.start();
	}
}

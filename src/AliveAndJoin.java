
public class AliveAndJoin {
	public static void main(String[]args) throws InterruptedException
	{
		Thread t1=new Thread(() ->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("go inside");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		 
	);
		Thread t2=new Thread(()->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("leave");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	);
	t1.start();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	t2.start();
	t1.join();
	t2.join();
	System.out.println(t1.isAlive());
	System.out.println("bye");
	}
	
}

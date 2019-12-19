
public class ThreadUsingLamdaExpression {
	public static void main(String[]args)
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
	}
}

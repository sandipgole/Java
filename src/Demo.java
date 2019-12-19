class hi extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
			{
		System.out.println("goto bathroom");
		try {
			Thread.sleep(1000);
			} 
		catch (InterruptedException e)
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
				}	
			}
	}
}
class hello extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("exit from bathroom");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Demo {
	public static void main(String[]args)
	{
		hi hiobj=new hi();
		hello helloobj=new hello();
		hiobj.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		helloobj.start();
	}

}

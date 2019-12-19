class goinside implements Runnable{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("goto bathroom");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class leave implements Runnable{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Exit from bathroom");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class RunnableInterface {
	public static void main(String[]args) throws InterruptedException
	{
		Runnable obj=new goinside();
		Runnable obj1=new leave();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		t1.start();
		Thread.sleep(1000);
		t2.start();
	}

}

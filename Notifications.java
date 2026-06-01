package task;
interface Notifier{
	void sendmsg(String message);
}
 class MobileNotification implements Notifier{
	public void sendmsg(String message) {
		System.out.println("mobile notification : "+message);
	}
}
 class EmailNotification implements Notifier{
		public void sendmsg(String message) {
			System.out.println("email notification : "+message);
		}
	}
 class InstaNotification implements Notifier{
		public void sendmsg(String message) {
			System.out.println("insta notification : "+message);
		}
	}
 class JobNotification implements Notifier{
		public void sendmsg(String message) {
			System.out.println("job notification : "+message);
		}
	}
 
public class Notifications {
	public static void main(String[] args)
	{
		MobileNotification a=new MobileNotification();
		EmailNotification b=new EmailNotification();
		InstaNotification c=new InstaNotification();
		JobNotification d=new JobNotification();
		a.sendmsg("you recieved 1000 rupees");
		b.sendmsg("you recived job offer");
		c.sendmsg("you recived insta follower");
		d.sendmsg("you recived job offer from cts tcs oracle amazon");
	}
}

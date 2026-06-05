package task;
interface Upi
{
	void paythroughupi();

}
interface ThrBank
{
	void paythroughtbank();
}
class Transaction implements Upi,ThrBank
{
	public void paythroughupi()
	{
		System.out.println("Transaction done through by upi");
	}
	public void paythroughtbank()
	{
		System.out.println("Transaction done through by Bank");
	
	}
}

public class Inte {
	public static void main(String[] args)
	{
		Transaction a=new Transaction();
		a.paythroughupi();
		a.paythroughtbank();
	}
}

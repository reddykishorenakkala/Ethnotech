package task;
public class Bank 
{
	int bal;
	public void setbalance(int bal) {
		this.bal=bal;
	}
	public int getbalance()
	{
		return bal;
	}
	public static void main(String[] args)
	{
		Bank b=new Bank();
		b.setbalance(50);
		System.out.print(b.getbalance());
		
	}
}
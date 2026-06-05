package task;
import java.util.*;
public class LinkedListExample {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<String> list=new LinkedList<>();
		int n=sc.nextInt();
		/*list.add("kis");
		list.add("man");
		list.add("robo");
		list.remove(2);*/
		for(int i=0;i<=n;i++)
		{
			list.add(sc.nextLine());
		}
		System.out.println(list);
	}
}

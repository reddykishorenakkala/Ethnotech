package task;
import java.util.*;
public class WeatherReport {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++)
		{
			min=Math.max(max, arr[i]);
			max=Math.min(min, arr[i]);
			
		}
	}
}

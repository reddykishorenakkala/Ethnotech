package task;

public class Eletricitybill {
	 public static void main(String[] args) 
	 {
	      int units = 1000;  
	      int bill = 0;
	      if (units > 250) 
	      {
	          int excess = units - 250;
	          int blocks = excess / 50;  
	          bill = blocks * 50;
	      }
	       System.out.println("Units: " + units);
	       System.out.println("Bill: " + bill);
	 }
}

import java.util.Scanner;
public class DateTest {
	
	public static void main(String[] args)
		
	{
		Date d1=new Date();
		//Date d2=new Date();
	  Scanner input=new Scanner(System.in);
	  
	  System.out.println("\nEnter Month as required");
	  int m1=input.nextInt();
	  d1.setMonth(m1);
	  

	  System.out.println("\nEnter Day as required");
	  int d=input.nextInt();
	  d1.setDay(d);
	  

	  System.out.println("\nEnter Year as required");
	  int y=input.nextInt();
	  d1.setYear(y);
	  
	  d1.displayDate();
	}

}

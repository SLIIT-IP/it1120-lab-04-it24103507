import java.util.Scanner;
public class IT24103507Lab4Q3 {
	public static void main(String [] args)  {

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number: ");
	double number = scanner.nextDouble();

	String result = (number>0)? "The number is Positive."
			: (number<0)? "The number is Negative."
			: "The number is zero." ;
	System.out.println("result= " + result);
			
	  
 	scanner.close();
	}
}
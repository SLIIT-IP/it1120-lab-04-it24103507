import java.util.Scanner;
public class IT24103507Lab4Q2 {
	public static void main(String [] args)  {

	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter exam marks (out of 100): ");
	double examMarks = scanner.nextDouble();
	System.out.println("Please enter lab submission marks (out of 100): ");
	double labMarks = scanner.nextDouble();
	
	
	if(examMarks > 100 || examMarks < 0 || labMarks > 100 || labMarks < 0) {
		System.out.println("Invalid output for exam or lab marks.Terminating program ");
	return;
	}

	
	System.out.println("Please enter the percentage given for the exam: ");
	double examPercentage = scanner.nextDouble();
	System.out.println("Please enter the percentage given for the lab submission: ");
	double labPercentage = scanner.nextDouble();

	
	if (Math.abs (examPercentage + labPercentage - 100) > 0.001) {
		System.out.println("The percentages must add up to 100.Terminating program ");
	return;
	}

	double finalMark = (examMarks* examPercentage / 100) + (labMarks* labPercentage / 100);
	System.out.println("The final mark is: " + finalMark);
	scanner.close();
	
	}
}


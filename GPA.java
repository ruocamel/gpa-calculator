import java.util.ArrayList;
import java.util.Scanner;

public class GPA {

	//main method
	public static void main(String[] args)
	{
		ArrayList<Course> courses = new ArrayList<Course>();
		
		while (true)
		{
			System.out.print("Name of the course: ");
			Scanner scanName = new Scanner(System.in);
			String name = scanName.nextLine();
			
			System.out.print("Number of credits: ");
			Scanner scanCredits = new Scanner(System.in);
			int credits = scanCredits.nextInt();
			
			System.out.print("Grade received: ");
			Scanner scanGrade = new Scanner(System.in);
			String grade = scanGrade.nextLine();
			
			Course course = new Course (name, credits, grade);
			courses.add(course);
			
			System.out.println("Course " + name + " added. Press enter to add another course or type 'done' to calculate your GPA!");
			Scanner scanStop = new Scanner (System.in);
			String stop = scanStop.nextLine();
			if (stop.equals("done"))
				break;
		}
		
		System.out.println("Your GPA is: " + calculateGPA(courses));
	}
	
	//method that calculates GPA
	public static double calculateGPA(ArrayList<Course> courses)
	{
		double sumPoints = 0;
		double sumCredits = 0;
		for (Course c : courses)
		{
			double points = c.convertGrade(c.getGrade()) * c.getCredits();
			sumPoints = sumPoints + points;
			sumCredits = sumCredits + c.getCredits();
		}
		double GPA = sumPoints/sumCredits;
		return GPA;
	}

}


public class Course {

	//attributes
	private String name;
	private int credits;
	private String grade;
	
	//constructor
	public Course(String name, int credits, String grade)
	{
		this.name = name;
		this.credits = credits;
		if (!grade.equals("A") && !grade.equals("B+") && !grade.equals("B")  && !grade.equals("B-") && !grade.equals("C+") 
				&& !grade.equals("C") && !grade.equals("D")  && !grade.equals("F"))
			throw new IllegalArgumentException ("Invalid grade!");
		this.grade = grade;
		
	}
	
	//getter method for course name
	public String getName()
	{
		return this.name;
	}
	
	//getter method for course credits
	public int getCredits()
	{
		return this.credits;
	}
	
	//getter method for course grade
	public String getGrade()
	{
		return this.grade;
	}
	
	//this method converts a letter grade into grade points
	public double convertGrade (String grade)
	{
		double gradePoints = 0;
		if (this.grade.equals("A"))
			return gradePoints = 4.0;
		else if(this.grade.equals("A-"))
			return gradePoints = 3.7;
		else if(this.grade.equals("B+"))
			return gradePoints = 3.3;
		else if(this.grade.equals("B"))
			return gradePoints = 3.0;
		else if(this.grade.equals("B-"))
			return gradePoints = 2.7;
		else if(this.grade.equals("C+"))
			return gradePoints = 2.3;
		else if(this.grade.equals("C"))
			return gradePoints = 2.0;
		else if(this.grade.equals("D"))
			return gradePoints = 1.0;
		else
			return gradePoints;	
	}
}

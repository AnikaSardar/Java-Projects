import java.util.Scanner;
import java.io.*;

/**
 * GradeBookDemo program
 * This program tests the GradeBook class by
 * using the data stored in the StudentInfo.txt
 * file.
 */

public class GradeBookDemo
{
	public static void main(String[] args)
	                    throws IOException
	{
		// Create a GradeBook object.
		GradeBook gb = new GradeBook();

		// Read the data from the file and put the data into grade book gb
		readFromFile(gb);
		
		
		// Display the student data.
		for (int i = 0; i <= 4; i++)
		{
			String value1=gb.getName(i);
			double value2=gb.getAverage(i);
			double value3=gb.getLetterGrade(i);
			
			System.out.println("Name : " + gb.getName(i) +
			                   "\tAverage score: " + 
									 gb.getAverage(i) +
									 "\tGrade: " + 
									 gb.getLetterGrade(i));
		}
	}


	/**
	 * readFromFile method
	 */
	
	public static void readFromFile(GradeBook gb)
	                    throws IOException
	{
		// Create the necessary objects for file input.
		File file = new File(".\\src\\StudentInfo.txt");
		Scanner inFile = new Scanner(file);
		
		/* Missing code start here */
		double[] scores=new double[4];
		
		for(int student=0; student<=4; student++) {
			String name=inFile.nextLine();
			gb.setName(student, name);
			
			for (int i=0; i<4; i++) {
				scores[i]=Double.parseDouble(inFile.nextLine());
			}
			gb.setScores(student, scores);
		}




       /* Missing code end here */
	   
	   // Close the file.
		inFile.close();
	}
}

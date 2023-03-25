import java.util.Scanner;

/**
 * DriverTest program.
 */

public class DriverTest
{
   public static void main(String[] args)
   {
		// Constant for the number of answers
      final int NUM_ANSWERS = 20;
		
		// Array to hold the student's answers
      char[] answers = new char[NUM_ANSWERS];
		
		// This will reference an array holding the
		// question numbers of the missed questions.
      int[] missedQuestions = null;
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
		
      // Get the user's answers to the questions.
      System.out.println("Enter your answers to the " +
                         "exam questions. (Make sure " +
                         "Caps Lock is ON!)");

      for (int i = 0; i < answers.length; i++)
      {
         System.out.print("Question " + (i + 1) + ": ");
	 String input = keyboard.nextLine();
         answers[i] = input.charAt(0);

         // Validate the answer.
         while (!valid(answers[i]))
         {
            System.out.println("ERROR: Valid answers are " +
                               "A, B, C, or D.");
            System.out.print("Question " + (i + 1) + ": ");
    			input = keyboard.nextLine();        
				answers[i] = input.charAt(0);
         }
      }
      
      // Create a DriverExam object.
      DriverExam exam = new DriverExam(answers);
      
      // Get an array of the missed question numbers.
      missedQuestions = exam.questionsMissed();
      
      // Display a report.
      System.out.println("Correct answers: " + 
		                   exam.totalCorrect());
      System.out.println("Incorrect answers: " + 
		                   exam.totalIncorrect());
      
		// Display whether the student passed or failed.
      if (exam.passed())
         System.out.println("You passed the exam.");
      else
         System.out.println("You failed the exam.");
      
		// Display a list of missed questions, if any.
      if (missedQuestions != null)
      {
         System.out.println("You missed the following questions:");
         for (int i = 0; i < missedQuestions.length; i++)
            System.out.print(missedQuestions[i] + " ");
      }
   }
   
   /**
    * valid method
    * Returns true if the argument is A, B, C, or D.
    */
   
   public static boolean valid(char c)
   {
      boolean status;
      
      if (c == 'A' || c == 'B' || c == 'C' || c == 'D')
         status = true;
      else
         status = false;
      
      return status;
   }
}

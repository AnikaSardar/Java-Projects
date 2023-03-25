/**
 * DriverExam class
 */

public class DriverExam
{
   // Array containing the correct answers
   private char[] correct = { 'B', 'D', 'A', 'A',
                              'C', 'A', 'B', 'A',
                              'C', 'D', 'B', 'C',
                              'D', 'A', 'D', 'C',
                              'C', 'B', 'D', 'A' };

   private char[] student;       // The student's answers
   private int[] missed;         // The missed question numbers
   private int numCorrect = 0;   // The number correct
   private int numIncorrect = 0; // The number incorrect
   
   /**
    * Constructor
    * Accepts an array of the student's
    * answers as the argument. The contents
    * of the array are copied to the student
    * field.
    */
   
   public DriverExam(char[] s)
   {
      student = s;
      gradeExam();
   }
   
   /**
    * gradeExam method
    * This method determines the number of
    * correct and incorrect answers. It calls
    * the makeMissedArray method.
    */
   
   private void gradeExam()
   {
     /* Missing code starts here */
	   //Compare the contents of array correct and array student 
	   //Update the numCorrect and numIncorrect
	  
	   for(int i=0; i<student.length; i++) {
		   if (student[i]==correct[i]) {
			  numCorrect+=1;
		   }
		   else {
			   numIncorrect+=1;
		   }
	   }

     /* Missing code ends here */
     makeMissedArray();
   }  
   
   /**
    * makeMissedArray method
    * This method makes the missed array and
    * stores the numbers of all the questions
    * that the student missed in it.
    */
   
   private void makeMissedArray()
   {
     /* Missing code starts here */
	   if (numIncorrect>0) {
		   //Create array missed
		   //Compare the contents of array correct and array student 
		   //Place missed question numbers into array missed
		   missed=new int[numIncorrect];
		   for(int i=0; i<student.length; i++) {
			   if (student[i]!=correct[i]) {
				   missed[i]=i+1;
			   }
			   
		   }
		   
	   }


     /* Missing code ends here */
   }
   
   /**
    * passed method
    */
   
   public boolean passed()
   {
      boolean status;
      
      if (numCorrect >= 15)
         status = true;
      else
         status = false;
         
      return status;
   }
   
   /**
    * totalCorrect method
    */

   public int totalCorrect()
   {
      return numCorrect;
   }

   /**
    * totalIncorrect method
    */

   public int totalIncorrect()
   {
      return numIncorrect;
   }

   /**
    * questionsMissed method
    * Returns an array containing the numbers
    * of the missed questions. If no questions
    * were missed, returns null.
    */

   public int[] questionsMissed()
   {
       return missed;
   }
}

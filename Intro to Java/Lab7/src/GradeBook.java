/*
 * Lab07 
 * Anika Sardar
 * 05/05/22
 */

public class GradeBook {
private String[] names=new String [5]; 
private double[] scores1= new double [4];
private double[] scores2= new double [4];
private double[] scores3= new double [4];
private double[] scores4= new double [4];
private double[] scores5= new double [4];

public void  setName (int studentNumber, String name) {
	//Place name into names based on studentNumber 

	names[studentNumber]=name;
	}

public void setScores (int studentNumber, double [] scores) {
	//Copy the content of scores into one of 5 scores arrays based on student number
	//if-else statement
	
for (int i=0; i<scores.length; i++) {
	if (studentNumber==0)
		scores1[i]=scores[i]; 
	else if (studentNumber==1)
		scores2[i]=scores[i]; 
	else if (studentNumber==2)
		scores3[i]=scores[i]; 
	else if (studentNumber==3)
		scores4[i]=scores[i]; 
	else if (studentNumber==4)
		scores5[i]=scores[i]; 
			
		
	}
}

public String getName(int studentNumber) {
	//Return student name from array names based on studentNumber
	return names[studentNumber];
}
public double getAverage(int studentNumber) {
	//Return average score based on studentNumber

double total=0;
for (int i=0; i<scores1.length; i++) 
	if (studentNumber==0) {
		total+=scores1[i];
}
	else if (studentNumber==1) {
		total+=scores2[i];
		}
	
	else if (studentNumber==2) {
		total+=scores3[i];
	}
	else if (studentNumber==3) {
		total+=scores4[i];
	}
	else if (studentNumber==4) {
		total+=scores5[i];
	}
	
	return total/scores1.length;


}
public char getLetterGrade(int studentNumber) {
	//Return letter grade based on studentNumber
	char letterGrade=' ';
	
	int value=(int)getAverage(studentNumber);
	
	 if(value>=90 && value<=100)
		            letterGrade = 'A';
	 
	 else if(value>=80 && value<=89)
		            letterGrade = 'B';
		 
	else if(value>=70 && value<=79)
		 			letterGrade = 'C';
	 
	else if(value>=60 && value<=69)
					letterGrade = 'D';
		 
	else 
		 letterGrade = 'F';
	
	 return letterGrade;

}
}

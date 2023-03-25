/**
 * Lab5
 * @author Anika Sardar
 *Date last updated 04/07/2022
 */

public class Procedure {
	private String procedureName; 
	private String procedureDate;
	private String practitioner; 
	private double charge; 
	
	/**Constructor
	 * @param proN The procedure's name 
	 * @param proD The procedure's date
	 * @param prac The practitioner's name 
	 * @param charg The procedure's charge
	 */
	
	public Procedure(String proN, String proD, 
			String prac, double charg)
	{
		procedureName=proN;
		procedureDate=proD;
		practitioner=prac;
		charge=charg;
		
}
	//Mutator
	
	public void setProcedureName(String proN) {
		procedureName=proN;
	}
	public void setProcedureDate(String proD) {
		procedureDate=proD;
	}
	public void setPractitioner(String prac) {
		practitioner=prac;
	}
	public void setCharge (double charg)
	{
		charge=charg;
	}
	
	//Accessor 
	
	public String getProcedureName()
	{ 
		return procedureName;
	}
	public String getProcedureDate()
	{ 
		return procedureDate;
	}
	public String getPractitioner()
	{ 
		return practitioner;
	}
	public double getCharge()
	{ 
		return charge;
	}
	
	
	
	
}
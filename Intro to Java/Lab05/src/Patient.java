/**
 * Lab5
 * @author Anika Sardar
 *Date last updated 04/07/2022
 */

public class Patient {
	private String firstName;
	private String middleName; 
	private String lastName; 
	private String address; 
	private String city; 
	private String state; 
	private String zip; 
	private String emergencyName;
	private String emergencyPhone;
	
	/**Constructor
	 * @param fn  The first name of the patient
	 * @param mn  The middle name of the patient
	 * @param ln  The last name of the patient
	 * @param ad  The address of the patient 
	 * @param cit The city the patient resides in 
	 * @param sta The state the patient resides in 
	 * @param zc  The zipcode of the patient's address
	 * @param en  The patient's emergency contact name 
	 * @param ep  The patient's emergency contact phone number
	*/
	public Patient(String fn, String mn, String ln, String ad, 
			String cit, String sta, String zc, String en, String ep) 
	{
		firstName=fn;
		middleName=mn;
		lastName=ln;
		address=ad;
		city=cit;
		state=sta;
		zip=zc;
		emergencyName=en;
		emergencyPhone=ep; 
}
	
	//Mutator
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setMiddleName(String mn) {
		middleName=mn;
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
	public void setAddress(String ad) {
		address=ad;
	}
	public void setCity(String cit) {
		city=cit;
	}
	public void setState(String sta) {
		state=sta;
	}
	public void setZip(String zc) {
		zip=zc;
	}
	public void setEmergencyName(String en) {
		emergencyName=en;
	}
	public void setEmergencyPhone(String ep) {
		emergencyPhone=ep;
	}
	
	//Accessor 
	
	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	public String getEmergencyName() {
		return emergencyName;
	}
	public String getEmergencyPhone() {
		return emergencyPhone;
	}
	
	
}
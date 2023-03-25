
/**
 * Lab3
 * @author Anika Sardar
 *Date last updated 03/03/2022
 */
public class Twelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int day; //initializing each verse
	
	for (day=1; day<=12; day++) {
		
		System.out.print("On the ");
		
		switch(day) { 
		case 1: 
		{
			System.out.print("first ");
			break;
		}
		case 2: 
		{
			System.out.print("second ");
			break;
		}
		case 3: 
		{
			System.out.print("third ");
			break;
		}
		case 4: 
		{
			System.out.print("fourth ");
			break;
		}
		case 5: 
		{
			System.out.print("fifth ");
			break;
		}
		case 6: 
		{
			System.out.print("sixth ");
			break;
		}
		case 7: 
		{
			System.out.print("seventh ");
			break;
		}
		case 8: 
		{
			System.out.print("eighth ");
			break;
		}
		case 9: 
		{
			System.out.print("ninth ");
			break;
		}
		case 10: 
		{
			System.out.print("tenth ");
			break;
		}
		case 11: 
		{
			System.out.print("eleventh ");
			break;
		}
		case 12: 
		{
			System.out.print("twelfth ");
			break;
		}

	}
		System.out.print("day of Christmas, my true love sent to me:"+"\n");
		
		//for each verse, the remainder lyrics are printed
		
		switch(day) {
		case 12: 
		{
			System.out.print("Twelve drummers drumming,"+"\n");
		}
		case 11: 
		{
			System.out.print("Eleven pipers piping,"+"\n");
					
		}
		case 10: 
		{
			System.out.print("Ten lords-a-leaping,"+"\n");
				
		}
		case 9: 
		{
			System.out.print("Nine ladies dancing,"+"\n");
				
		}
		case 8: 
		{
			System.out.print("Eight maids-a-milking,"+"\n");
				
		}
		case 7: 
		{
			System.out.print("Seven swans-a-swimming,"+"\n");
				
		}
		case 6: 
		{
			System.out.print("Six geese-a-laying,"+"\n");
				
		}
		case 5: 
		{
			System.out.print("Five golden rings."+"\n");
					
				
		}
		case 4: 
		{
			System.out.print("Four calling birds,"+"\n");
				
		}
		case 3: 
		{
			System.out.print("Three French hens,"+"\n");
				
		}
		case 2: 
		{
			System.out.print("Two turtle doves, and"+"\n");
				
		}
		case 1: 
		{
			System.out.print("a Partridge in a pear tree."+"\n"+"\n");
				
		}
	}

}
}
}
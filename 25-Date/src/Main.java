import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//Simpledate  format is a concrete class for formatting and parsing date which inherits;
		//java.text.Dateformat class;
		//Formatting - means converting date to string;
		//parsing - means converting string to date;
		
		Date date = new Date();//you need to import because is coming from another package. 
		System.out.println(date);//is getting the date from your system
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
		String strDate = formatter.format(date);
		System.out.println(strDate);//Wed Nov 21 11:21:52 EST 2018 	21/21/2018
		
		formatter = new SimpleDateFormat("MM/dd/yyyy");
		strDate = formatter.format(date);
		System.out.println(strDate);//11/21/2018
		
		formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		strDate = formatter.format(date);
		System.out.println(strDate);//21-11-2018 11:26:08
		
		formatter = new SimpleDateFormat("dd MMMM yyyy");
		strDate = formatter.format(date);
		System.out.println(strDate);//21 November 2018
		
		
		formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
		strDate = formatter.format(date);
		System.out.println(strDate);//21 November 2018 Eastern Standard Time
		
		formatter = new SimpleDateFormat("EEEE,dd MMM yyyy HH:mm:ss z");
		strDate = formatter.format(date);
		System.out.println(strDate);//Wednesday,21 Nov 2018 11:31:58 EST
		
		//Convert String into Date 
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date=formatter.parse("31/03/2015");//we use parse to converts string to date 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date);//Tue Mar 31 00:00:00 EDT 2015
		
	
		

	}

}

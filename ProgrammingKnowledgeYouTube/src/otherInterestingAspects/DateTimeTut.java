package otherInterestingAspects;
import java.util.Date; // Has a lot of depracated methods
import java.text.SimpleDateFormat;
import java.util.Calendar; // Modern recommended option


public class DateTimeTut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Date =  Usual way of doing things, old school
		Date date  = new Date();
		System.out.println(date.toString()); // normal string
		System.out.println(date.getTime()); // epoch

		//Calendar =  a more modern way of getting things
        Calendar c = Calendar.getInstance(); 
        System.out.println("The Current Date is:" + c.getTime());
        
        //Date formatter =  a simpler way of displaying date info
        SimpleDateFormat sdf1 =  new SimpleDateFormat("d-M-YYYY");
        SimpleDateFormat sdf2 =  new SimpleDateFormat("D");
        System.out.println(sdf1.format(date));
        System.out.println("Day "+sdf2.format(date)+" of 365");

	}

}

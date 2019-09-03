/**
 * 
 */
package filesTut;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Timestamp;
import java.util.Scanner;
import java.util.Date;

/**
 * @author Dasaed
 *
 */
public class CreateWriteFile {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in);
		System.out.println("Please enter the name of your new file");
		String myFile = input.nextLine();
		try {
			File file1 = new File(myFile);
			if (!file1.exists()) {
				file1.createNewFile();
			}
			PrintWriter pw = new PrintWriter(file1);
	        Date date = new Date();
			pw.println("It is now "+date+" Or "+date.getTime());

			for (int i = 1 ; i<11; i++) {
				pw.println("This is line "+Integer.toString(i));
			}
			pw.println("--------------------------------");
			pw.close();
			System.out.println("Done");
		}
		catch (Exception e) {
			System.out.println("Found an exection");
			System.out.println(e);
		}
		
		input.close();
		System.exit(0);
		
		
	} //end of main method

} //end of class
package filesTut;
import java.io.BufferedReader; //used to read the data
import java.io.FileReader; // Read the file 
import java.io.IOException; // handle exceptions

public class ReadUpdateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		try {
			br = new BufferedReader( new FileReader("FileToRead.txt") );
			String line;
			while ( ( line = br.readLine() ) !=null ) {
				System.out.println(line);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // end of main

} // end of class

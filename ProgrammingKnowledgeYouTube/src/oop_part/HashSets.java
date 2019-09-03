package oop_part;
import java.util.*;
public class HashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hash set is different from sets\n");
		
		HashSet<String> hsName =  new HashSet<String>(
				/*You can put a fixed size here if you 
				 * want, or other things*/);
		hsName.add("Carlos");
		hsName.add("Dasaed");
		hsName.add("Salcedo");
		hsName.add("Carreno");
		hsName.add("Carlos");
		hsName.add("Carlos");
		
		Iterator<String> itrHSName = hsName.iterator();
		
		while(itrHSName.hasNext()) {
			System.out.println(itrHSName.next());
		} 
		HashSet hsName2 = (HashSet) hsName.clone();
		
		System.out.println(itrHSName);
		System.out.println(hsName);
		hsName.clear();
		System.out.println(hsName);
		System.out.println(hsName2);
		
		
		
		
	}

}

package oop_part;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.lang.reflect.Array;

public class Tut30_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("These are simple arrays. They have a fixed size");
		int simple_arrayA[] = new int [5];
		for (int i = 0; i<5; i++) {
			simple_arrayA[i] = (int) (Math.random()*5 + 5);
		}
		
		int simple_arrayB[] = {1,2,3,4,5};
		System.out.println(Arrays.toString(simple_arrayA));
		System.out.println(Arrays.toString(simple_arrayB));
		System.out.println("");

		System.out.println("These are ArrayLists (ie Java's implementation of lists)");
		System.out.println("ArrayList<Integer> myList = new ArrayList<Integer>(5);");
		System.out.println("ArrayList<Type> objName = new ArrayList<Type>(Initial Size, "
				+ "\nbut can be dynamically changed later on);");
		
		
		ArrayList<Integer> myList = new ArrayList<Integer>(5);
		myList.add( (int) (Math.random()*10 + 20 ));
		myList.add( (int) (Math.random()*10 + 20 ));
		myList.add( (int) (Math.random()*10 + 20 ));
		myList.add( (int) (Math.random()*10 + 20 ));
		myList.add( (int) (Math.random()*10 + 20 ));
		System.out.println("This is an ArrayList:");
		System.out.println(Arrays.toString(myList.toArray()));
		System.out.println("This is the size of myList: "+(myList.size()));
		myList.add( (int) (Math.random()*10 + 20 ));
		myList.add( (int) (Math.random()*10 + 20 ));
		System.out.println("This is the same ArrayList, but with 2 additional members:");
		System.out.println(Arrays.toString(myList.toArray()));
		System.out.println("This is the size of myList: "+Array.getLength(myList.toArray()));
		System.out.println("Here are some common ArrayList Methods: ");
		myList.remove(2); //Remove the element at index 2
		Collections.sort(myList); // Sorts the list
		System.out.println(Arrays.toString(myList.toArray()));
		myList.clear();
		System.out.println(Arrays.toString(myList.toArray()));

		LinkedList<String> heros = new LinkedList<String>();
		heros.add("Spiderman");
		heros.add("Superman");
		heros.add("Hellboy");
		heros.addFirst("Ironman");
		heros.addLast("Thors");
		System.out.println(heros);
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add( (int) (Math.random()*10 + 30  ) );
		numbers.add( (int) (Math.random()*10 + 30 ) );
		numbers.add( (int) (Math.random()*10 + 30 ) );
		numbers.add( (int) (Math.random()*10 + 30 ) );
		numbers.add( (int) (Math.random()*10 + 30 ) );
		numbers.addFirst( (int) (Math.random()*10 + 30 ) );
		numbers.addLast( (int) (Math.random()*10 + 30 ) );
		numbers.set(3, 303);
		System.out.println(numbers);
		Collections.sort(numbers);
		numbers.forEach((temp) -> {
		    System.out.println(temp);
		});
		
		ArrayList<String> lastNames = new ArrayList<String>();
		lastNames.add("Prada");
		lastNames.add("Garavito");
		lastNames.add("Salcedo");
		lastNames.add("Carreno");
		lastNames.add("Baker");
		
		ListIterator<String> itrLastNames = lastNames.listIterator();
		while ( itrLastNames.hasNext() ) {
			System.out.println( itrLastNames.next() );			
		}
		System.out.println(itrLastNames.previousIndex());
		System.out.println(itrLastNames.previous());
		System.out.println(itrLastNames.previous());
		System.out.println("So why use iterators instead of foreach or for loops??");
		System.out.println("Iterators let you remove items as you are iterating.");
		

		

		

	}

}

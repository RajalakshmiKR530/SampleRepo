package collections;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> l = new ArrayList <String> ();  //create list
		
		//  add() - to add elements in a list
		
		l.add("apple");
		l.add("orange");
		l.add("grapes");
		l.add("kiwi");
		l.add("apple");
		l.add("mango");
		System.out.println(l);
		
		//set() -to replace an element from a set
		
		l.set(1, "pear");
		System.out.println(l);
		
		//get() - get an element from a particular index
		
		System.out.println(l.get(0));
		
		// contains() -to check whether  particular element in the list
		
		System.out.println(l.contains("kiwi"));
		System.out.println(l.contains("pineapple"));
		
		//isEmpty() - to check whether the list is empty or not
		
		System.out.println(l.isEmpty());
		
		// indexOf() - return the index of first occurrence of element
		
		System.out.println(l.indexOf("apple"));
		
		//lastIndexOf() - return the index of last occurrence of element
		
		System.out.println(l.lastIndexOf("apple"));
		
		//remove() - to remove a particular element
		
		l.remove(3);
		l.remove("mango");
		System.out.println(l);
		
		//size() - to find the length of a list
		
		System.out.println(l.size());
		
		
		
		
		
		
		
		
		
		
		
	}

}

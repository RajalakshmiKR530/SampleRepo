package collections;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> s = new HashSet <String> ();
		s.add("zero");
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("four");
		
		System.out.println(s);
		
		Set <String> s1 =  new HashSet <String>();
		
		s1.add("five");
		s1.add("six");
		s1.add("seven");
		s1.add("eight");
		System.out.println(s1);
		
		s.addAll(s1);
		System.out.println(s);
		
		s1.addAll(s);
		System.out.println(s1);
		
		System.out.println(s.contains("one"));
		System.out.println(s1.contains("ten"));
		
		System.out.println(s.isEmpty());
		
		s.remove("zero");
		System.out.println(s);
		
		//s.removeAll(s1);
		//System.out.println(s);
		
		//s1.removeAll(s);
		//System.out.println(s);
		
		System.out.println(s.size());
		
		//s1.clear();
		System.out.println(s1);
		
		
		
		
		
		
		
		
		
	}
}
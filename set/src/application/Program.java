package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		Set<Integer> set2 = new TreeSet<>();
		Set<Double> set3 = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		set2.add(1);
		set2.add(222);
		set2.add(34);
		
		set3.add(23.2);
		set3.add(2.3);
		set3.add(32.1);
		
		set.remove("TV");
		set.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}

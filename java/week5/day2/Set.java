package week5.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Set<String> name = new LinkedHashSet<String>();     //insetion value
//		java.util.Set<String> name = new HashSet<String>();
//		java.util.Set<String> name = new TreeSet<String>();
		
		
		name.add("balaji");
		name.add("gopi");
		boolean add = name.add("ani");
		System.out.println(add);
		name.add("bobby");
		
		System.out.println(name);
		
		boolean add2 = name.add("mani");
		System.out.println(add2);
		
		boolean add3 = name.add("mani");
		System.out.println(add3);
		
		
		java.util.List<String>	value = new ArrayList<String>(name);
		System.out.println(value.get(1));
		

	}

}

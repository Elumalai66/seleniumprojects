package week5.day2;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.collections4.Get;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		java.util.List<Integer>	value = new ArrayList<Integer>();
	//	java.util.List<Integer>	value = new LinkedList<Integer>();
		
		value.add(100);
		value.add(200);
		value.add(300);
		value.add(400);
		value.add(500);
		value.add(600);
		value.add(700);
		
		for (Integer integer : value) {
			
			System.out.println(integer);
			
		}
		
		Collections.sort(value);
		System.out.println(value);
		
		Collections.reverse(value);
		System.out.println(value);
		
		System.out.println (value.get(3));
		System.out.println(value.size());

	}

}

package Collections;

import java.util.*;

public class ArrayListClass {
	public static void main(String[] args) {
		List<Integer> value = new LinkedList<>();
		value.add(12);
		value.add(25);
		value.add(89);
		value.add(895);
		value.add(1250);
		value.remove(0);
		
		System.out.println(2);
		value.remove(2);
		System.out.println(value.get(0));
		System.out.println(value.contains(89));
		System.out.println(value.indexOf(89));
		System.out.println(value.indexOf(489));
		value.set(0, 25);
		value.clear();
		System.out.println( value.contains(value));
		Iterator<Integer> itr = value.iterator();
		while(itr.hasNext()) {
			Integer item = itr.next();
			System.out.println(item);
		}
	}
}

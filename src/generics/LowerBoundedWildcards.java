package generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcards {

	
	public static void addIntegersToList(List<? super Integer> list) {
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
	}
	
	
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		addIntegersToList(myList);
		System.out.println(myList);
			
		List<Object> myList2 = new ArrayList<Object>();
		addIntegersToList(myList2);
		System.out.println(myList2);
	
		List<Number> myList3 = new ArrayList<Number>();
		System.out.println(myList3);
		System.out.println(myList3);
	}

}

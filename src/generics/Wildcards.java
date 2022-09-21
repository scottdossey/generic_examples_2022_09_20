package generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {

	//Let's say we want to create a method
	//that adds up a list of numbers....	
	public static double sumOfList(List<? extends Number> list) {
		double total = 0.0;
		for (Number value: list) {
			total += value.doubleValue();
		}
		return total;
	}
	
	
	
	
	
	public static void main(String[] args) {
		//Let's say you wnat to create a list that can 
		//hold any reference type.
		
		//One way you could do that is you could a raw type.
		//you will unfortunately get a warning every time you use it.
		List myList = new ArrayList();
		myList.add("Hello") ; //Every time I used it I get a yellow line (Warning)
		
		
		//Another better solution would be to store a list of Object.
		List<Object> myList2 = new ArrayList();
		myList2.add("Hello");
		myList2.add(9);
		
		//A third way is to use a wildcard.
		List<?> myList3 = new ArrayList<String>();
		myList3 = new ArrayList<Integer>();
		
		//So you can kindof think of a List<?> as a superclass 
		//for all List<String> List<Integer> List<Whatever>

		List<? extends Number> wildcardList;
		
		wildcardList = new ArrayList<Integer>();
		
		wildcardList = new ArrayList<Double>();

		//List<Number> numberList = new ArrayList<>();
		//numberList = new ArrayList<Integer>();
		List<Integer> integerList = new ArrayList<>();
		integerList.add(7);
		integerList.add(5);
		integerList.add(3);
		
		System.out.println(sumOfList(integerList));
		
		//The only time youi want to use an unbounded wildcard....
		//is when
		//1. You are writing a method that can be implemented using
		//   functionality of java.lang.Object
		//2. There may be methods of your generic class that you can use
		//   that don't depend on generic parameters.
		
		List<?> x = integerList;
		int value = x.size(); //Perfectly legal to call because no
		                       //generics are involved.
		
		Integer value = x.get(0); //Illegal because the return type
		//is the generic parameter T.
		
		
	}

}

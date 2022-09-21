package generics;

public class GenericMethodExample2 {

	//We simply cannot use ">"--that is defined in Java to only
	//work with certain number classes...and there is no superclass
	
	//We are going to add a constraint to T known as upper bound.
	//This contraint will specify that T has to inherit from Comparable.
	
	public static <T extends Comparable<T>> int greaterThan(T[] numArray, T element) {
		int count = 0;
		for (T value: numArray) {
			if (value.compareTo(element) > 0) {
				count += 1;
			}
		}
		return count;
	}
	
	
	
	public static void main(String[] args) {
		Double[] values = { 7.7, 3.2, 1.5, 7.9, 15.23 };
		System.out.println(greaterThan(values, 6.0));
			
		
		Integer[] values2 = { 7, 3, 5, 9, 12};
		System.out.println(greaterThan(values2, 6));
		
		//if ("he" > "hello") {
			
		//}
		
		String[] values3 = { "a", "b", "c" };
		System.out.println(greaterThan(values3, "whatever"));
		
		
	}

}

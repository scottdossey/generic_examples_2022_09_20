package generics;

public class GenericMethodExample {

	//Let's create one printArray that works with any type.
	//To that we are going to use a generic parameter called T
	
	//T is just kinda like a variable name but it represent a type.
	// things like String, Double, Integer
	
	//So T is going to be what we call a TYPE PARAMETER. There's a convention
	//that type parameters are usually one or two capital letters.
	
	//We are going to define printArray as a "generic method"
	//We do these by specifying what type parameters it takes before
	//the return type.
	public static <T> void printArray(T[] array) {
		for (T element : array) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	
	
	public static void main(String[] args) {
		Double[] values= {1.0, 3.14159, -17.6, 5.3, 12.7};
		printArray(values);

		String[] names = {"John", "Jacob", "Jingle", "Heimer",
				          "Schmidt", "Aaron"};
		printArray(names);
		
		Integer[] intValues = {1,2,3,4,5};
		printArray(intValues);
		
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		printArray(charArray);
						
	}

}

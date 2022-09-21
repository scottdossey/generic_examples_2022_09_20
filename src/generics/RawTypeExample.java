package generics;

import java.util.ArrayList;
import java.util.List;

public class RawTypeExample {
	public static void main(String[] args) {
		//The List class has been with us since Java 1.0,
		//but before Java 1.5 you never used angle brackets.
		List myList = new ArrayList();
		
		//This is the same as writing the following in modern Java:
		List<Object> myList2 = new ArrayList<>();
		myList2.add(73);
		myList2.add("Hello");
		
		Integer value = (Integer)myList2.get(0);
		String myString = (String)myList2.get(1);
		
		//This worked fine........but it wasn't as type safe
		//as having the type stored in the list specified and 
		//people would frequently cast things to the wrong things, 
		//or have errors...code needed to have a lost of casts to work.
		
	
		
		//Object as you know is inherited by all Java classes...
		//so you can literally store any java instance to an Object.
		
		//Java added Generics which allowed us to basically have 
		//Type parameters on our classes...and its very obvious how this
		//works with List and HashMap and all those collection classes to 
		//reduce the need for casting and increase type safety.
	}
}

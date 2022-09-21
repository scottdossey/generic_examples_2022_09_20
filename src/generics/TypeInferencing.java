package generics;

import java.util.ArrayList;
import java.util.List;

public class TypeInferencing {
	
	public static <T> void printArray(T[] array) {
		for (T element : array) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	
	public static void main(String[] args) {
		//When generics first came out we had tp
		//always specify the generic values.
		
		//IE even when calling a constructor.
		List<String> myList = new ArrayList<String>();
		
		//It is a feature called type inferencing
		//that allows us to creat an arrayList using
		//only angle brackets by themselves.
		
		List<String> myList2 = new ArrayList<>();
		
		//When we call a generic method like printArray, 
		//it might be necessary to specify the type it works with.
		String[] values = {"hello", "hi", "bye"};
		TypeInferencing.<String>printArray(values);
		
		//Type inferencing usually figure that all out for you
		//so you don't have to specify that stuff..
		
		//Sometime in rare situations Java type inferencing
		//can't figure out what type is need because of some
		//ambiguity and you'll need to specify it explicitly.
		
	}
}

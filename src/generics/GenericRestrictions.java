package generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GenericRestrictions<T> {
	public void restriction1() {
		//Illegal--because we are using a primitive type!
		//GenericRestrictions<int> x = new GenericRestrictions<>();
	}

	public void restriction2() {
		//T value = new T(); //We cannot create an instance from a generic type!!!!
	}
	
	//static T restriction3; // This is illegal
	

	public void restriction4() {
		List<String> value = new ArrayList<>();
		Object holder=value;
		//This is illegal because we can't use instanceof with a generic type
		//System.out.println(holder instanceof List<String>);
		System.out.println(holder instanceof List);	
	}
	
	public void restriction5() {
		T[] myArray; //We can create that holds a T Array.
		//But the following line is illegal because we can't array of a generic
		//type:
		//myTArray = new T[100]; // We can't actually instantiate the array
	}
	
	public static void main(String[] args) {
		
		GenericRestrictions<String> instance = new GenericRestrictions<>();
		
		//EXAMPLES OF THING YOU CANNOT DO WITH
		//Generics!
		
		//1. You cannot use generics with primitive types.
		instance.restriction1();
	
		//2. You cannot create instance of type parameters.
		// You cannot use "new" with a generic type.
		instance.restriction2();
		
	
		//3. We cannot declare static field whose type is a type parameter.
		
		
		//4. We cannot use instanceof with Generic type and 
		//  expect the Generc part of the type to be understood.
		instance.restriction4();
		
		//5. We cannot create arrays of parameterized types.
		instance.restriction5();
		
		//6. We cannot throw, catch, or do any exception with parametrized types.
		//See IllegalGenericException
		
		//7. That is we create class that has two methods that have
		//the same signature after we remove the generic information, we
		//cannot legally create that overload.
		//See code below main,
	}
	//illegal because both reduce to the same raw type.
	
	public void print(List<String> strSet) {};
	
	public void print(List<Integer> intSet) {};
	
	
}

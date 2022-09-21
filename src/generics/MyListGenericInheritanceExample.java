package generics;

import java.util.ArrayList;

//Let's say our generic list is a list that allows 
//us to store items of any type.....but we also store
//one piece of tag of information to the list of type T
public class MyListGenericInheritanceExample<E, T> extends ArrayList<E> {
	
	private T tagValue;
	
	public T getTag() {
		return tagValue;
	}
	
	public void setTag(T value) {
		tagValue = value;
	}
	
	
	public static void main(String[] args) {
		MyListGenericInheritanceExample<Integer, String> myList =
			new MyListGenericInheritanceExample<>();
		
		myList.add(7);
		
		myList.setTag("List of numbers I like");
		
	}

}

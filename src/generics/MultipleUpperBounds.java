package generics;

public class MultipleUpperBounds<T extends InterfaceA & InterfaceB> {
	private T storedValue;
	
	public MultipleUpperBounds(T value) {
		this.storedValue = value;
	}
	
	public void exercise() {
		System.out.println(storedValue.makeSound());
		System.out.println(storedValue.getName());		
	}
	
}

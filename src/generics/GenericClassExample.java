package generics;

//What we are going to do is define a simple Class
//that stores a single item...of any type....
//The tyoe that we are going to store is going to be a Type Parameter
//which we will call G
public class GenericClassExample<G> {
	G value;
	
	public GenericClassExample() {		
	}
	
	public GenericClassExample(G value) {
		this.value = value;
	}
	
	public void set(G value) {
		this.value = value;
	}
	
	public G get() {
		return this.value;
	}
	
	public static void main(String[] args) {
		GenericClassExample<Double> myContainer = new GenericClassExample<>(7.4);
		
		myContainer.set(17.3);
		System.out.println(myContainer.get());
		
		
		GenericClassExample<String> myContainer2 = new GenericClassExample<>("Hello");
		myContainer2.set("Whatever");
		System.out.println(myContainer2.get());
	}
}

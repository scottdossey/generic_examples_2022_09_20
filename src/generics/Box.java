package generics;

public class Box<T> {
	public T upper_left_x;
	public T upper_left_y;
	public T lower_right_x;
	public T lower_right_y;

	public static void main(String[] args) {
		Box<Double> doubleBox = new Box<>();
		doubleBox.upper_left_x =1.7;
		
		Box<Integer> integerBox = new Box<>();
		integerBox.upper_left_x = 7;

		Double value=7.5;
		Integer value2 = 13;
		Number x = value;
		x = value2;
		
		
		//Cannot do this assignment because Box<Number> is not 
		//a superclass of Box<Integer>
		
		
		//Box<Number> numberBox = integerBox; 
				

	}

}

package java_playground;

class Box <T> {
	private T Rectangle;
	
	public T getRectangle() {
		return Rectangle;
	}
	
	public void setRectangle(T Rectangle) {
		this.Rectangle = Rectangle;
	}
}

class Point <X, Y> {
	private X x_point;
	private Y y_point;
	
	public X getX() {
		return x_point;
	}
	
	public Y getY() {
		return y_point;
	}
	
	public void showPoint() {
		System.out.println("This point is X : " + x_point + ", Y : " + y_point);
	}
	
	public void setX(X x_point) {
		this.x_point = x_point;
	}
	
	public void setY(Y y_point) {
		this.y_point = y_point;
	}
}

class Array {
	public <T extends Comparable> T getMax(T[] a){
		if (a == null || a.length == 0) {
			return null;
		}
		T largest = a[0];
		for(int i = 0; i < a.length; i++) {
			if(largest.compareTo(a[i]) < 0) {
				largest = a[i];
			}
		}
		
		return largest;
	}
	
	public <T> int sub(T inputData, T D) {
		int result;
		result = (int)inputData - (int)D;
		return result;
		
	}
		
	public <T> void displayArray(T[] input_array) {
		int input_array_length = input_array.length;
		
		for(Object elem: input_array) {
			System.out.println(elem + " ");
		}
//		for(int i = 0; i < input_array_length; i++) {
//			System.out.println(input_array[i] + " ");
//		}
	}
}

public class genericTest {

	
	public static void main(String args[]) {
		// ex1
		int Rec;
		Box <Integer> b = new Box<> ();
		b.setRectangle(123);
		Rec = b.getRectangle();
		System.out.println(Rec);
		
		// ex2
		int x_point = 123;
		int y_point = 456;
		
		Point <Integer, Integer> p = new Point<> ();
		p.setX(x_point);
		p.setY(y_point);
		p.showPoint();
	}
}

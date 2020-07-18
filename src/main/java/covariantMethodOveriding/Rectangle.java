package covariantMethodOveriding;
/**
 * Java 5.0 onwards it is possible to have different return type for a overriding method in child class,
 * but child’s return type should be sub-type of parent’s return type. 
 * Overriding method becomes variant with respect to return type.
 * Advantages:
 *  1. It helps to avoid confusing type casts present in the class hierarchy and thus making the code readable, 
 *  usable and maintainable.
 *  2. We get a liberty to have more specific return types when overriding methods. 
 *  3. Help in preventing run-time ClassCastExceptions on returns
 *  Below is link to learn more
 *  https://www.geeksforgeeks.org/covariant-return-types-java/
 *  @author rohit
 */
public class Rectangle implements Cloneable{
	
	private final int height;
	private final int width;
	
	public Rectangle(int height,int width) {
		this.height = height;
		this.width = width;
		
	}
	
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	
	@Override
	public Rectangle clone() throws CloneNotSupportedException {
			
		Rectangle clone = (Rectangle) super.clone();
		return clone;
		
	}

}

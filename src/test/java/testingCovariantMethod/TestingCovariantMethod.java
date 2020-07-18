package testingCovariantMethod;
import covariantMethodOveriding.*;
import org.junit.Test;

public class TestingCovariantMethod {

	@Test
	public void demo() throws CloneNotSupportedException {
		Rectangle r = new Rectangle(4, 3);
        Rectangle clone = r.clone();

        System.out.println("Width: " + clone.getWidth());
        System.out.println("Height: " + clone.getHeight());
        
	}
	
}

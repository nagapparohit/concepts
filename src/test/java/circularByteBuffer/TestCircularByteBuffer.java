package circularByteBuffer;

import org.junit.Test;

public class TestCircularByteBuffer {

	
	@Test
	public void demo() {
		CircularByteBuffer cbb = new CircularByteBuffer(3);

        cbb.put(1);
        cbb.put(2);
        cbb.put(3);

        System.out.println("Available before get: " + cbb.available());
        System.out.println("get: " + cbb.get());
        System.out.println("Available after get: " + cbb.available());
        cbb.clear();
        System.out.println("Available after clear: " + cbb.available());
	}
}

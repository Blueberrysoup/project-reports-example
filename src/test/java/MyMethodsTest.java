import static org.junit.Assert.*;
import org.junit.Test;

public class MyMethodsTest {
	MyMethods mm = new MyMethods();
	
	@Test
	public void testAdd1() {
		assertEquals(2, mm.add1(1));
	}

	@Test
	public void testAdd2() {
		assertEquals(4, mm.add2(2));
	}
	
	@Test
	public void testAdd3() {
		assertEquals(6, mm.add3(3));
	}
}

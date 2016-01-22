import static org.junit.Assert.*;

import org.junit.Test;

public class FirstTest {

        @Test
        public void test1() {
                home ob = new home();
                int re = ob.Cube(4);
                assertEquals(re,64);
        }
	@Test
        public void test2() {
                

		home ob = new home();
                int re = ob.Cube(5);
                assertEquals(re,64);

        }
	@Test
        public void test3() {

		home ob = new home();
                int re = ob.Cube(6);
                assertEquals(re,216);
        }
}

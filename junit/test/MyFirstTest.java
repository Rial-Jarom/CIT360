import org.junit.*;
import static org.junit.Assert.*;

import MyPackage.*;

public class MyFirstTest {
    @Test
    public void assertArrayEqualsTest() {
        assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});
    }
    @Test
    public void assertEqualsTest() {
        int value = 1234567890;
        assertEquals(value, value);
    }
    @Test
    public void assertFalseTest() {
        assertFalse(false);
    }
    @Test
    public void assertNotNullTest() {
        HelloWorld helloWorld = new HelloWorld();
        assertNotNull(helloWorld);
    }
    @Test
    public void assertNotSameTest() {
        HelloWorld helloWorld = new HelloWorld();
        HelloJava helloJava = new HelloJava();
        assertNotSame(helloJava, helloWorld);
    }
    @Test
    public void assertNullTest() {
        assertNull("should be null", null);
    }
    @Test
    public void assertSameTest() {
        HelloWorld helloWorld = new HelloWorld();
        assertSame(helloWorld, helloWorld);
    }
    @Test
    public void assertThatTest() {
        assertThat("albumen", both(containsString("a")).and(containsString("b")));
    }
    @Test
    public void assertTrueTest() {
        assertTrue(true);
    }
}

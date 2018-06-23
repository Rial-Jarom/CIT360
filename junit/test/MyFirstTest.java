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
        HelloJava helloJava = new HelloJava();
        assertNull(helloJava);
    }
    @Test
    public void assertSameTest() {
        HelloWorld helloWorld = new HelloWorld();
        assertSame(helloWorld, helloWorld);
    }
    @Test
    public void assertThatTest() {
        HelloJava helloJava = new HelloJava();
        assertThat(helloJava, equalTo(helloJava));
    }
    @Test
    public void assertTrueTest() {
        assertTrue(true);
    }
}

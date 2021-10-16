import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void testHelloWorld() throws Exception {
        assertEquals("hello world!", HelloWorld.greet());
    }

    private static class HelloWorld {
        public static String greet() {
            return "hello world!";
        }
    }
}

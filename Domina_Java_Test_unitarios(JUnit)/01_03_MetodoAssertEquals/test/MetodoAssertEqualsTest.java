import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MetodoAssertEqualsTest {
    @Test
    void testSintaxis() {
        Assertions.assertEquals(2, 2); // import org.junit.jupiter.api.Assertions;
        assertEquals(2, 2); // import static org.junit.jupiter.api.Assertions.assertEquals;
    }

    @Test
    void test1() {
        assertEquals(2, 3);
    }

    @Test
    void test2() {
        assertEquals("", " ");
    }

    @Test
    void test3() {
        assertEquals("", "\n");
    }

    @Test
    void  test4() {
        // something different of 3 is good
        assertNotEquals(3,4);
    }
}

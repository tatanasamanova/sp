import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        assertEquals(3 * 4, Main.multiply(3, 4));
    }

    @Test
    void main2() {
        assertEquals(-2 * 3, Main.multiply(-2, 3));
    }

    @Test
    void main3() {
        assertEquals(-2 * -3, Main.multiply(-2, -3));
    }

    @Test
    void main4() {
        assertEquals(0 * 3, Main.multiply(0, 3));
    }

    @Test
    void main5() {
        assertEquals(0*0,Main.multiply(0,0));
    }
}


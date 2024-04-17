import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calculateAverage() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3.0, Array.calculateAverage(array), 0.01);
    }
}
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isSquareMatrix() {
        int[][] squareMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertTrue(Matrix.isSquareMatrix(squareMatrix));

        int[][] nonSquareMatrix = {{1, 2, 3}, {4, 5, 6}};
        assertFalse(Matrix.isSquareMatrix(nonSquareMatrix));
    }
}
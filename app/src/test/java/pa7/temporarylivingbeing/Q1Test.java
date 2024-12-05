package pa7.temporarylivingbeing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q1Test {
    
    @Test
    void testEmptyMatrix() {
        Q1 solution = new Q1();
        int[][] matrix = {};
        solution.rotate(matrix);
        assertArrayEquals(new int[][]{}, matrix);
    }

    @Test
    void testSingleElementMatrix() {
        Q1 solution = new Q1();
        int[][] matrix = {{1}};
        solution.rotate(matrix);
        assertArrayEquals(new int[][]{{1}}, matrix);
    }

    @Test
    void test2x2Matrix() {
        Q1 solution = new Q1();
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };
        solution.rotate(matrix);
        int[][] expected = {
            {3, 1},
            {4, 2}
        };
        assertArrayEquals(expected, matrix);
    }

    @Test
    void test3x3Matrix() {
        Q1 solution = new Q1();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        solution.rotate(matrix);
        int[][] expected = {
            {7, 4, 1},
            {8, 5, 2},
            {9, 6, 3}
        };
        assertArrayEquals(expected, matrix);
    }

    @Test
    void test4x4Matrix() {
        Q1 solution = new Q1();
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        solution.rotate(matrix);
        int[][] expected = {
            {13, 9, 5, 1},
            {14, 10, 6, 2},
            {15, 11, 7, 3},
            {16, 12, 8, 4}
        };
        assertArrayEquals(expected, matrix);
    }

    @Test
    void testMatrixWithDuplicates() {
        Q1 solution = new Q1();
        int[][] matrix = {
            {1, 1, 2},
            {1, 2, 2},
            {2, 2, 1}
        };
        solution.rotate(matrix);
        int[][] expected = {
            {2, 1, 1},
            {2, 2, 1},
            {1, 2, 2}
        };
        assertArrayEquals(expected, matrix);
    }

    @Test
    void testMatrixWithNegativeNumbers() {
        Q1 solution = new Q1();
        int[][] matrix = {
            {-1, -2},
            {-3, -4}
        };
        solution.rotate(matrix);
        int[][] expected = {
            {-3, -1},
            {-4, -2}
        };
        assertArrayEquals(expected, matrix);
    }

    @Test
    void testMatrixWithZeros() {
        Q1 solution = new Q1();
        int[][] matrix = {
            {0, 0},
            {0, 0}
        };
        solution.rotate(matrix);
        int[][] expected = {
            {0, 0},
            {0, 0}
        };
        assertArrayEquals(expected, matrix);
    }
}
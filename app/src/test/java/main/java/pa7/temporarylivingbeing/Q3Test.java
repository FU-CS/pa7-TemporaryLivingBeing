package main.java.pa7.temporarylivingbeing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q3Test {

    @Test
    void testEmptyGrid() {
        Q3 solution = new Q3();
        int[][] grid = new int[0][0];
        assertEquals(0, solution.maxAreaOfIsland(grid));
    }
    @Test
    void testSingleRowGrid() {
        Q3 solution = new Q3();
        int[][] grid = {{1, 0, 1, 1, 0, 1}};
        assertEquals(2, solution.maxAreaOfIsland(grid));
    }

    @Test
    void testSingleColumnGrid() {
        Q3 solution = new Q3();
        int[][] grid = {
            {1},
            {0},
            {1},
            {1}
        };
        assertEquals(2, solution.maxAreaOfIsland(grid));
    }

    @Test
    void testNoIslands() {
        Q3 solution = new Q3();
        int[][] grid = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        assertEquals(0, solution.maxAreaOfIsland(grid));
    }

    @Test
    void testSingleCellIsland() {
        Q3 solution = new Q3();
        int[][] grid = {
            {1, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        assertEquals(1, solution.maxAreaOfIsland(grid));
    }

    @Test
    void testMultipleIslandsDifferentSizes() {
        Q3 solution = new Q3();
        int[][] grid = {
            {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
            {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
            {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        assertEquals(6, solution.maxAreaOfIsland(grid));
    }

    @Test
    void testGridModification() {
        Q3 solution = new Q3();
        int[][] grid = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        };
        int result = solution.maxAreaOfIsland(grid);
        assertEquals(4, result);
        
        // Verify that all 1's have been changed to 0's
        int[][] expected = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        assertArrayEquals(expected, grid);
    }

    @Test
    void testComplexIslandShape() {
        Q3 solution = new Q3();
        int[][] grid = {
            {1, 1, 1},
            {0, 1, 0},
            {1, 1, 1}
        };
        assertEquals(7, solution.maxAreaOfIsland(grid));
    }

    @Test
    void testSeparateIslands() {
        Q3 solution = new Q3();
        int[][] grid = {
            {1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 0, 1, 1},
            {0, 0, 0, 1, 1}
        };
        assertEquals(4, solution.maxAreaOfIsland(grid));
    }

    @Test
    void testDiagonallyAdjacentIslands() {
        Q3 solution = new Q3();
        int[][] grid = {
            {1, 0, 1},
            {0, 0, 0},
            {1, 0, 1}
        };
        assertEquals(1, solution.maxAreaOfIsland(grid)); // Diagonal cells are not connected
    }

    @Test
    void testLongSnakeIsland() {
        Q3 solution = new Q3();
        int[][] grid = {
            {1, 1, 1, 1, 1},
            {0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1}
        };
        assertEquals(11, solution.maxAreaOfIsland(grid));
    }

    @Test
    void testAllOnesGrid() {
        Q3 solution = new Q3();
        int[][] grid = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        assertEquals(9, solution.maxAreaOfIsland(grid));
    }

    @Test
    void testCheckerboardPattern() {
        Q3 solution = new Q3();
        int[][] grid = {
            {1, 0, 1},
            {0, 1, 0},
            {1, 0, 1}
        };
        assertEquals(1, solution.maxAreaOfIsland(grid));
    }
}
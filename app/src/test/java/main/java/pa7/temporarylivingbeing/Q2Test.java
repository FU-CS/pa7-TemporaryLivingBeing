package main.java.pa7.temporarylivingbeing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q2Test {
    
    @Test
    void testEmptyGrid() {
        Q2 solution = new Q2();
        char[][] grid = {};
        assertEquals(0, solution.numIslands(grid));
    }

    @Test
    void testSingleIsland() {
        Q2 solution = new Q2();
        char[][] grid = {
            {'1', '1', '1'},
            {'1', '1', '1'},
            {'1', '1', '1'}
        };
        assertEquals(1, solution.numIslands(grid));
    }

    @Test
    void testNoIslands() {
        Q2 solution = new Q2();
        char[][] grid = {
            {'0', '0', '0'},
            {'0', '0', '0'},
            {'0', '0', '0'}
        };
        assertEquals(0, solution.numIslands(grid));
    }

    @Test
    void testMultipleIslands() {
        Q2 solution = new Q2();
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, solution.numIslands(grid));
    }

    @Test
    void testDiagonalIslands() {
        Q2 solution = new Q2();
        char[][] grid = {
            {'1', '0', '0'},
            {'0', '1', '0'},
            {'0', '0', '1'}
        };
        assertEquals(3, solution.numIslands(grid));
    }

    @Test
    void testComplexIslandShapes() {
        Q2 solution = new Q2();
        char[][] grid = {
            {'1', '1', '0', '1'},
            {'1', '0', '0', '1'},
            {'1', '1', '0', '1'},
            {'0', '0', '0', '1'}
        };
        assertEquals(2, solution.numIslands(grid));
    }

    @Test
    void testSingleCellIslands() {
        Q2 solution = new Q2();
        char[][] grid = {
            {'1', '0', '1'},
            {'0', '1', '0'},
            {'1', '0', '1'}
        };
        assertEquals(5, solution.numIslands(grid));
    }

    @Test
    void testLongIsland() {
        Q2 solution = new Q2();
        char[][] grid = {
            {'1', '1', '1'},
            {'0', '0', '0'},
            {'1', '1', '1'}
        };
        assertEquals(2, solution.numIslands(grid));
    }

    @Test
    void testSingleRowGrid() {
        Q2 solution = new Q2();
        char[][] grid = {
            {'1', '0', '1', '0', '1'}
        };
        assertEquals(3, solution.numIslands(grid));
    }

    @Test
    void testSingleColumnGrid() {
        Q2 solution = new Q2();
        char[][] grid = {
            {'1'},
            {'0'},
            {'1'},
            {'0'},
            {'1'}
        };
        assertEquals(3, solution.numIslands(grid));
    }

    @Test
    void testGridModification() {
        Q2 solution = new Q2();
        char[][] grid = {
            {'1', '1', '0'},
            {'1', '0', '0'},
            {'0', '0', '1'}
        };
        int result = solution.numIslands(grid);
        assertEquals(2, result);
        
        char[][] expected = {
            {'2', '2', '0'},
            {'2', '0', '0'},
            {'0', '0', '2'}
        };
        assertArrayEquals(expected, grid);
    }

    @Test
    void testLargeGrid() {
        Q2 solution = new Q2();
        char[][] grid = new char[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                grid[i][j] = (i + j) % 2 == 0 ? '1' : '0';
            }
        }
        assertEquals(50, solution.numIslands(grid));
    }
}
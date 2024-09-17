package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findLUSlengthTest() {
        Solution solution = new Solution();
        assertEquals(3, solution.findLUSlength("aba", "cdc"));
        assertEquals(3, solution.findLUSlength("aaa", "bbb"));
        assertEquals(-1, solution.findLUSlength("aaa", "aaa"));
    }

}
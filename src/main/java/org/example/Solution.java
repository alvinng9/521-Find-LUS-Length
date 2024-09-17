package org.example;

public class Solution {
    public int findLUSlength(String a, String b) {
        //check if two strings are identical
        if (a.equals(b)) {
            return -1;
            //the result would be the length of the longer string
        } else {
            return Math.max(a.length(), b.length());
        }
    }
}

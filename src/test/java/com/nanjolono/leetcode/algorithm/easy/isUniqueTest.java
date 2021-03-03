package com.nanjolono.leetcode.algorithm.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isUniqueTest {

    @Test
    @DisplayName("存在多个相同字母")
    void isUniqueOfFalse() {
        assertFalse( new isUnique().isUnique("leetcode"));
    }

    @Test
    @DisplayName("每个字母仅存在一个")
    void isUniqueOfTrue() {
        assertTrue(new isUnique().isUnique("abc"));
    }

}
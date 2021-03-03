package com.nanjolono.leetcode.algorithm.easy;

import java.util.HashSet;

/**
 * 面试题 01.01. 判定字符是否唯一
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 *
 * 示例 1：
 *
 * 输入: s = "leetcode"
 * 输出: false
 * 示例 2：
 *
 * 输入: s = "abc"
 * 输出: true
 * 限制：
 *
 * 0 <= len(s) <= 100
 * 如果你不使用额外的数据结构，会很加分。
 */
public class isUnique {
    /**
     * 这里用了额外的数据结构，根据set集合去重的特性
     * 在去重之前与去重之后来的集合长度来校验是否有重复的字母
     * @param astr
     * @return
     */
    public boolean isUnique(String astr) {
        if (checkNotNull(astr)) return false;
        char[] chars = astr.toCharArray();
        int sum = astr.length();
        HashSet<Character> strings = new HashSet<>();
        for(Character character:chars){
            strings.add(character);
        }
        int actu = strings.size();
        return sum == actu;
    }

    /**
     * 字符串校验判空
     * @param astr
     * @return 不符合条件返回false
     */
    private boolean checkNotNull(String astr) {
        if(astr == null){
            return true;
        }
        if(astr.length()>100){
            return true;
        }
        return false;
    }


}

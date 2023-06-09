package com.xzqn.likou7;

import java.util.*;

public class demo132 {
    /**
     * 2423. 删除字符使频率相同
     * 给你一个下标从 0 开始的字符串 word ，字符串只包含小写英文字母。你需要选择 一个 下标并 删除 下标处的字符，使得 word 中剩余每个字母出现 频率 相同。
     *
     * 如果删除一个字母后，word 中剩余所有字母的出现频率都相同，那么返回 true ，否则返回 false 。
     *
     * 注意：
     *
     * 字母 x 的 频率 是这个字母在字符串中出现的次数。
     * 你 必须 恰好删除一个字母，不能一个字母都不删除。
     * @param args
     */
    public static void main(String[] args) {
        String word = "aqwertyuioppp";
        System.out.println(equalFrequency(word));
    }
    public static boolean equalFrequency(String word) {
     int[] arr = new int[26];
        for (int i = 0; i < word.length(); i++) {
            arr[word.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(arr));
        return false;
    }
}

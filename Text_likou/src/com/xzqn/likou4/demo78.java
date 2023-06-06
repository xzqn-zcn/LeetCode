package com.xzqn.likou4;

public class demo78 {
    /**
     * 反转字符串中的元音字母
     * 给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
     * <p>
     * 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现不止一次。
     * <p>
     * 作者：LeetCode
     * 链接：https://leetcode.cn/leetbook/read/all-about-array/x93lce/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        String s = ".....a......";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        String str = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; ) {
            if (!str.contains(Character.toString(chars[i]))) {
                i++;
            }
            if (!str.contains(Character.toString(chars[j]))) {
                j--;
            }
            if (str.contains(Character.toString(chars[i])) && str.contains(Character.toString(chars[j]))) {
                char a = chars[i];
                chars[i] = chars[j];
                chars[j] = a;
                i++;
                j--;
            }
        }
        return String.valueOf(chars);
    }
}

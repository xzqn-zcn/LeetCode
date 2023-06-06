package com.xzqn.likou3;

public class demo52 {
    /*
    * 1221. 分割平衡字符串
    平衡字符串 中，'L' 和 'R' 字符的数量是相同的。
    给你一个平衡字符串 s，请你将它分割成尽可能多的子字符串，并满足：
    每个子字符串都是平衡字符串。
    返回可以通过分割得到的平衡字符串的 最大数量 。*/
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();
        int max = 0;
        int RL = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'R') { //如果i索引上的值等于R则++,如果不等于R则一定等于L,则--
                RL++;        //不论是第一位是R或者L,此时RL一定不等于0，只有R与L出现的此时一样才可能等于0
            } else {
                RL--;
            }
            //如果i索引上的一直是R或者L,则RL只会大于或小于0，只有RL一样多时变量RL才可能等于0
            if (RL == 0) { //如果RL==0则说明最少遍历到了了一对RL则可以让max++;
                max++;
            }
        }
        return max;
    }
}

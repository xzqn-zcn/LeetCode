package com.xzqn.likou;

public class demo3 {
    public static void main(String[] args) {
        /*给你一个字符串 jewels代表石头中宝石的类型，另有一个字符串 stones 代表你拥有的石头。
                stones中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
                字母区分大小写，因此 "a" 和 "A" 是不同类型的石头。
               来源：力扣（LeetCode）
               链接：https://leetcode.cn/problems/jewels-and-stones
               著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));

    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            char cha = jewels.charAt(i);
            for (int j = 0; j < stones.length(); j++) {
                char ch = stones.charAt(j);
                if (cha == ch) {
                    count++;
                }
            }
        }
        return count;
    }
}

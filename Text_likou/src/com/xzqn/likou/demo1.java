package com.xzqn.likou;

public class demo1 {
    //2396. 严格回文的数字
    //直接返回false即可，不用判断，没有能达成条件的数字
    public static void main(String[] args) {

        System.out.println(isStrictlyPalindromic(2396));
    }

    public static boolean isStrictlyPalindromic(int n) {

        int i = 2;
        int t;
        while (i < n - 1) {
            t = n;
            String b = "";
            String temp = "";
            while (true) {
                temp = temp + "" + (t % i);
                b = (t % i) + b;
                t = t / i;

                if (t < 1 && !temp.equals(b)) {
                    System.out.println(i + "进制不相同,不是严格回文数");
                    System.out.println(temp);
                    System.out.println(b);
                    return false;
                }
                if (t < 1 && temp.equals(b)) {
                    System.out.println(i + "进制相同,跳出");
                    System.out.println(temp);
                    System.out.println(b);
                    i++;
                    break;
                }
            }
            System.out.println(".....");
        }
        return true;
    }
}
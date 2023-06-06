package com.xzqn.likou5;

public class demo89 {
    /**
     * 43. 字符串相乘
     * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
     * <p>
     * 注意：不能使用任何内置的 BigInteger 库或直接将输入转换为整数。
     */
    public static void main(String[] args) {
        String num1 = "498828660196", num2 = "840477629533";
        System.out.println(multiply(num1, num2));
    }

    public static String multiply(String num1, String num2) {
        //"419254329864656431168468"
        long number1 = 0;
        long number2 = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num1.length(); i++) {
            number1 = number1 * 10 + (num1.charAt(i) - 48);
        }
        for (int i = 0; i < num2.length(); i++) {
            number2 = number2 * 10 + (num2.charAt(i) - 48);
        }
        return stringBuilder.append(number1 * number2).toString();
    }
}

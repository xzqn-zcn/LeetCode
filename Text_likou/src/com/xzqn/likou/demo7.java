package com.xzqn.likou;

public class demo7 {
    /*给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。

    所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。*/

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));

    }

    public static String defangIPaddr(String address) {
        char[] chars = address.toCharArray();
        String str = "";
        for (int i = 0; i < address.length(); i++) {
            if (chars[i] == '.') {
                str += "[.]";
            } else {
                str += chars[i];
            }
        }
        return str;
    }
}

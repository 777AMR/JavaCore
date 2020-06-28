package com.javalesson.methods;

public class Methods {
    public static void main(String[] args) {
        String str1 = "I like coffee";

        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        String str2 = str1;
        boolean b = str2 == str1;
        System.out.println(b);


    }
}

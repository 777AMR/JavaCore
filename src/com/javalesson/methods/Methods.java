package com.javalesson.methods;

public class Methods {
    public static void main(String[] args) {
        String str1 = "I like black coffee";
        String str3 = "I like coffee!!!";

        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        String str2 = "I like coffee";
        String str4 = new String("I like coffee");


        String substring = str3.substring(0, 13);
        System.out.println("Substring = " + substring);

//        boolean b = str2.equals(str4);
//        System.out.println(b);

        boolean like = str1.startsWith(" like", 1);
        System.out.println(like);

        System.out.println(str1.replace("black", "white"));

        System.out.println(str3.indexOf("!!!"));
    }
}

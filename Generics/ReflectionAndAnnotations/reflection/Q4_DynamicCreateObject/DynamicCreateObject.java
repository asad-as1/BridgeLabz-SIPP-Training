package com.asad.reflection.Q4_DynamicCreateObject;
public class DynamicCreateObject {
    public static void main(String[] args) throws Exception {
        Object s = Class.forName("com.asad.reflection.Q4_DynamicCreateObject.Student")
                         .getDeclaredConstructor().newInstance();
        System.out.println(s);
    }
}

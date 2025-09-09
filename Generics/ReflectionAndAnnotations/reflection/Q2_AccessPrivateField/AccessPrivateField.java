package com.asad.reflection.Q2_AccessPrivateField;
import java.lang.reflect.*;
public class AccessPrivateField {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Field age = Person.class.getDeclaredField("age");
        age.setAccessible(true);
        System.out.println("Original age=" + age.getInt(p));
        age.setInt(p, 30);
        System.out.println("Modified age=" + age.getInt(p));
    }
}

package com.asad.reflection.Q1_GetClassInfo;
import java.lang.reflect.*;
public class GetClassInfo {
    public static void main(String[] args) {
        String className = "java.util.ArrayList";
        try {
            Class<?> cls = Class.forName(className);
            System.out.println("Class: " + cls.getName());
            System.out.println("Constructors:");
            for (Constructor<?> c : cls.getDeclaredConstructors()) System.out.println("  " + c);
            System.out.println("Fields:");
            for (Field f : cls.getDeclaredFields()) System.out.println("  " + f);
            System.out.println("Methods:");
            for (Method m : cls.getDeclaredMethods()) System.out.println("  " + m);
        } catch (Exception e) { e.printStackTrace(); }
    }
}

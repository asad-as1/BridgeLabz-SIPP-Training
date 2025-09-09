package com.asad.reflection.Q3_InvokePrivateMethod;
import java.lang.reflect.*;
public class InvokePrivateMethod {
    public static void main(String[] args) throws Exception {
        Calculator c = new Calculator();
        Method m = Calculator.class.getDeclaredMethod("multiply", int.class,int.class);
        m.setAccessible(true);
        System.out.println("6*7=" + m.invoke(c,6,7));
    }
}

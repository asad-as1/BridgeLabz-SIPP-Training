package com.asad.reflection.Q5_DynamicMethodInvocation;
import java.lang.reflect.*;
public class DynamicMethodInvocation {
    public static void main(String[] args)throws Exception{
        MathOperations ops=new MathOperations();
        Method m=MathOperations.class.getMethod("add",int.class,int.class);
        System.out.println("add(5,3)="+m.invoke(ops,5,3));
    }
}

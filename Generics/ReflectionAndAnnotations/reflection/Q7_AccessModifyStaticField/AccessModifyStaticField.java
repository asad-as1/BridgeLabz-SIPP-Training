package com.asad.reflection.Q7_AccessModifyStaticField;
import java.lang.reflect.*;
public class AccessModifyStaticField {
    public static void main(String[] args)throws Exception{
        Field f=Configuration.class.getDeclaredField("API_KEY");
        f.setAccessible(true);
        System.out.println("Before="+f.get(null));
        f.set(null,"NEWKEY");
        System.out.println("After="+f.get(null));
        System.out.println("Getter="+Configuration.get());
    }
}

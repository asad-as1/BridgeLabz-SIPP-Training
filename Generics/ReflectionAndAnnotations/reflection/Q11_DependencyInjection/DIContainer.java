package com.asad.reflection.Q11_DependencyInjection;
import java.lang.reflect.*;public class DIContainer{
    public <T>T get(Class<T>cls){try{T obj=cls.getDeclaredConstructor().newInstance();
        for(Field f:cls.getDeclaredFields()) if(f.isAnnotationPresent(Inject.class)){f.setAccessible(true);f.set(obj,get(f.getType()));}
        return obj;}catch(Exception e){throw new RuntimeException(e);}}
    public static void main(String[]a){ServiceB b=new DIContainer().get(ServiceB.class);System.out.println(b.use());}
}

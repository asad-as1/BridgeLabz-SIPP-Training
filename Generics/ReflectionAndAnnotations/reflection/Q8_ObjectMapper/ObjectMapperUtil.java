package com.asad.reflection.Q8_ObjectMapper;
import java.lang.reflect.*;import java.util.*;
public class ObjectMapperUtil{
    public static <T>T toObject(Class<T>cls,Map<String,Object>props){
        try{T obj=cls.getDeclaredConstructor().newInstance();
            for(var e:props.entrySet()){
                try{Field f=cls.getDeclaredField(e.getKey());f.setAccessible(true);
                    f.set(obj,e.getValue());}catch(NoSuchFieldException ignore){}
            }return obj;}catch(Exception ex){throw new RuntimeException(ex);} }
    public static void main(String[]a){
        Map<String,Object> map=new HashMap<>();map.put("username","Asad");map.put("age",22);
        System.out.println(toObject(UserDTO.class,map));}
}

package com.asad.reflection.Q9_ToJson;
import java.lang.reflect.*;public class JsonUtil{
    public static String toJson(Object o){
        StringBuilder sb=new StringBuilder("{");
        for(Field f:o.getClass().getDeclaredFields()){
            f.setAccessible(true);
            try{sb.append(f.getName()).append(":").append(f.get(o)).append(",");}catch(Exception ignore){}
        }return sb.append("}").toString();}
    public static void main(String[]a){System.out.println(toJson(new Product("Phone",500)));}
}

package com.asad.reflection.Q10_LoggingProxy;
import java.lang.reflect.*;
public class ProxyDemo{
    public static void main(String[]a){
        Greeting g=new GreetingImpl();
        Greeting prox=(Greeting)Proxy.newProxyInstance(Greeting.class.getClassLoader(),new Class[]{Greeting.class},
            (p,m,args)->{System.out.println("Calling "+m.getName());return m.invoke(g,args);});
        System.out.println(prox.sayHello("Asad"));}
}

package com.asad.reflection.Q12_MethodTiming;
import java.lang.reflect.*;public class MethodTiming{
    public static void main(String[]a)throws Exception{
        Workload w=new Workload();
        for(String mname:new String[]{"fast","slow"}){
            Method m=Workload.class.getMethod(mname); long t0=System.nanoTime();
            m.invoke(w); long t1=System.nanoTime();
            System.out.println(mname+" took "+(t1-t0)/1_000_000+" ms");}
    }}

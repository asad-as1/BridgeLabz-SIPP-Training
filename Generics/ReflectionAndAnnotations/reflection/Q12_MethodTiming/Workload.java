package com.asad.reflection.Q12_MethodTiming;
public class Workload{ public void fast(){for(int i=0;i<1e5;i++);} public void slow(){try{Thread.sleep(100);}catch(Exception e){}}}

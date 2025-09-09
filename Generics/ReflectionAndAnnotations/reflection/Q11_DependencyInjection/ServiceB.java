package com.asad.reflection.Q11_DependencyInjection;
public class ServiceB{ @Inject private ServiceA a; public String use(){return "Use "+a.who();} }

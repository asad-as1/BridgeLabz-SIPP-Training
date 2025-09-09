package com.asad.reflection.Q6_RetrieveAnnotations;
public class RetrieveAnnotations {
    public static void main(String[] args){
        Author a=Book.class.getAnnotation(Author.class);
        System.out.println("Author="+a.name());
    }
}

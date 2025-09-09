package com.asad.reflection.Q6_RetrieveAnnotations;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.TYPE)
public @interface Author{ String name(); }

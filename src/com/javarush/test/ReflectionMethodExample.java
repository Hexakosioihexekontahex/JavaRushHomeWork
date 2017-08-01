package com.javarush.test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReflectionMethodExample {
    public static void main(String[] args) {
        for (Method method : Arrays.class.getDeclaredMethods()) { //перед ".class" вставить название класса-таргета
            String returnType = method.getReturnType().toString();
            String methodName = method.getName();
            StringBuilder parameterTypes = new StringBuilder();
            for (Class<?> parameterClass : method.getParameterTypes()) {
                if (parameterTypes.length() != 0) parameterTypes.append(",");
                parameterTypes.append(parameterClass.getName());
            }

            System.out.printf("%s %s(%s)\n", returnType, methodName, parameterTypes);
        }
    }
}
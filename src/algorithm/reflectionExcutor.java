package algorithm;

import java.lang.reflect.Method;

public class reflectionExcutor {
    public static void main(String[] args) {
        Class testClass  = reflectionExample.class;

        Method methods[] =  testClass.getDeclaredMethods();
        for (Method method: methods) {
            System.out.println("method = " + method);
        }
        System.out.println("testClass.getClass(); = " + testClass.getDeclaredMethods());

        //System.out.println("testClass.getClass(); = " + testClass.getMethod("methodA", int.class));
    }

}


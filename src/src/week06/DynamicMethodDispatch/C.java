package week06.DynamicMethodDispatch;

import week06.DynamicMethodDispatch.A;

public class C extends A {
    String x = "C";
    public void someMethod(){
        System.out.println("Method of C type");
    }
}

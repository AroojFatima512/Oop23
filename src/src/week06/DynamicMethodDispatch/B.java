package week06.DynamicMethodDispatch;

import week06.DynamicMethodDispatch.A;

public class B extends A {
    int x=5;
    static int y=200;
    int z=30;
    public void someMethod(){
        System.out.println("Method of B type");
    }
}

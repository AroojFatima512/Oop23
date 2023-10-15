package week06.DynamicMethodDispatch;

import week06.DynamicMethodDispatch.A;
import week06.DynamicMethodDispatch.B;
import week06.DynamicMethodDispatch.C;
import week06.DynamicMethodDispatch.D;

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("Using obj A: " +obj.x);
        B obj1 = new B();
        System.out.println("Using obj1 B: " +obj1.x);
        A obj2 = new B();
        System.out.println("Using obj2 AB: " +obj2.x);
        A obj3 = new C(); //Up Casting-One type referring other type
        System.out.println("Using obj AC: " +obj3.x); //Will print reference A's attribute

//  C obj4 = (C) new A();  This would result in a ClassCastException because objA is not an instance of C

        System.out.println("Without obj: " +A.y);
        System.out.println("Without obj: " +B.y);
        System.out.println("Using obj A: " +obj.y);
        System.out.println("Using obj B: " +obj1.y);
        System.out.println("Using obj AB: " +obj2.y);
        System.out.println("Using obj AB: " +((B)obj2).z);
        /* As obj2 refers to class A that doesn't have attribute z. So for accessing attribute z through same
         object, down cast it to class B as B has attribute z*/

        obj.someMethod();
        obj2.someMethod();
        D obj4 = new D();
        obj4.someMethod();
        A obj5 = new D(); //Printing Method D
        obj5.someMethod();
      //  obj5.someMethod1(); Not possible as Method1 is not present in parent class (A)
        System.out.println(obj5.x); //Printing class A attribute x

        /*Variable is always printed of reference (parent class) and method
         is always printed of the object (child class)*/
    }
}

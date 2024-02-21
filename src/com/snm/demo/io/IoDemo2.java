package com.snm.demo.io;


import java.io.*;

class SuperClass {

    // SuperClass doesn't declare any exception
    void method()  {
        System.out.println("SuperClass");
    }
}

// SuperClass inherited by the SubClass
class IoDemo2 extends SuperClass {

    // method() declaring Checked Exception IOException
    void method() throws ArithmeticException {

        // IOException is of type Checked Exception
        // so the compiler will give Error

        System.out.println("SubClass");
    }

    // Driver code
    public static void main(String args[]) {
        SuperClass s = new IoDemo2();
        try {
            s.method();
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}

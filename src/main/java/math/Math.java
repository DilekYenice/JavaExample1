package math;

import exception.MyException;

public class Math {

    public Math() {
        System.out.println("math consturctor");
    }

    public Math(String str) {
        System.out.println(str);
    }

    public Integer add(Integer a, Integer b) throws MyException {

        if (a == null) {
            throw new MyException();
        }
        // mail
        return a + b;
    }

    // method overloading

    public Integer add(Integer a, Integer b, Integer c) {
        return a + b + c;
    }

    public Integer add(Integer a, Integer b, Integer c, Integer d) {
        return a + b + c + d;
    }
}

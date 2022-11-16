package Homework_13_11;

class Base {
    void method1() {
    }

    void method2() {
    }
}

public class samples0 {
    static class A {
        //static class
    }

    class B {
        //inner class
    }

    void f() {
        Base b = new Base() {
            void method() {

            }
        };
    }

}

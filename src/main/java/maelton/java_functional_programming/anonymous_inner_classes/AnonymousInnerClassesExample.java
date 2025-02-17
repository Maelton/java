package maelton.java_functional_programming.anonymous_inner_classes;

class A {
    public void show() {
        System.out.println("In A class");
    }

    public void show2() {
        System.out.println("In A class show2()");
    }
}

abstract class AbstractClassExample {
    abstract void show();
    abstract void show2();
}

@FunctionalInterface
interface FunctionalInterfaceExample {
    void show();
}

/**
 *An anonymous class is a class with no name.
 */
public class AnonymousInnerClassesExample {
    public static void main(String[] args) {

        //use brackets after instantiating a class to specify an anonymous class
        A usingAnonymousClass = new A() {
            public void show() {
                System.out.println("new implementation of show method");
            }
        };
        usingAnonymousClass.show();
        usingAnonymousClass.show2();

        //========= Instantiating abstract classes with the use of anonymous class =========
        AbstractClassExample abstractClassObject = new AbstractClassExample() {
            public void show() {
                System.out.println("Show 1");
            }

            public void show2() {
                System.out.println("Show 2");
            }
        };
        abstractClassObject.show();
        abstractClassObject.show2();

        //========= Instantiating functional interface with the use of anonymous class =========
        FunctionalInterfaceExample functionalInterfaceObject = new FunctionalInterfaceExample() {
            public void show() {
                System.out.println("Show method");
            }
        };
        functionalInterfaceObject.show();
    }
}

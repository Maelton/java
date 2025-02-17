package maelton.java_functional_programming.inner_classes;

class OuterClass {
    private int attr = 0;

    public void showAttribute() {
        System.out.println(attr);
    }

    class InnerClassA {
        public void showA() {
            System.out.println("Inner class A");
        }
    }

    static class InnerClassB {
        public void showB() {
            System.out.println("Inner class B");
        }
    }
}

/**
 * An inner class is a class inside another class.
 */
public class InnerClassesExample {
    public static void main(String[] args) {

        //########### instantiating inner class ###########

        //firstly you need to instantiate the outer class
        OuterClass outerClassObj = new OuterClass();
        //secondly you instantiate the inner class
        OuterClass.InnerClassA innerClassAObj = outerClassObj.new InnerClassA();

        //########### instantiating a static inner class ###########

        OuterClass.InnerClassB staticInnerClassBObj = new OuterClass.InnerClassB();
    }
}

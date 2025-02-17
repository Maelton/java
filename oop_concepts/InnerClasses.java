/**
 * Inner classes são classes definidas dentro de outras classes, observe:
 * 
 * Não confunda, as inner classes não são subclasses, ou seja, não herdam atributos e funções das classes em que estão introduzidas.
 */

class A {
    int a;
    String v = "a";

    public void show() {
        System.out.println("in A");
    }

    /**
     * Apenas Inner classes podem ser estáticas, outer classes não podem.
     */
    static public class B {
        int a;
        
        public void show() {
            System.out.println("in B");
        }
    }
}

class X {
    public void show() {
        System.out.println("in X");
    }

    public class Y {
        public void show() {
            System.out.println("in Y");
        }
    }
}

public class InnerClasses {
    
    public static void main(String[] args) {

        A a1 = new A();
        A.B b1 = new A.B(); //B é uma classe estatica

        X x1 = new X();
        X.Y y1 = x1.new Y(); //Y nao é estatica

        a1.show();
        b1.show();
        x1.show();
        y1.show();
    }
}

/**
class A {

    public A() {
        System.out.println("A (default)");
    }

    public A(int numero) {
        System.out.println("A (parametrizado)");
    }
}

class B extends A{

    public B() {
        System.out.println("B (default)");
    }

    public B(int numero) {
        System.out.println("B (parametrizado)");
    }
}

    public class ExtendsSuperEThis {
    
}
 */

class Conta {

    public Conta() {
        
        System.out.println("Conta (contrutor default)");
    }

    public Conta(int numero) {
        //Chama o construtor padrao da propria classe
        this();

        System.out.println("Conta (construtor parametrizado)");
    }
}

    public class ExtendsSuperEThis {
    
        public static void main(String[] args) {
            Conta poupanca = new Conta(10);
    }
}

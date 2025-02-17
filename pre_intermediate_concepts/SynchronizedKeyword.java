class Contador {

    int valor;
    public synchronized void aumentarValor() { valor++; }
}

public class SynchronizedKeyword {
    
    public static void main(String[] args) {

        Contador meuContador = new Contador();

        Runnable obj1 = () -> { for(int i=0; i<10_000; i++){ meuContador.aumentarValor(); }; };
        Runnable obj2 = () -> { for(int i=0; i<10_000; i++){ meuContador.aumentarValor(); }; };

        Thread threadA = new Thread(obj1);
        Thread threadB = new Thread(obj2);

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();

        } catch(InterruptedException e){}

        System.out.println("Valor do contador: " + meuContador.valor);
    }
}
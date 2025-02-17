class A implements Runnable {

    public void run() {
        for(int i=0; i<20; i++) {
            System.out.println("Oi, sou a classe A.");
            
            try { Thread.sleep(10); }
            catch(InterruptedException e) {}
        }
    }
}

class B implements Runnable {

    public void run() {
        for(int i=0; i<20; i++) {
            System.out.println("Ola, sou B.");

            try { Thread.sleep(10); }
            catch(InterruptedException e) {}
        }
    }
}

public class ThreadsERunnableInterface {
    
    public static void main(String[] args) {

        Runnable instanciaA = new A();
        Runnable instanciaB = new B();

        Thread threadA = new Thread(instanciaA);
        Thread threadB = new Thread(instanciaB);

        threadA.start();

        try { Thread.sleep(10); }
        catch(InterruptedException e) {}
        
        threadB.start();
    }
}

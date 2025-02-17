class A extends Thread {

    public void run() {
        for(int i=0; i<20; i++) {
            System.out.println("Oi, sou a classe A.");
            
            try { Thread.sleep(10); }
            catch(InterruptedException e) {}
        }
    }
}

class B extends Thread {

    public void run() {
        for(int i=0; i<20; i++) {
            System.out.println("Ola, sou B.");

            try { Thread.sleep(10); }
            catch(InterruptedException e) {}
        }
    }
}

public class ThreadsEmJava {
    
    public static void main(String[] args) {

        A instanciaA = new A();
        B instanciaB = new B();

        instanciaA.setPriority(Thread.MIN_PRIORITY + 9);
        instanciaB.setPriority(10);

        instanciaA.start();

        try { Thread.sleep(10); }
        catch(InterruptedException e) {}
        
        instanciaB.start();
    }
}

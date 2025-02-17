public class ThreadsELambdaFunctions {
    
    public static void main(String[] args) {

        Runnable obj1 = () -> 
        {
            for(int i=0; i<20; i++) {
                System.out.println("Oi, sou a primeira Thread.");

                try { Thread.sleep(10); }
                catch(InterruptedException e) {}
            }
        };

        Runnable obj2 = () -> 
        {
            for(int i=0; i<20; i++) {
                System.out.println("Ola, eu sou a segunda Thread.");

                try { Thread.sleep(10); }
                catch(InterruptedException e) {}
            }
        };

        Thread threadA = new Thread(obj1);
        Thread threadB = new Thread(obj2);

        threadA.start();

        try { Thread.sleep(10); }
        catch(InterruptedException e) {}
        
        threadB.start();
    }
}

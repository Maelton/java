public class EstruturasRepeticao {
    public static void main (String[] args) {
        
        //for loop
        for(int i=1; i<11; i++) {
            System.out.println(i);
        }

        //while
        byte count = 10;
        
        while(count>0) {
            System.out.println(count);
            count--;
        }

        //do while
        count = 20;

        do {
            System.out.println(count);
        } while(count!=20);

        //Note que independentemente da condição, o escopo de "do" sempre irá acontecer ao menos uma vez.
    }
}
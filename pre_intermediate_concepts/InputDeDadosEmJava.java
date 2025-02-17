import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputDeDadosEmJava {
    
    public static void main(String[] args) {

        //====================== BUFFERED_READER ======================//

        /**
         *  A BufferedReader é uma classe que trabalha com input e output.
         *  
         *  Geralmente utilizada com recursos, tais como arquivos.
         * 
         *  Antes da classe Scanner ser adicionada a partir do Java 1.5, programadores utilizavam a BufferedReader.
         */

        //InputStreamReader constructor requires an instance of the InputStream class
        InputStreamReader in = new InputStreamReader(System.in);
        
        //BufferedReader constructor requires an instance of the Reader Class
        BufferedReader br = null;

        try {
            
            br = new BufferedReader(in);
            int y = Integer.parseInt(br.readLine());

            System.out.println("\nNumero lido pelo BufferedReader.readLine() -> " + y);
        
        } catch(IOException e) {
            /**
             * IOException  If an I/O error occurs
             */
            
            System.out.println("Calma delicio");
        } 
        //The finally block is always executed whether an exception is caught or not.
        finally {
            try {
                br.close();
            } catch(IOException e) {
                System.out.println("Tudo suave cadelo");
            }
        } 

        //============================================================ //
        

        //====================== System.in.read() ======================//

        try {

            //Retorna o valor ASCII do primeiro byte do input fornecido
            int x = System.in.read();
            System.out.print("\nNumero lido pelo System.in.read() -> " + x);
        
        } catch(IOException e) {
            /*
            * IOException If the first byte cannot be read for any reason
            *             other than end of file, or if the input stream has been closed,
            *             or if some other I/O error occurs.
            * @throws     NullPointerException If {@code b} is {@code null}.
            * @throws     IndexOutOfBoundsException If {@code off} is negative,
            *             {@code len} is negative, or {@code len} is greater than
            *             {@code b.length - off}
            * @see        java.io.InputStream#read()
            */

            System.out.println("Calma borboleto");
        }

        //============================================================ //

        //========================= SCANNER ==========================//

        Scanner sc = new Scanner(System.in);

        int z = sc.nextInt();
        System.out.println("\nNumero lido pelo Scanner.nextInt() -> " + z);

        //============================================================ //


    }
}

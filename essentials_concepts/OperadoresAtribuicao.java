public class OperadoresAtribuicao {
    
    public static void main(String[] args) {

        int k = 0;

        k += 1; //Eh igual a: a = a + 1;
        k -= 1; //Eh igual a: a = a - 1;
        k *= 1; //Eh igual a: a = a * 1;
        k /= 1; //Eh igual a: a = a / 1;

        /********** OPERADORES DE INCREMENTO E DECREMENTO **********/

        int x = 1;

        //POST-INCREMENT
        x++; //Eh igual a: x += 1; ou x = x + 1;
        
        //POST-DECREMENT
        x--; //Eh igual a: x -= 1; ou x = x - 1;

        //PRE-INCREMENT
        ++x; //Eh igual a: x += 1; ou x = x + 1;
        
        //PRE-DECREMENT
        --x; //Eh igual a: x -= 1; ou x = x - 1;

        /********** DIFERENÇA ENTRE POS E PRE INCREMENTO/DECREMENTO **********/

        System.out.println("POST-INCREMENT"); System.out.println();
        int a = 10;
        System.out.println("int a = 10; ==> a> " + a);
        System.out.println();
        
        // b recebe o valor de a, e depois a é incrementado (post-increment)
        int b = a++;
        System.out.println("int b = a++; ==> b = a; a = a+1; ==> b> " + b + " a> " + a);
        System.out.println();
        System.out.println("( b recebe o valor de a, e depois a é incrementado (post-increment) )");
        System.out.println();

        System.out.println("PRE-INCREMENT"); System.out.println();
        int n = 15;
        System.out.println("int n = 15; ==> n> " + n);
        System.out.println();
        
        // m recebe o valor de n+1, ou seja, ocorre o incremento depois o novo valor de n eh atribuido à variavel inicializada (pre-increment)
        int m = ++n;
        System.out.println("int m = ++n; ==> m = n+1; n = n+1; ==> m> " + m + " n> " + n);
        System.out.println();
        System.out.println("( m recebe o valor de n+1, ou seja, ocorre o incremento depois o novo valor de n eh atribuido à variavel inicializada (pre-increment) )");

    }
}

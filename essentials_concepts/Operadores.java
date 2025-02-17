public class Operadores {
    
    public static void main(String[] args) {

    //Operador de atribuição (=)
    char operadorDeAtribuicao = '=';
    System.out.println(operadorDeAtribuicao);

    //-------- OPERADORES MATEMÁTICOS --------//
    //Operador de soma (+)
    System.out.println("1 " + "+" + " 2 " + "= " + (1+2));

    //Operador de subtração (-)
    short salarioMinimo = 1320;
    short contas = 1000;
    
    System.out.println("Depois de todos os boletos sobraram R$: " + (salarioMinimo - contas));

    //Operador de multiplicação (*)
    System.out.println("Dois vezes Dois é: " + (2 * 2));

    //Operador de divisão (/)
    System.out.println("Cinco dividido por dois é: " + (5.0/2));
    System.out.println("Cinco dividido por dois é: " + (5/2));
    
    //Módulo (%)
    System.out.println("O resto da divisão de cinco por dois é: " + (5 % 2));

    //-------- OPERADORES DE INCREMENTO DE DECREMENTO --------//
    //Incremento (++)
    byte um = 1;
    um++;
    System.out.println("Um mais um é: " + um);

    //Decremento (--)
    byte dois = 2;
    dois--;
    System.out.println("Dois menos um é: " + dois);

    //-------- OPERADORES DE IGUALDADE --------//
    
    byte primeiroNumero = 1;
    byte segundoNumero = 2;

    //Igual a (==)
    System.out.println(primeiroNumero == segundoNumero);

    //Diferente de (!=)
    System.out.println(primeiroNumero != segundoNumero);

    //-------- OPERADORES RELACIONAIS --------//
    //Maior que (>)
    System.out.println(primeiroNumero > segundoNumero);
    
    //Maior igual que (>=)
    System.out.println(primeiroNumero >= segundoNumero);
    
    //Menor que (<)
    System.out.println(primeiroNumero < segundoNumero);

    //Menor igual que (<=)
    System.out.println(primeiroNumero <= segundoNumero);

    //-------- OPERADORES LÓGICOS --------//
    
    boolean verdadeiro = true;
    boolean falso = false;

    //Ou (||)
    System.out.println(verdadeiro || falso);

    //E (&&)
    System.out.println(verdadeiro && falso);

    }
}

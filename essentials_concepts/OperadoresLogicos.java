public class OperadoresLogicos {
    
    public static void main(String[] args) {

        boolean a = 5 < 3;
        boolean b = 4 == 4;

        System.out.print("a: 5 < 3 ==> ");
        System.out.println(a);

        System.out.print("b: 4 == 4 ==> ");
        System.out.println(b); System.out.println();

        // e ou and (&)
        System.out.print("a & b : ");
        System.out.println(a & b); System.out.println();
        
        // ou or or (|)
        System.out.print("a | b : ");
        System.out.println(a | b); System.out.println();

        //não ou not (!)
        System.out.print("a == !b : ");
        System.out.println(a == !b); System.out.println();

        //---------- SHORT CIRCUIT (Curto-circuito) ----------

        /**
         * Em operadores lógicos Java, se a avaliação de uma expressão lógica ocorrer antes da avaliação completa, ela será conhecida como Curto-circuito. Um curto-circuito acontece porque o resultado fica claro antes mesmo da avaliação completa da expressão, e o resultado é retornado.
         * 
         * No caso de AND, a expressão é avaliada até obtermos um resultado falso porque o resultado será sempre falso, independente das outras condições. Se houver uma expressão com && (AND lógico) e o primeiro operando for falso, ocorre um curto-circuito, a expressão posterior não é avaliada e falso é retornado.
         * 
         * No caso de OR, a expressão é avaliada até obtermos um resultado verdadeiro, pois o resultado será sempre verdadeiro, independente das demais condições. Se houver uma expressão com || (OU lógico) e o primeiro operando for verdadeiro, ocorrerá um curto-circuito, a avaliação será interrompida e verdadeiro será retornado.
         */
        
        boolean x = true;
        boolean y = !x;

        System.out.println("x: true");
        System.out.print("y: !x ==> ");
        System.out.println(y); System.out.println();

        // e ou and (&&)
        System.out.print("x || y : ");
        System.out.print(x || y); 
        System.out.println(" (nao chega a testar y, pois x ja eh verdadeiro)");
        System.out.println();

        // ou or or (||)
        System.out.print("y && x : ");
        System.out.print(y && x);
        System.out.println(" (nao chega a testar x, pois y ja eh falso)");
    }
}

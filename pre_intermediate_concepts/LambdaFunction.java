/**
 * Senhoras e senhores, PREPAREM-SE para apreciar o PODER das interfaces funcionais!
 */

@FunctionalInterface
interface PrimeiraInterfaceFuncional {

    void oi();

    default void tchau() {
        System.out.println("tchau\n");
    }
}

@FunctionalInterface
interface SegundaInterfaceFuncional {

    void elogiar(String pessoa, String motivo);
}

@FunctionalInterface
interface TerceiraInterfaceFuncional {

    void cantar(String pessoa);
}

@FunctionalInterface
interface QuartaInterfaceFuncional {

    float preco(float valor);
}

public class LambdaFunction {

    public static void main(String[] args) {
        
        //UTILIZANDO INNER CLASS (CLASSE ANONIMA) PARA INSTANCIAMENTO DE INTERFACE
        PrimeiraInterfaceFuncional primeiraInstancia = new PrimeiraInterfaceFuncional() 
        {
            public void oi() {
                System.out.println("Oi, tudo bem?");
            }

        };

        primeiraInstancia.oi();
        primeiraInstancia.tchau();

        //UTILIZANDO FUNÇÃO LAMBDA PARA INSTANCIAMENTO DE INTERFACE
        PrimeiraInterfaceFuncional segundaInstancia = () ->
        {
                System.out.println("Oi, tudo bem?");
                System.out.println("Sou a instancia camarada da vizinhanca.");

        };

        segundaInstancia.oi();
        segundaInstancia.tchau();

        //LAMBDA EM UMA LINHA
        PrimeiraInterfaceFuncional terceiraInstancia = () -> System.out.println("Instancia, muito prazer. Voce eh?");

        terceiraInstancia.oi();
        terceiraInstancia.tchau();

        //LAMBDA COM ARGUMENTOS
        SegundaInterfaceFuncional instanciaTeste = new SegundaInterfaceFuncional()
        {
            public void elogiar(String pessoa, String pessoa2) {
                System.out.println(pessoa + pessoa2);
            }
        };

        SegundaInterfaceFuncional quartaInstancia = (paixao, seducao) -> System.out.println("Hey " + paixao + ", " + seducao);

        quartaInstancia.elogiar("Felpa", "you are breathtaking\n");

        //LAMBDA COM UM UNICO ARGUMENTO NEM PRECISA DE PARENTESES PARA A PASSAGEM DE ARGUMENTO
        TerceiraInterfaceFuncional quintaInstancia = deusa -> System.out.println("People write songs about girls like you " + deusa);

        quintaInstancia.cantar("Felpa");

        //RETORNANDO VALORES COM LAMBDA
        QuartaInterfaceFuncional sextaInstancia = custo -> custo * 2;

        System.out.println("\nNo final a gente pagou " + sextaInstancia.preco(150) + " reais.");
    }
}
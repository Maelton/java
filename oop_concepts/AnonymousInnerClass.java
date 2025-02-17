class Carro {

    int qtdPortas = 2;

    public void acelerar() {
        System.out.println("Pisando no acelerador...");
    }

    public void freiar() {
        System.out.println("Pisando no freio...");
    }
}

public class AnonymousInnerClass {

    public static void main(String[] args) {

        /**
         * O objeto celta está sendo contruído utilizando implementações da inner class anonima, definida entre as chaves depois dos parenteses do construtor.
        */
        Carro celta = new Carro() 
        {
            int qtdPortas = 4;

            //O metodo freiar() da classe Carro() será sobrescrito
            public void freiar() {
                System.out.println("Tirando pe do acelerador...");
            }
        };

        //O atributo qtdPortas não foi alterado pela Inner Anonymous Class.
        System.out.println("qtd portas celta: " + celta.qtdPortas);

        celta.acelerar();
        celta.freiar();
    }
}

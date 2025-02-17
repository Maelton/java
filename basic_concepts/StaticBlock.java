class Carro {
    static byte qtdRodas;
    String fabricante;
    String anoFabricacao;
    String anoModelo;

    static {
        qtdRodas = 4;

        System.out.println("Static block has been called.");
    };

    public Carro() {
        fabricante = "";
        anoFabricacao = "0000";
        anoModelo = "0000";

        System.out.println("Constructor has been called.");
    };
    
}

class Motocicleta {
    static byte qtdRodas;
    String fabricante;
    String anoFabricacao;
    String anoModelo;

    static {
        qtdRodas = 2;

        System.out.println("Static block has been called.");
    };

    public Motocicleta() {
        fabricante = "";
        anoFabricacao = "0000";
        anoModelo = "0000";

        System.out.println("Constructor has been called.");
    };
    
}

public class StaticBlock {
    
    public static void main(String[] args) throws ClassNotFoundException {

        Motocicleta moto1 = new Motocicleta();
        Motocicleta moto2 = new Motocicleta();

        System.out.println();
        
        Class.forName("Carro");

    }
}

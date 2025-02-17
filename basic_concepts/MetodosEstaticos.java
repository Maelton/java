class Cachorro {

    String raca;
    static String latido = "au au";

    static void latir(Cachorro cachorro) {
        System.out.println("O cachorro de raca " + cachorro.raca + " esta latindo: " + latido);
    }

    static void latir2() {
        System.out.println(latido + latido);
    }
}

public class MetodosEstaticos {
    
    public static void main(String[] args) {

        Cachorro caramelo = new Cachorro();
        caramelo.raca = "vira-lata";

        Cachorro.latir(caramelo);
        System.out.println();

        Cachorro.latir(new Cachorro());
        System.out.println();

        Cachorro.latir2();
    }
}

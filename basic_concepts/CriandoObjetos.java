class Computador {

    public void boot() {
        System.out.println("Incializando sistema...");
    }
}

public class CriandoObjetos {
    
    public static void main(String[] args) {
        // Use a keyword "new" para inicializar objetos de outras classes.

        Computador notebookPessoal = new Computador();
        notebookPessoal.boot();
    }
}

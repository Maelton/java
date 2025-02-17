public class MethodOverload {

    /**
     * Method overloading ou sobrecarga de métodos, consiste em declarar dois ou mais métodos com o mesmo nome.
     * 
     * A sobrecarga de métodos consiste em voce declarar vários métodos em uma única classe ou em classes descendentes, com o mesmo nome, contanto que tenham assinaturas diferentes.
     * 
     * Ou seja, quantidade de parâmetros ou tipos de retorno devem ser diferentes, os métodos não podem ter assinaturas e nomes idênticos.
     * 
     */

    public int sum(int a, int b) {
        System.out.println("Primeiro método");
        return a + b;
    }

    public int sum(int x, int y, int z) {
        System.out.println("Segundo método");
        return x + y + z;
    }

    public float sum(float x, float y) {
        System.out.println("Terceiro método");
        return x + y;
    }
        
}


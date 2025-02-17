class Pessoa {

    /**
     * A keyword "this" representa o objeto atual, ou seja, o objeto que está chamando o método no momento da chamada.
     * 
     * A "this" keyword é bastante útil para economizar código, tendo em vista que não precisamos passar os próprios objetos como argumentos de métodos que auto alteram instâncias.
     * 
     * Além disso, evita possíveis erros de atribuições e inicialização de variáveis, tendo em vista que parâmetros e variáveis de instância podem possuir o mesmo identificador, utilizando a "this" especificamos que determinado identificador se refere a uma variável de instância, e não a uma variável local.
     */

    private String nome;
    private String dataNascimento;

    public String getNome() { return this.nome; };
    public void setNome(String nome) { this.nome = nome; };

    public String getDataNascimento() { return this.dataNascimento; };
    public void setDataNascimento(String data) { this.dataNascimento = data; };

}

public class ThisKeyword {
    
    public static void main(String[] args) {


    }
}

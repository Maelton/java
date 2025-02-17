import java.util.Scanner;

public class EstruturasCondicionais {
    
    public static void main(String[] args) {
        
    //-------- IF, ELSE, ELSE IF --------//

    boolean status = true;

    //IF, ELSE
    if (status) {
        System.out.println("É verdade!");
    } else {
        System.out.println("Na verdade, é falso.");
    }

    byte numero = 123;

    //IF, ELSE, ELSE IF
    if (numero>10) {
        System.out.println("O numero é maior que 10");
    } else if(numero == 10) {
        System.out.println("O numero é igual a 10");
    } else {
        System.out.println("O número é menor que 10");
    }

    //QUANDO EXISTE APENAS UM DECLARAÇÃO NO IF/ELSE AS CHAVES NAO SAO NECESSARIAS
    if(true)
        System.out.println("Eh verdade!");
    else 
        System.out.println("Nao eh verdade");

    //-------- SWITCH CASE --------//
    Scanner scanner = new Scanner(System.in);
    
    byte dia = scanner.nextByte();
    scanner.close();

    switch(dia) {
        case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Segunda-feira");
            break;
        case 3:
            System.out.println("Terça-feira");
            break;
        case 4:
            System.out.println("Quarta-feira");
            break;
        case 5:
            System.out.println("Quinta-feira");
            break;
        case 6:
            System.out.println("Sexta-feira");
            break;
        case 7:
            System.out.println("Sábado");
            break;
        default:
            System.out.println("Dia inválido!");
            break;
    }

    }
}

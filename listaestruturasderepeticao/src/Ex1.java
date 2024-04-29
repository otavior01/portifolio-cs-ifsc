package listawhilefordowhile;
import java.util.Scanner;

public class Ex1 {
    /*
    1. Escreva uma algoritmo que leia dois valores. O algoritmo encerra quando o
    primeiro valor informado for igual ao segundo valor.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int number1 = sc.nextInt();
        System.out.println("Digite um número");
        int number2 = sc.nextInt();
        do {
        if (number1 < number2) {
                System.out.println(number1+" é menor que "+number2+". Adicionando 1 ao primeiro número...");
                number1 = ++number1;
            } else if (number1 > number2) {
                System.out.println(number1+" é maior que "+number2+". Subtraindo 1 do primeiro número...");
                number1 = --number1;
            } else {
                //Do nothing...
            }
        } while (number1 != number2);           
        System.out.println("Os números são iguais");
    }
}

package listawhilefordowhile;
import java.util.Scanner;

public class Ex2 {
    /*
    2. Elabore um algoritmo que leia dois números inteiros. O segundo número lido
    deverá ser maior que o primeiro número. Mostre a soma dos dois números
    lidos.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int number1 = sc.nextInt();
        System.out.println("Digite outro número");
        int number2 = sc.nextInt();
        while (number1 > number2) {
            System.out.println("O segundo número deve ser maior que o primeiro.\nDigite outro número");
            number2 = sc.nextInt();
        }
        int add = number1 + number2;
        System.out.println("A soma dos dois números é "+add);
    }    
}

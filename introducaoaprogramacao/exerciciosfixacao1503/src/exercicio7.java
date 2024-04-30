package lista;
import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int n = sc.nextInt();
        System.out.println("O quadrado do seu número é: "+Math.pow(n,2));
    }
}
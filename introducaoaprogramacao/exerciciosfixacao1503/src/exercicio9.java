package lista;
import java.util.Scanner;
import java.lang.Math;

public class exercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int n = sc.nextInt();
        System.out.println("A raiz quadrada do seu número é: "+Math.sqrt(n));
    }
}
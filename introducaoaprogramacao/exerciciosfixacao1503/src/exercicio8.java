package lista;
import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int n1 = sc.nextInt();
        System.out.println("Digite o primeiro número:");
        int n2 = sc.nextInt();
        System.out.println("Digite o primeiro número:");
        int n3 = sc.nextInt();
        System.out.println("Digite o primeiro número:");
        int n4 = sc.nextInt();
        System.out.println("A soma dos quadrados dos números é: "+(Math.pow(n1,2)+Math.pow(n2,2)+Math.pow(n3,2)+Math.pow(n4,2)));
    }
}
package lista;
import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        System.out.print("O antecessor do seu número é: "+(n-1));
        System.out.println(" e o sucessor é: "+(n+1));
    }
}

package lista;
import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("y(x) = 3x + 2");
        System.out.println("Digite um valor para x:");
        double x = sc.nextDouble();
        double y = 3*x+2;
        System.out.println("x="+x+" y="+y);
    }
}
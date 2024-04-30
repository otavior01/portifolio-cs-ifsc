package lista;
import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversor de temperatura");
        System.out.println("Digite a temperatura em ºC:");
        int C = sc.nextInt();
        int F = (9*C+160)/5;
        System.out.println("A temperatura em fahrenheit é: "+F+" ºF");
    }  
}
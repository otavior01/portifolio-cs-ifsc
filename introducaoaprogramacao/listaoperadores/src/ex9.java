package javaapplication5;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor da compra");
        int c = sc.nextInt();
        System.out.println("Insira o valor pago");
        int p = sc.nextInt();
        int t = p-c;
        System.out.println("Valor do troco: R$"+t);
        int n100 = t/100;
        int n10 = (t%100)/10;
        int n1 = (t%100)%10;
        System.out.println("Notas de 100: "+n100);
        System.out.println("Notas de 10: "+n10);
        System.out.println("Notas de 1: "+n1);
    }
}

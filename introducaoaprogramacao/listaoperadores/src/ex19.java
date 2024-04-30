package javaapplication5;
import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número (0-999)");
        int n = sc.nextInt();
        if (n<0) { 
            n=0;
        } if (n>999) {
            n=999;
        }
        int n100 = n/100;
        int n10 = (n%100)/10;
        int n1 = (n%100)%10;
        int sn = n1+n10+n100;
        System.out.println("A soma dos digitos de "+n+" é igual a "+sn);
    }
}

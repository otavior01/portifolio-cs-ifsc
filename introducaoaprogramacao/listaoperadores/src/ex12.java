package javaapplication5;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int A = sc.nextInt();
        System.out.println("Digite outro número");
        int B = sc.nextInt();
        if (A==B) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Os números são diferentes");
        }
    }   
}

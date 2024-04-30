package javaapplication5;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor para A");
        int A = sc.nextInt();
        System.out.println("Digite um valor para B");
        int B = sc.nextInt();
        System.out.println("Digite um valor para C");
        int C = sc.nextInt();
        if ((A + B) < C) {
            System.out.println("A + B é menor que C");
            System.out.println(A+"+"+B+"<"+C);
        } else {
            System.out.println("A + B é não menor que C");
            System.out.println(A+"+"+B+"≥"+C);
        }
    }
    
}

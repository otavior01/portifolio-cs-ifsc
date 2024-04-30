package javaapplication5;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua nota na prova 1");
        int p1 = sc.nextInt();
        System.out.println("Insira sua nota na prova 2");
        int p2 = sc.nextInt();
        System.out.println("Insira sua nota no trabalho");
        int t = sc.nextInt();
        System.out.println("Insira sua frequência");
        int f = sc.nextInt();
        if (p1>=6||p2>=6) {
            if (t>=7&&f>=75) {
                System.out.println("Você foi aprovado");
            }
            if (t==6&&f>=90) {
                System.out.println("Você foi aprovado");
            } else {
                System.out.println("Você não foi aprovado");
            }
        } else {
            System.out.println("Você não foi aprovado");
        }
    } 
}

package javaapplication5;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua nota na prova 1");
        int p1 = sc.nextInt();
        System.out.println("Insira sua nota na prova 2");
        int p2 = sc.nextInt();
        System.out.println("Insira sua nota no trabalho");
        int t = sc.nextInt();
        boolean a = ((p1>=6||p2>=6)&&(t>=7));
        if (a==true) {
            System.out.println("Você foi aprovado");
        } else {
            System.out.println("Você não foi aprovado");
        }
    } 
}

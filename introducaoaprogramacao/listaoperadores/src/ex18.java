package javaapplication5;
import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia atual (1-30)");
        int currentDay = sc.nextInt();
        if (currentDay<1) {
            currentDay = 1;
        }
        if (currentDay>30) {
            currentDay = 30;
        }
        System.out.println("Digite o mês atual (1-12)");
        int currentMonth = sc.nextInt();
        if (currentMonth<1) {
            currentMonth=1;
        }
        if (currentMonth>12) {
            currentMonth = 12;
        }
        System.out.println("Digite o ano atual");
        int currentYear = sc.nextInt();
        System.out.println("Digite o dia do seu nascimento (1-30)");
        int birthDay = sc.nextInt();
        if (birthDay<1) {
            birthDay = 1;
        }
        if (birthDay>30) {
            birthDay = 30;
        }
        System.out.println("Digite o mês do seu nascimento (1-12)");
        int birthMonth = sc.nextInt();
        if (birthMonth<1) {
            birthMonth=1;
        }
        if (birthMonth>12) {
            birthMonth = 12;
        }
        System.out.println("Digite o ano do seu nascimento");
        int birthYear = sc.nextInt();
        int daysSinceBirth = (currentDay - birthDay) + ((currentMonth-birthMonth)*30) + ((currentYear - birthYear) * 360);
        System.out.println("Você viveu "+daysSinceBirth+" dias");
    }   
}

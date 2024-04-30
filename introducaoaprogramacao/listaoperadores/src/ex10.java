package javaapplication5;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o comprimento da pista em metros");
        int runwayLength = sc.nextInt();
        System.out.println("Digite o peso do avião em toneladas");
        int planeWeight = sc.nextInt();
        System.out.println("Digite a distância de visibilidade em metros");
        int visibilityDistance = sc.nextInt();
        System.out.println("Digite a quantidade de chuva em milimetros\n(Digite 0 se não estiver chovendo)");
        int rainAmount = sc.nextInt();
        System.out.println("Digite o número de passageiros");
        int passengers = sc.nextInt();
        System.out.println("O avião possui sistema de decolagem automatizada?\nResponda com \"true\" para sim e \"false\" para não");
        boolean autoTakeoff = sc.nextBoolean();
        if (visibilityDistance<20 && !autoTakeoff) {
            System.out.println("O avião não pode decolar");
        } else if (rainAmount > 5 ||
                (rainAmount <= 5 && rainAmount > 0 && passengers > 100) ||
                (runwayLength < 1500 && planeWeight > 40) ||
                (runwayLength > 1500 && runwayLength < 2000 && planeWeight > 60)) {
            System.out.println("O avião não pode decolar");
        } else {
            System.out.println("O avião pode decolar");
        }               
    }
}


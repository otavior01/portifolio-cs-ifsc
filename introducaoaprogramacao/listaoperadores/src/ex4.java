package javaapplication5;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Insira seu peso em kg:");
        double kg = sc.nextDouble();
        System.out.println("Insira sua altura em metros:");
        double m = sc.nextDouble();
        double IMC = kg/Math.pow(m,2);
        System.out.println("O seu IMC é: "+df.format(IMC));
        if (IMC>25) {
            System.out.println("Você está acima do peso.");
        }
    }
}

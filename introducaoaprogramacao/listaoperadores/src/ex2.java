package javaapplication5;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Insira o preço do kW");
        double pkW = sc.nextDouble();
        System.out.println("Insira a quantidade gasta de kW");
        double kW = sc.nextDouble();
        double c = kW*pkW;
        double ca = c+(c*0.1);
        System.out.println("O preço da conta sem atraso é R$"+c+" e com atraso é R$"+ca);
    }
}

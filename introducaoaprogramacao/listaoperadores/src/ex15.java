package javaapplication5;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Digite o salário bruto");
        double sb = sc.nextDouble();
        System.out.println("Digite o número de dependentes");
        double nd = sc.nextDouble();
        double sl = sb - (sb * 0.11) - (sb * 0.15) + (nd * 150);
        System.out.println("Salário liquido: R$"+df.format(sl));
    }   
}

package javaapplication5;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Digite o preço da primeira mercadoria no primeiro mês");
        double m1 = sc.nextDouble();
        System.out.println("Digite o preço da segunda mercadoria no primeiro mês");
        double m2 = sc.nextDouble();
        System.out.println("Digite o preço da terceira mercadoria no primeiro mês");
        double m3 = sc.nextDouble();
        System.out.println("Digite o preço da primeira mercadoria no segundo mês");
        double n1 = sc.nextDouble();
        System.out.println("Digite o preço da segunda mercadoria no segundo mês");
        double n2 = sc.nextDouble();
        System.out.println("Digite o preço da terceira mercadoria no segundo mês");
        double n3 = sc.nextDouble();
        double i1 = ((n1-m1)/m1)*1;
        double i2 = ((n2-m2)/m2)*1;
        double i3 = ((n3-m3)/m3)*1;
        double iF = ((i1+i2+i3)/3)*100;
        if (iF>0.55) {
            System.out.println("A inflação é de "+df.format(iF)+"%, está acima da meta de 0.55%");
        } else {
            System.out.println("A inflação é de "+df.format(iF)+"%, está abaixo da meta de 0.55%");
        } 
    }   
}

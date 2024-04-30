package javaapplication5;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println("Digite o número de parcelas");
        int np = sc.nextInt();
        System.out.println("Diigte o valor de cada parcela");
        double vp = sc.nextDouble();
        System.out.println("Digite quantas parcelas já foram pagas");
        int pp = sc.nextInt();
        int pr = np - pp;
        double vt = np*vp;
        double vpp = pp*vp;
        double vr = pr*vp;
        System.out.println("Número de parcelas: "+np+" | Valor de cada parcela: R$"+df.format(vp)+" | Valor total: R$"+df.format(vt)+"\nParcelas pagas: "+pp+" | Valor pago: R$"+df.format(vpp)+"\nParcelas restantes: "+pr+" | Valor restante: R$"+df.format(vr));
    }  
}

package javaapplication5;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        int vs = 340;
        System.out.println("Digite o tempo em segundos");
        double t = sc.nextDouble();
        double d = vs*t;
        if (d<200) {
            System.out.println("Você está dentro da area de perigo do raio, pois a sua distância é de "+df.format(d)+"m.");
        } else {
            System.out.println("A distância do raio é: "+df.format(d)+"m.");
        }
    }
}

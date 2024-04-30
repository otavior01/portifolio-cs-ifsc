package javaapplication5;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Digite a distância do trajeto em km");
        int km = sc.nextInt();
        System.out.println("Digite o consumo médio do veículo em km/l");
        double kml = sc.nextDouble();
        System.out.println("Digite o preço por litro do combustível");
        double price = sc.nextDouble();
        double travelPrice = (km/kml)*price;
        System.out.println("O preço do trajeto será de R$"+df.format(travelPrice));
    }
}

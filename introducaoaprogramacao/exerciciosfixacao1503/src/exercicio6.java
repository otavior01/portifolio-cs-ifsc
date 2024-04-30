package lista;
import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcular consumo");
        System.out.println("Digite a distância em Km(quilômetros):");
        double dist = sc.nextDouble();
        System.out.println("Digite o volume de combustível consumido em l(litros):");
        double vol =  sc.nextDouble();
        double kml = dist/vol;
        System.out.println("O consumo médio foi de "+kml+"Km/l");
    }
}
package javaapplication5;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o comprimento em metros");
        int c = Integer.valueOf(sc.nextLine());
        System.out.println("Digite a largura em metros");
        int l = Integer.valueOf(sc.nextLine());
        System.out.println("Digite a altura em metros");
        int h = Integer.valueOf(sc.nextLine());
        int ac = c*l;
        int ap = ((l*h)*2)+((c*h)*2);
        int v = c*l*h;
        System.out.println("Area do piso: "+ac+"m²");
        System.out.println("Area das paredes: "+ap+"m²");
        System.out.println("Volume da sala: "+v+"m³");
        if (v<100){
            System.out.println("Tamanho do aparelho de ar-condicionado: Pequeno");
        }
        if (v>=100&&v<=500){
            System.out.println("Tamanho do aparelho de ar-condicionado: Médio");
        }
        if (v>500){
            System.out.println("Tamanho do aparelho de ar-condicionado: Grande");
        }
    }
}

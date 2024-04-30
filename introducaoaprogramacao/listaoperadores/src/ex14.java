package javaapplication5;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println("Digite o nome do candidato");
        String name = sc.nextLine();
        System.out.println("Digite a nota na prova de Português");
        double np = sc.nextDouble();
        if (np>10){
            np=10;
        }
        System.out.println("Digite a nota na prova de Matemática");
        double nm = sc.nextDouble();
        if (nm>10){
            nm=10;
        }
        System.out.println("Digite a nota na prova de Conhecimentos Gerais");
        double ncg = sc.nextDouble();
        if (ncg>10){
            ncg=10;
        }
        double avg = (np+nm+ncg)/3;
        System.out.println("Candidato:" +name);
        System.out.println("Notas\n\nPortuguês: "+df.format(np)+"\nMatemática: "+df.format(nm)+"\nConhecimentos Gerais: "+df.format(ncg)+"\n\nMédia: "+df.format(avg));
        if ((avg >= 7) && (np >= 5) && (nm >= 5) && (ncg >= 5)) {
            System.out.println("O candidato foi aprovado");
        } else {
            System.out.println("O candidato não foi aprovado");
        }
    }
    
}

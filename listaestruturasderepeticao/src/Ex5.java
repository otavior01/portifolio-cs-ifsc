package listawhilefordowhile;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex5 {
    /*
    5. Escreva um algoritmo, que leia um conjunto de 10 fichas, cada uma
    contendo, a altura e o código do sexo de uma pessoa (código = 1 se for
    masculino e 2 se for feminino), e calcule e imprima:
    -a maior altura da turma;
    -a média de altura das mulheres;
    -a média de altura da turma.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        double averageHeight, averageHeightF;
        double height;
        double heightCacheF = 0;
        double heightCache = 0;
        double biggestHeight = -1;
        int femaleNumber = 0;
        int sexCode = -1;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ficha "+(i+1));
            System.out.println("Digite a altura em metros");
            height = sc.nextDouble();
            boolean check = false;
            while (!check) {
                System.out.println("Digite o sexo (1-Masculino | 2-Feminino)");
                sexCode = sc.nextInt();
                if ((sexCode == 1) || (sexCode == 2)){
                    check = true;
                } else {
                    System.out.println("Código invalido, tente novamente");
                }
            }
            if (biggestHeight < height) {
                biggestHeight = height;
            }
            if (sexCode == 2) {
                femaleNumber++;
                heightCacheF += height;
            }
            heightCache += height;
        }
        averageHeight = heightCache / 10;
        if (femaleNumber != 0) {
            averageHeightF = heightCacheF / femaleNumber;
        } else {
            averageHeightF = 0;
        }
        System.out.println("Maior altura da turma: "+df.format(biggestHeight)+"m");
        System.out.println("Média das mulheres: "+df.format(averageHeightF)+"m");
        System.out.println("Média da turma: "+df.format(averageHeight)+"m");
    }  
}

package listawhilefordowhile;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex6 {
    /*
    6. Um cinema possui capacidade de 20 lugares e está sempre com ocupação
    total. Certo dia, cada espectador respondeu a um questionário, no qual
    constava:
    -sua idade;
    -sua opinião em relação ao filme, segundo as seguintes notas:
    Nota    Significado
    A       Ótimo
    B       Bom
    C       Regular
    D       Ruim
    Elabore um algoritmo que, lendo estes dados, calcule e imprima:
    -a quantidade de respostas ótimo;
    -a média de idade das pessoas que responderam ruim;
    -a diferença de idade entre a pessoa de maior idade com a pessoa de menor
    de idade que responderam o questionário. 
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.##");
        int age;
        int lowestAge = 2147483647;
        int highestAge = -2147483648;
        String[] rating = {"A", "a", "B", "b", "C", "c", "D", "d"};
        String userRating = "";
        int greatRatingCount = 0;
        int goodRatingCount = 0;
        int regularRatingCount = 0;
        int badRatingCount = 0;
        int badRatingAgeCache = 0;
        int ageDiff;
        double badRatingAvgAge;       
        for (int i = 0; i < 5; i++) {
            System.out.println("Questionário nº"+(i + 1));
            System.out.print("Digite a sua idade -> ");
            age = sc.nextInt();
            sc.nextLine();
            boolean check = false;
            System.out.println("(A - Ótimo | B - Bom | C - Regular | D - Ruim)\nDigite a nota que deseja dar ao filme -> ");
            while (!check) {
                userRating = sc.next();
                for (String r : rating) {
                    if (userRating.equals(r)) {
                        check = true;
                        break;
                    }
                }
                if (!check) {
                        System.out.print("Código inválido, tente novamente -> ");
                    }
            }
            switch (userRating) {
                case "A", "a" -> greatRatingCount++;
                case "B", "b" -> goodRatingCount++;
                case "C", "c" -> regularRatingCount++;
                case "D", "d" -> {
                    badRatingAgeCache += age;
                    badRatingCount++;
                }
            }
            lowestAge = Math.min(lowestAge, age);
            highestAge = Math.max(highestAge, age);
        }
        ageDiff = highestAge - lowestAge;
        if (badRatingCount != 0) {
            badRatingAvgAge = (double) (badRatingAgeCache / badRatingCount);
        } else {
            badRatingAvgAge = 0;
        }
        System.out.println("Respostas:");
        System.out.println("\nÓtimo: "+greatRatingCount);
        System.out.println("Bom: "+goodRatingCount);
        System.out.println("Regular: "+regularRatingCount);
        System.out.println("Ruim: "+badRatingCount);
        System.out.println("\nIdade média de quem respondeu com \"Ruim\": "+df.format(badRatingAvgAge));
        System.out.println("\nDiferença entre a idade mais alta e a mais baixa "+ageDiff);
    }  
}

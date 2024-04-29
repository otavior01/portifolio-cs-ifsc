package listawhilefordowhile;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex7 {
    /*
    7. Faça um programa para calcular a conta final de um hóspede de um hotel
    fictício, considerando que: . Devem ser lidos o nome do hóspede, o tipo do
    apartamento utilizado (A, B, C), o número de diárias utilizadas pelo hóspede
    (que deverá ser superior a zero);
    O valor da diária é determinado pela seguinte tabela:
    TIPO DO APTO    VALOR DA DIÁRIA (R$)
    A               150.00
    B               100.00
    C               75.00
    Calcule o total a pagar ( total a pagar é o valor da diária multiplicado pelo
    numero de dias hospedados)
    - Escreva a conta final contendo: o nome do hóspede, o tipo do
    apartamento, valor total das diárias.
    - Para cadastrar os dados de novo hóspede pergunte Deseja continuar
    S/N. 
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        String[] roomTypes = {"A", "B", "C"};
        double[] roomPrices = {150, 100, 75};
        String guestName;
        String guestRoom = "";
        int daysHosted = -1;
        double finalPrice;
        boolean continueProgram = true;
        do {
            System.out.println("Cadastro de hóspede\n");
            System.out.println("Digite o nome do hóspede");
            guestName = sc.nextLine();            
            boolean validRoom = false;
            while (!validRoom) {
                System.out.println("Digite o tipo do quarto do hóspede");
                guestRoom = sc.nextLine();
                for (String room : roomTypes) {
                    if (guestRoom.equals(room)) {
                        validRoom = true;
                        break;
                    }
                }
                if (!validRoom) {
                    System.out.println("Tipo de quarto inválido, tente novamente\n");
                }
            }            
            boolean daysHostedCheck = false;
            while (!daysHostedCheck) {
                System.out.println("Digite quantos dias o hóspede ficou no quarto");
                daysHosted = sc.nextInt();
                sc.nextLine();
                if (daysHosted > 0) {
                    daysHostedCheck = true;
                } else {
                    System.out.println("Número inválido, não pode ser menor ou igual a zero\nTente novamente\n");
                }
            }            
            int roomIndex = 0;
            for (int i = 0; i < roomTypes.length; i++) {
                if (guestRoom.equals(roomTypes[i])) {
                    roomIndex = i;
                    break;
                }
            }
            finalPrice = roomPrices[roomIndex] * daysHosted;            
            System.out.println("Conta para "+guestName);
            System.out.println("Tipo do quarto: "+guestRoom);
            System.out.println("Diárias: "+daysHosted+"\tPreço por diária: R$"+roomPrices[roomIndex]);
            System.out.println("Preço da estadia: R$"+df.format(finalPrice));            
            System.out.println("Deseja cadastrar os dados de um novo hóspede? S - Sim | N - Não");
            char userChoice = sc.next().charAt(0);
            sc.nextLine();
            switch (userChoice) {
                case 'S', 's' -> System.out.println("\n");
                case 'N', 'n' -> {
                    System.out.println("Programa finalizado");
                    continueProgram = false;
                }
                default -> System.out.println("Resposta Inválida");
            }
        } while(continueProgram);
    }
}
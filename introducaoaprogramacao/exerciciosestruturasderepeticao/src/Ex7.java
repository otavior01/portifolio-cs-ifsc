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
        // Initialize scanner for user input
        Scanner sc = new Scanner(System.in);
        // DecimalFormat for formatting currency
        DecimalFormat df = new DecimalFormat("#0.00");
        
        // Array of room types and their corresponding prices
        String[] roomTypes = {"A", "B", "C"};
        double[] roomPrices = {150, 100, 75};
        
        // Variables to store guest information
        String guestName;
        String guestRoom = "";
        int daysHosted = -1;
        double finalPrice;
        
        // Flag to control program continuation
        boolean continueProgram = true;
        // Counter for number of guests
        int count = 1;
        
        // Main loop to handle guest registration
        do {
            System.out.println("Cadastro de hóspede "+count);
            System.out.print("Digite o nome do hóspede -> ");
            // Read guest name
            guestName = sc.nextLine();             
            // Validate room type input
            boolean validRoom = false;
            System.out.print("( A | B | C )\nDigite o tipo do quarto do hóspede -> ");
            while (!validRoom) {
                // Read guest room type
                guestRoom = sc.nextLine();
                for (String room : roomTypes) {
                    if (guestRoom.equals(room)) {
                        validRoom = true;
                        break;
                    }
                }
                if (!validRoom) {
                    System.out.print("Tipo de quarto inválido, tente novamente -> ");
                }
            }            
            // Validate number of days hosted input
            boolean daysHostedCheck = false;
            System.out.println("Digite quantos dias o hóspede ficou no quarto");
            while (!daysHostedCheck) {
                // Read number of days hosted
                if (sc.hasNextInt()) { // Check if input is an integer
                    daysHosted = sc.nextInt();                    
                    //Check if daysHosted is above zero
                    if (daysHosted > 0) {
                        daysHostedCheck = true;
                    } else {
                        System.out.print("Número inválido, tente novamente -> ");
                    } 
                } else {
                    System.out.print("Entrada inválida, tente novamente -> ");
                }
                sc.nextLine(); // Consume newline character
            }            
            // Calculate final price based on room type and days hosted
            int roomIndex = 0;
            for (int i = 0; i < roomTypes.length; i++) {
                if (guestRoom.equals(roomTypes[i])) {
                    roomIndex = i;
                    break;
                }
            }
            finalPrice = roomPrices[roomIndex] * daysHosted;            
            // Display guest bill
            System.out.println("Conta para "+guestName);
            System.out.println("Tipo do quarto: "+guestRoom);
            System.out.println("Diárias: "+daysHosted+"\tPreço por diária: R$"+roomPrices[roomIndex]);
            System.out.println("Preço da estadia: R$"+df.format(finalPrice));            
            // Ask user if they want to register another guest
            System.out.println("Deseja cadastrar os dados de um novo hóspede? S - Sim | N - Não");
            boolean userChoiceCheck = false;
            while (!userChoiceCheck) {
                String userChoice = sc.nextLine().trim().toLowerCase();
                // Handle user choice
                switch (userChoice) {
                    case "s" -> {
                        System.out.println("\n");
                        userChoiceCheck = true;
                        count++;
                        break;
                    }
                    case "n" -> {
                        System.out.println("Programa finalizado");
                        userChoiceCheck = true;
                        continueProgram = false;
                        break;
                    }
                    default -> {
                        System.out.print("Resposta Inválida, tente novamente -> ");
                    }
                }
            }
        } while(continueProgram); // Continue loop if user wants to register another guest
    }
}

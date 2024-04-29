package listawhilefordowhile;
import java.util.Scanner;

public class Ex8 {
    /*
    8. Escreva um programa para determinar o tipo de bilhete que cada visitante de
    um parque de diversão deve comprar. O tipo de bilhete é determinado em
    função da idade do visitante, de acordo com a tabela abaixo. O programa
    deverá solicitar a leitura de um novo bilhete. A execução do programa deverá
    encerrar quando o usuário informa “não”. Mostre no final a quantidade de
    bilhetes infantis e adultos vendidos.
    Idade           Bilhete
    Inferior a 6    Isento de pagamento
    Entre 6 e 13    Bilhete de criança
    Entre 13 e 65   Bilhete normal
    Mais de 65      Bilhete de 3ª Idade
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int visitorAge = 0; // Initialize visitorAge to 0        
        String[] ticketTypes = {"Isento de pagamento", "Bilhete de criança", "Bilhete normal", "Bilhete de 3ª Idade"}; //String array with ticket types
        int ticketType1Count = 0, ticketType2Count = 0, ticketType3Count = 0, ticketType4Count = 0; // Initialize ticket type counters
        int count = 1; // Initialize ticket count
        int i = -1; // Initialize ticket type index
        boolean continueProgram = true; // Flag to continue the program        
        // Main loop to handle ticket sales
        do {
            System.out.println("Bilhete "+count+"\n");
            boolean ageCheck = false;            
            // Loop to validate visitor age input
            while (!ageCheck) {
                System.out.println("Digite a idade do visitante");
                if (sc.hasNextInt()) { // Check if input is an integer
                    visitorAge = sc.nextInt(); // Get visitor age
                    sc.nextLine();
                    // Check if age is above 0
                    if (visitorAge > 0) {
                        ageCheck = true;
                    } else {
                        System.out.println("Idade inválida, Tente novamente\n");
                    }
                } else {
                    System.out.println("Entrada inválida, Tente novamente\n");
                    sc.nextLine(); // Consume invalid input
                }
            }           
            // Determine ticket type based on visitor age
            if (visitorAge < 6) {
                ticketType1Count++;
                i = 0;                        
            } else if (visitorAge >= 6 && visitorAge <= 13) {
                ticketType2Count++;
                i = 1; 
            } else if (visitorAge > 13 && visitorAge <=65) {
                ticketType3Count++;
                i = 2; 
            } else if (visitorAge > 65) {
                ticketType4Count++;
                i = 3; 
            }          
            // Display ticket information
            System.out.println("Idade do visitante: "+visitorAge);
            System.out.println("Tipo do bilhete: "+ticketTypes[i]);
            System.out.println("\nDeseja continuar? S - Sim | N - Não");
            char userChoice = sc.next().charAt(0);
            sc.nextLine();                      
            // Check user choice to continue or end the program
            switch (userChoice) {
                case 'S', 's' -> {
                    System.out.println("\n");
                    count++;
                }
                case 'N', 'n' -> {
                    System.out.println("Programa finalizado");
                    continueProgram = false;
                }
                default -> System.out.println("Resposta Inválida");
            }
        } while(continueProgram); // Loop until continueProgram is false        
        // Display ticket counts
        System.out.println("Contagem de bilhetes:");
        System.out.println(ticketTypes[0]+": "+ticketType1Count);
        System.out.println(ticketTypes[1]+": "+ticketType2Count);
        System.out.println(ticketTypes[2]+": "+ticketType3Count);
        System.out.println(ticketTypes[3]+": "+ticketType4Count);
    } 
}
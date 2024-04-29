package listawhilefordowhile;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex9 {
    /*
    9. Construir um algoritmo que calcule o imposto de renda de um contribuinte,
    considerando que seus dados (CPF, renda mensal e classe de renda) são
    valores informados pelo usuário. Mostre na tela a alíquota de desconto
    aplicada e o valor a ser descontado. O algoritmo encerra quando for informado
    o CPF 0
    CLASSE  ALÍQUOTA
    A       isento
    B       5%
    C       10% 
    D       15% 
    E       20%
     */
    public static void main(String[] args) {
        // Initialize Scanner and Decimal Formatters
        Scanner sc = new Scanner(System.in);
        DecimalFormat CPF = new DecimalFormat("00000000000"); // Format for CPF
        DecimalFormat df = new DecimalFormat("#0.00");        // Format for currency
        DecimalFormat dc = new DecimalFormat("0");            // Format for percentage

        // Initialize variables
        double cpf = Double.NaN;                     // CPF number
        double monthlyIncome = -1,                   // Monthly income
               monthlyIncomeTax = -1,                // Tax amount to be deducted
               monthlyIncomeFinal = -1;              // Monthly income after tax deduction
        char userClass = '0';                        // Taxpayer class (A, B, C, D, or E)
        char[] classType = {'A', 'B', 'C', 'D', 'E'};// Array of taxpayer classes
        double[] classRate = {0, 5, 10, 15, 20};     // Array of tax rates corresponding to each class
        int count = 1;                               // Counter

        System.out.println("Início do programa. Digite 0 no CPF para finalizar");
        // Main loop to input data for each contribuinte
        OUTER:
        do {
            System.out.println("______________");
            System.out.println("Contribuinte " + count);
            System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");

            // Input CPF number
            System.out.println("\nDigite o CPF do contribuinte");
            boolean cpfCheck = false;
            while (!cpfCheck) {
                if (sc.hasNextDouble()) {
                    cpf = sc.nextDouble();
                    sc.nextLine(); // Consume newline character
                    if (cpf == 0) {
                        break OUTER; // Terminate program if CPF is 0
                    } else if (cpf < 0) {
                        System.out.print("CPF não pode ser negativo, tente novamente ->");
                    } else {
                        cpfCheck = true;
                        break;
                    }
                } else {
                    System.out.print("Entrada inválida, tente novamente ->");
                    sc.nextLine(); // Consume invalid input
                }
            }

            // Input taxpayer class
            System.out.println("Digite a classe do contribuinte( A | B | C | D | E )");
            boolean classCheck = false;
            while (!classCheck) {
                userClass = sc.next().charAt(0);
                sc.nextLine(); // Consume newline character
                for (char c : classType) {
                    if (userClass == c) {
                        classCheck = true;
                        break;
                    }
                }
                if (!classCheck) {
                    System.out.print("Classe inválida, tente novamente -> ");
                }
            }

            // Input monthly income
            System.out.println("Digite a renda mensal do contribuinte");
            boolean incomeCheck = false;
            while (!incomeCheck) {
                if (sc.hasNextDouble()) {
                    monthlyIncome = sc.nextDouble();
                    sc.nextLine(); // Consume newline character
                    if (monthlyIncome > 0) {
                        incomeCheck = true;
                    } else {
                        System.out.print("Valor inválido, a renda mensal não pode ser negativa ou zero. Tente novamente ->");
                    }
                } else {
                    System.out.print("Entrada inválida, tente novamente ->");
                    sc.nextLine(); // Consume invalid input
                }
            }
            
            // Calculate tax amount and final income
            int index = 0;
            for (int i = 0; i < classType.length; i++) {
                if (userClass == classType[i]) {
                    index = i;
                    break;
                }
            }
            monthlyIncomeTax = monthlyIncome * (classRate[index] / 100);
            monthlyIncomeFinal = monthlyIncome - monthlyIncomeTax;

            // Output data
            System.out.println("\nDados do contribuinte:\n");
            System.out.println("CPF: " + CPF.format(cpf) + "\tClasse: " + classType[index]);
            System.out.println("Renda mensal: R$" + df.format(monthlyIncome));
            System.out.println("Alíquota aplicada: " + dc.format(classRate[index]) + "%" + "\tDesconto: R$" + df.format(monthlyIncomeTax));
            System.out.println("Renda mensal taxada: R$" + df.format(monthlyIncomeFinal) + "\n");

            count++;
        } while (cpf != 0); // Repeat until CPF is 0

        // Terminate program
        System.out.println("Programa Finalizado");
    }
}

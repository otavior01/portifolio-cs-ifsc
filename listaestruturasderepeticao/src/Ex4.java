package listawhilefordowhile;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4 {
    /*
    4. O cardápio de uma lancheria é o seguinte:
    Especificação   Código  Preço
    Cachorro quente 100     4,00
    X Salada        101     6,00
    Bauru com ovo   102     6,50
    Refrigerante    103     2,00
    Escreva um algoritmo que mostre o cardápio para o usuário e permita que o
    usuário informe o código do item pedido, a quantidade e calcule o valor a ser
    pago por aquele lanche. Mostre na tela o item pedido e o valor a ser pago. 
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        String[] itemNames = {"Cachorro quente", "X Salada", "Bauru com ovo", "Refrigerante"};
        int[] itemCodes = {100, 101, 102, 103};
        double[] itemPrices = {4, 6, 6.5, 2};
        System.out.println("Cardápio:\nEspecificação\tCódigo\tPreço");
        for (int i = 0; i < itemNames.length; i++) {
            System.out.println(itemNames[i]+"\t"+itemCodes[i]+"\tR$"+df.format(itemPrices[i]));
        }
        boolean validCode = false;
        int userCode = 0;
        while (!validCode) {
            System.out.println("Digite o código do item desejado");
            userCode = sc.nextInt();
            for (int code : itemCodes) {
                if (userCode == code) {
                    validCode = true;
                    break;
                }
            }
            if (!validCode) {
                System.out.println("Código inválido, tente novamente");
            }
        }
        System.out.println("Digite quantos itens deseja");
        int quantity = sc.nextInt();
        double finalPrice = Double.NaN;
        String itemName = "Código inválido";
        for (int i = 0; i < itemCodes.length; i++) {
            if (userCode == itemCodes[i]) {
                finalPrice = itemPrices[i] * quantity;
                itemName = itemNames[i];
                break;
            }
        }
        System.out.println("Item pedido: "+itemName);
        System.out.println("Valor a ser pago: R$"+df.format(finalPrice));
    }
}

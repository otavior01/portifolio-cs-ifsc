package lista;
import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite seu endereço:");
        String end = sc.nextLine();
        System.out.println("Digite seu número de telefone:");
        int tel = sc.nextInt();
        System.out.println("Seu nome é "+"\""+nome+"\""+", o seu endereço é "+"\""+end+"\""+" e o seu número de telefone é "+"\""+tel+"\"");
    }
}
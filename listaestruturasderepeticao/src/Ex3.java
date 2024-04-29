package listawhilefordowhile;
import java.util.Scanner;

public class Ex3 {
    /*
    3. Elabore um algoritmos que leia o nome, idade, sexo de uma pessoa. O
    algoritmo encerras se a idade lida for igual a zero. Mostre a quantidade de
    repetições do algoritmo.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, sex;
        int reps = 0;
        int age = -1;
        do {
            System.out.println("Repetição "+reps++);
            System.out.println("Digite o nome");
            name = sc.nextLine();
            System.out.println("Digite o sexo");
            sex = sc.nextLine();
            System.out.println("Digite a idade");
            age = sc.nextInt();
            sc.nextLine(); //Consume newline character
        } while (age != 0);
        System.out.println("Nome: "+name);
        System.out.println("Sexo: "+sex);
        System.out.println("Idade: "+age);
    }
}

package listawhilefordowhile;
import java.util.Scanner;

public class Ex3 {
    /*
    3. Elabore um algoritmo que leia o nome, idade, sexo de uma pessoa. O
    algoritmo encerra se a idade lida for igual a zero. Mostre a quantidade de
    repetições do algoritmo.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "", sex = "";
        int reps = 0;
        int age = -1;
        while (age != 0) {
            System.out.println("Repetição "+reps);
            System.out.print("Digite o nome -> ");
            name = sc.nextLine();
            System.out.print("Digite o sexo -> ");
            sex = sc.nextLine();
            System.out.print("Digite a idade -> ");
            age = sc.nextInt();
            sc.nextLine(); //Consume newline character
            reps++;
        }
        System.out.println("Nome: "+name);
        System.out.println("Sexo: "+sex);
        System.out.println("Idade: "+age);       
    }
}

// Exercício dos numeros iguais.
import java.util.Scanner;

public class Exercicio1{

    public static void main(String[] args) {

        Integer Num1, Num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        Num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        Num2 = scanner.nextInt();
        
        if (Num1 == Num2) {
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");   
        }       

    }
}

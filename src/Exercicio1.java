// Exerc�cio dos numeros iguais.
import java.util.*;

public class Exercicio1{

    public static void main(String[] args) {

        Integer Num1, Num2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro n�mero: ");
        Num1 = scan.nextInt();
        System.out.println("Digite o segundo n�mero: ");
        Num2 = scan.nextInt();
        
        if (Num1 == Num2) {
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");   
        }       

    }
}
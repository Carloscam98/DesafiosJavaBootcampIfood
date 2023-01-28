//Exercício soma recursiva.
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio3{
    public static void main(String[] args) {
        

        int N = 0;
        int soma = 0;


        /*
         * Estrutura de repetição WHILE:
         * Caso o usuário insira algo diferente de um número inteiro,
         * irá repetir até executar corretamente.
         */

        while(true) {

             Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("\nDigite um número:");
                N = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("\nEntrada de dados inválida, entrada esperada: NÚMERO INTEIRO. " + "Tente novamente.");
            }

        }


        // Estrutura de repetição FOR que irá realizar o somatório.
        for (int i = N; i > 0; i--){
            soma += i;
        }

       System.out.println("\nA soma de todos os números de 1 até "+ N + " é: " + soma + ".");
    }
}
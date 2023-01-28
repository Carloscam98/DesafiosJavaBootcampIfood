//Exerc�cio soma recursiva.
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio3{
    public static void main(String[] args) {
        

        int N = 0;
        int soma = 0;


        /*
         * Estrutura de repeti��o WHILE:
         * Caso o usu�rio insira algo diferente de um n�mero inteiro,
         * ir� repetir at� executar corretamente.
         */

        while(true) {

             Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("\nDigite um n�mero:");
                N = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("\nEntrada de dados inv�lida, entrada esperada: N�MERO INTEIRO. " + "Tente novamente.");
            }

        }


        // Estrutura de repeti��o FOR que ir� realizar o somat�rio.
        for (int i = N; i > 0; i--){
            soma += i;
        }

       System.out.println("\nA soma de todos os n�meros de 1 at� "+ N + " �: " + soma + ".");
    }
}
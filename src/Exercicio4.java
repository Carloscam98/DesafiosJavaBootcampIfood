 /*
 * DESCRIÇÃO DO EXERCÍCIO:
 * Você receberá um número onde:
 * Se o número for um múltiplo de 3 e 5 -> "FizzBuzz"
 * Se o número for apenas múltiplo de 3 -> "Fizz"
 * Se o número for apenas múltiplo de 5 -> "Buzz"
 * Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido.
  */
import java.util.Scanner;

public class Exercicio4{

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

       System.out.println("Digite um número: ");
        int num = number.nextInt();
        verificar(num);
    }
    static void verificar(int num){
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0 || num % 5 == 0) {
            if (num % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println("Buzz");
            }
        } else {
            System.out.println(num);
        }
    }

}

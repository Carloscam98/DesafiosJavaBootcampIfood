 /*
 * DESCRI��O DO EXERC�CIO:
 * Voc� receber� um n�mero onde:
 * Se o n�mero for um m�ltiplo de 3 e 5 -> "FizzBuzz"
 * Se o n�mero for apenas m�ltiplo de 3 -> "Fizz"
 * Se o n�mero for apenas m�ltiplo de 5 -> "Buzz"
 * Se o n�mero n�o for um m�ltiplo de 3 ou 5, o n�mero deve ser exibido.
  */
import java.util.Scanner;

public class Exercicio4{

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

       System.out.println("Digite um n�mero: ");
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

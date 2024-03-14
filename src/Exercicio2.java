import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
         

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero para verificar se faz parte da sequencia de Fibonacci: ");
        int num = scan.nextInt();

        if(verificaFibonacci(num)) {
            System.out.println("O numero "+ num + " faz parte da sequencia de fibonacci");
        } else {
            System.out.println("o numero não faz parte da sequencia de fibonacci");
        }
    }
    public static Boolean quadradoPerfeito(double num) {
        int raiz = (int) Math.sqrt(num);
        return raiz * raiz == num;

    } 
    public static Boolean verificaFibonacci(double num) {

        return quadradoPerfeito(5 * num * num - 4 );

    }
}
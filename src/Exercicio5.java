import java.util.Scanner;

public class Exercicio5 {
    

    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);

        System.out.println("digite uma palavra para inverter. ");
        String palavra = scan.nextLine();


        char[] vetorCaracter = new char[palavra.length()];
        char temp;
        String palavraInvertida;
        int x, j;
        x = 0;
        j = palavra.length() - 1;

        for(int i = 0; i<palavra.length(); i++) {
            vetorCaracter[i] = palavra.charAt(i);
        }   

        while(x < j){
            temp = vetorCaracter[x];
            vetorCaracter[x] = vetorCaracter[j];
            vetorCaracter[j] = temp;
            x++;
            j--;
        }

        palavra="";
        for(char caracter : vetorCaracter){
            palavra += caracter;
        }

        System.out.println("palavra invertida: "+ palavra);
    }
}

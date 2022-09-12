package exerciciosString;



import java.util.Scanner;

public class Atividade07 {



	   public static void main(String[] args) {

		   Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = teclado.next();
        String[] palavras = palavra.split(" ");
        int contador = 0;
        for (int i = 1; i <= palavra.length(); i++) {
            System.out.print("\n");
            System.out.print(palavra.substring(0,i));
            }
        for (int i = palavra.length()-1; i > 0;i--) {
            System.out.print("\n");
            System.out.print(palavra.substring(0,i));
            }



   }







//palavriado = palavra.substring(i, i+1);
//System.out.print(palavriado.substring(i, i+1));
//String palavriado;
//  

}

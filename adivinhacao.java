import java.util.Scanner;
import java.util.Random;

public class adivinhacao {
    public static void main(String[] args) {

        int tentativas = 5;

        String generoTexto = """
                Bem vindo(a) ao "Adivinhe o número".
                Um número de 0 a 100 será sorteado.
                Você tem 5 chances para acertar.
                Boa sorte! 
                """;
        System.out.println(generoTexto);

        Random rand = new Random();
        int upperbound = 101;
        int int_random = rand.nextInt(upperbound);
        System.out.println(int_random);

        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Tente adivinhar o número: ");
        int numero = lerTeclado.nextInt();
        lerTeclado.close();
    }
    
}
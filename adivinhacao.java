import java.util.Scanner;
import java.util.Random;

public class adivinhacao {
    public static void main(String[] args) {

        int tentativas = 5;

        String generoTexto = """
                Bem vindo(a) ao "Adivinhe o número".
                Um número de 0 a 100 será sorteado.
                Você tem 5 chances para acertar.
                Boa sorte!""";
        System.out.println(generoTexto);

        Random rand = new Random();
        int upperbound = 101;
        int numeroSorteado = rand.nextInt(upperbound);
        //System.out.println(numeroSorteado);

        Scanner lerTeclado = new Scanner(System.in);
        int tentativaAtual = 0;
        boolean acertou = false;

        while (tentativaAtual < tentativas) {
            System.out.println("Tente adivinhar o número: ");
            int numero = lerTeclado.nextInt();
            tentativaAtual++;

            if (numero == numeroSorteado) {
                acertou = true;
                break;
            } else if (numero < numeroSorteado) {
                System.out.println("O número escolhido é maior.");
            } else {
                System.out.println("O número escolhido é menor.");
            }

            int tentativasRestantes = tentativas - tentativaAtual;
            System.out.println("Você tem mais " + tentativasRestantes + " tentativa(s) restante(s).");
        }

        if (acertou) {
            if (tentativaAtual == 1) {
                System.out.println("Parabéns! Você adivinhou o número corretamente em 1 tentativa.");
            } else {
                String plural = tentativaAtual > 1 ? "tentativas" : "tentativa";
                System.out.println("Parabéns! Você adivinhou o número corretamente em " + tentativaAtual + " " + plural + ".");
            }
        } else {
            System.out.println("Você esgotou todas as tentativas. O número correto era: " + numeroSorteado);
        }

        lerTeclado.close();
    }
}
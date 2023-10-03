import java.util.Random;
import java.util.Scanner;

public class DesafioJogoAdivinhacao     {

    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);

        Scanner leitura = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite seu chute: ");
            int chute = leitura.nextInt();

            if (chute == numeroAleatorio){
                System.out.println("Parabéns! Você acertou o número aleatório.");
                break;
            } else if (chute != numeroAleatorio) {
                System.out.println("Não foi dessa vez... Tente novamente");
            }
        }

    }
}

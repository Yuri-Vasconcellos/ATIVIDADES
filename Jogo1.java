import java.util.Scanner;

public class Jogo1 {
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de pontos do Jogador 1 na fase 1. ");
        Double pontos = entrada.nextDouble();

        if (pontos >= 1000){
            System.out.println("Parabéns! Voçê passou para fase 2.");
        }
        System.out.println("Siga para a proxima etapa. ");
        entrada.close();
    }
}
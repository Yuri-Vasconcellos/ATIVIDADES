
import java.util.Scanner;

public class desafio {

    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {

            System.out.print("Qual sua nacionalidade? ");
            String nacionalidade = ent.nextLine();

            System.out.print("Qual sua idade? ");
            int idade = ent.nextInt();

            System.out.print("Possui título de eleitor? (sim/não) ");
            String titulo = ent.next();

            boolean brasileiro = nacionalidade.equalsIgnoreCase("brasileira") || nacionalidade.equalsIgnoreCase("brasileiro");
            boolean temTitulo = titulo.equalsIgnoreCase("sim");

            if (brasileiro && temTitulo) {
                if (idade >= 18 && idade < 70) {
                    System.out.println("Você precisa votar.");
                } else if (idade >= 16 && idade < 18) {
                    System.out.println("Você pode votar com voto facultativo.");
                } else if (idade >= 70) {
                    System.out.println("Você não é obrigado a votar com voto facultativo.");
                } else {
                    System.out.println("Você é menor de 16 anos, não é permitido votar!.");
                }
            } else {
                System.out.println("Você não está apto para votar.");
            }
        }
    }
}
// Yuri Vasconcellos
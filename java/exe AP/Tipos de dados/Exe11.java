
import java.util.Scanner;

public class Exe11 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite o ano em que você nasceu: ");
        int anoNascimento = ent.nextInt();
        System.out.print("Digite o ano em que estamos: ");
        int ano = ent.nextInt();

        System.out.println("Você tem " + (ano - anoNascimento) + " anos");
        System.out.println("Em 2030 você terá " + (2030 - anoNascimento));
        ent.close();
    }
}
// Yuri Gabriel da Silva Vasconcellos
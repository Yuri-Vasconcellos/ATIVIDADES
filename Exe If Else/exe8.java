
import java.util.Scanner;

public class exe8 {

    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
                System.out.print("Insira a senha do usuário: ");
                String senha = ent.nextLine();

                if (senha.equals("R10p5")) {
                    System.out.println("Acesso concedido");
                } else {
                    System.out.println("Acesso negado");
                }
            }
        }
    }
    // Yuri Vasconcellos
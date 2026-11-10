import java.util.Scanner;
public class exe7 {
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro por favor, para calcular o fatorial: ");
            int numero = ent.nextInt();
            int fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
      
    }
    private static int calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }
}

// Yuri Vasconcellos
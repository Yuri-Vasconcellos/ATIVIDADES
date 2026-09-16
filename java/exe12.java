import java.util.Scanner;

public class exe12 {
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            System.out.print("Digite o salário do funcionário: ");
            double salario = ent.nextDouble();
            if (salario <= 600) {
                System.out.println("Insento do inss");
            }
            else if (salario <= 1200) {
                double desconto = salario * 0.2;
                System.out.println("Desconto do inss: " + desconto);
            } else if (salario <= 2000) {
                double desconto = salario * 0.25;
                System.out.println("Desconto do inss: " + desconto);
            } else {
                double desconto = salario * 0.3;
                System.out.println("Desconto do inss: " + desconto);
            }
        }
    }
}
// Yuri Vasconcellos
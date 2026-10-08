import java.util.Scanner;

public class exe3{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
            System.out.println("Digite o numero maximo: ");
            int maximo = ent.nextInt();
            for (int i = 1; i<=maximo; i++ ) {
                System.out.print(i+(i !=maximo? "; " : "."));
            }
        }
    }
// Yuri Vasconcellos
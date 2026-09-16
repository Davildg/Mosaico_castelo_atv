import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();


        System.out.println("--- DIMENSAO " + n + " x " + n + " ---");

        for (int linha = 0; linha < n; linha++) {
            for (int coluna = 0; coluna < n; coluna++) {


                if ((linha == 0 && coluna == 0) ||
                        (linha == 0 && coluna == n - 1) ||
                        (linha == n - 1 && coluna == 0) ||
                        (linha == n - 1 && coluna == n - 1)) {

                    System.out.print("+");


                } else if (linha == 0 || linha == n - 1 || coluna == 0 || coluna == n - 1) {

                    System.out.print("#");


                } else {

                    System.out.print(".");
                }
            }

            System.out.println();
        }

        entrada.close();
    }
}
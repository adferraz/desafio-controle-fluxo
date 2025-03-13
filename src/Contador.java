import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parametroUm, parametroDois, contador;

        System.out.print("Digite o primeiro parâmetro: ");
        parametroUm = scanner.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        parametroDois = scanner.nextInt();

        scanner.close();


            if (parametroUm >= parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

          contador = parametroDois - parametroUm;

            for (int cont = 1; cont <= contador; cont++) {
                System.out.println("Imprimindo o número " + cont);
            }
        }

    }

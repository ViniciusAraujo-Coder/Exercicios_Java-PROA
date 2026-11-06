import java.util.Scanner;

// 8 - Enquanto isso
public class EnquantoIsso {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o 1º valor: ");
        double primeiro = ler.nextDouble();

        System.out.print("Digite o 2º valor: ");
        double segundo = ler.nextDouble();

        // O segundo valor não pode ser zero nem negativo
        while (segundo <= 0) {
            System.out.print("Valor inválido! Digite um valor maior que zero: ");
            segundo = ler.nextDouble();
        }

        double resultado = primeiro / segundo;

        System.out.println("Resultado da divisão: " + resultado);

    }
}

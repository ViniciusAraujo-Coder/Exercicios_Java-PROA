import java.util.Scanner;

// 7.1 - 5 vezes? Soma dos 2 maiores entre 5 valores
public class QualOQue5Vezes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o 1º valor: ");
        double v1 = ler.nextDouble();
        System.out.print("Digite o 2º valor: ");
        double v2 = ler.nextDouble();
        System.out.print("Digite o 3º valor: ");
        double v3 = ler.nextDouble();
        System.out.print("Digite o 4º valor: ");
        double v4 = ler.nextDouble();
        System.out.print("Digite o 5º valor: ");
        double v5 = ler.nextDouble();

        // Começa com os dois primeiros, já ordenados
        double maior, segundo;
        if (v1 > v2) {
            maior = v1;
            segundo = v2;
        } else {
            maior = v2;
            segundo = v1;
        }

        // Compara cada valor restante
        if (v3 > maior) {
            segundo = maior;
            maior = v3;
        } else if (v3 > segundo) {
            segundo = v3;
        }

        if (v4 > maior) {
            segundo = maior;
            maior = v4;
        } else if (v4 > segundo) {
            segundo = v4;
        }

        if (v5 > maior) {
            segundo = maior;
            maior = v5;
        } else if (v5 > segundo) {
            segundo = v5;
        }

        double soma = maior + segundo;

        System.out.println("A soma dos 2 maiores é: " + soma);

    }
}

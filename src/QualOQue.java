import java.util.Scanner;

// 7 - Qual o quê? Soma dos 2 maiores entre 3 valores
public class QualOQue {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o 1º valor: ");
        double a = ler.nextDouble();
        System.out.print("Digite o 2º valor: ");
        double b = ler.nextDouble();
        System.out.print("Digite o 3º valor: ");
        double c = ler.nextDouble();

        double menor = a;
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }

        double soma = a + b + c - menor;

        System.out.println("A soma dos 2 maiores é: " + soma);

    }
}

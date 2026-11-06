import java.util.Scanner;

// 6 - Qual o maior?
public class QualOMaior {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o 1º valor: ");
        double a = ler.nextDouble();
        System.out.print("Digite o 2º valor: ");
        double b = ler.nextDouble();
        System.out.print("Digite o 3º valor: ");
        double c = ler.nextDouble();

        double maior = a;
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }

        System.out.println("O maior valor é: " + maior);

    }
}

/// 6.1 - Qual o maior? (4 vezes pior)
/// Faça um programa para ler 4 valores (considere que não serão informados valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class QualOMaior2 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        double num1;
        double num2;
        double num3;
        double num4;

        System.out.print("Digite um primeiro valor: ");
        num1 = ler.nextInt();

        System.out.print("Digite um segundo valor: ");
        num2 = ler.nextInt();

        System.out.print("Digite um terceiro valor: ");
        num3 = ler.nextInt();

        System.out.print("Digite um quarto valor: ");
        num4 = ler.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4) {
            System.out.println("O valor maior é " + num1);
        }
        else if (num2 > num1 && num2 > num3 && num2 > num4) {
            System.out.println("O valor maior é " + num2);
        }
        else if (num3 > num1 && num3 > num2 && num3 > num4) {
            System.out.println("O valor maior é " + num3);
        }
        else if (num4 > num1 && num4 > num2 && num4 > num3) {
            System.out.println("O valor maior é " + num4);
        }
        else {
            System.out.println("Possuimos valores iguais em algum dos 4 valores.");
        }

    }
}

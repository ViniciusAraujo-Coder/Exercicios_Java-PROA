import java.util.Scanner;

/// 9 -  Cansar de Digitar
/// Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados
///  e escreva a média aritmética desses valores lidos.

public class CanseiDeDigitar {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double numero;
        double soma = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("\nDigite um número: ");
            numero = ler.nextInt();

            System.out.println("Número digitado: " + numero);

            soma += numero;
        }

        double media = soma / 10;

        System.out.println("A média aritmética dos valores é: " + media);

    }
}

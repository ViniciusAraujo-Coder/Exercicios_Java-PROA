/// 10 - Parabéns
/// Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever
/// a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado
///  (considere 6.0 a média mínima para aprovação e 4 notas informadas).

import java.util.Scanner;

public class Parabens {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double nota1, nota2, nota3, nota4;

        System.out.print("Digite a primeira nota: ");
        nota1 = ler.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = ler.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = ler.nextDouble();

        System.out.print("Digite a quarta nota: ");
        nota4 = ler.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("\nSua nota foi: " + media);

        if (media >= 6){
            System.out.println("PARABÉNS!!! Você foi aprovado(a)!");
        }
        else{
            System.out.println("Você foi reprovado(a)!");
        }


    }
}

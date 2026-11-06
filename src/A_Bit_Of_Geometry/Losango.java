package A_Bit_Of_Geometry;

import java.util.Scanner;

// Área do losango: A = (diagonal maior x diagonal menor) / 2
public class Losango {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a diagonal maior: ");
        double diagonalMaior = ler.nextDouble();

        System.out.print("Digite a diagonal menor: ");
        double diagonalMenor = ler.nextDouble();

        double area = (diagonalMaior * diagonalMenor) / 2;

        System.out.println("A área do losango é: " + area);

    }
}

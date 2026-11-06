package A_Bit_Of_Geometry;

import java.util.Scanner;

// Área do trapézio: A = ((base maior + base menor) x altura) / 2
public class Trapezio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a base maior: ");
        double baseMaior = ler.nextDouble();

        System.out.print("Digite a base menor: ");
        double baseMenor = ler.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = ler.nextDouble();

        double area = ((baseMaior + baseMenor) * altura) / 2;

        System.out.println("A área do trapézio é: " + area);

    }
}

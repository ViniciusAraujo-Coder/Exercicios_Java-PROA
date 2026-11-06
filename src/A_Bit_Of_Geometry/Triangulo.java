package A_Bit_Of_Geometry;

import java.util.Scanner;

// Área do triângulo: A = (base x altura) / 2
public class Triangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = ler.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = ler.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);

    }
}

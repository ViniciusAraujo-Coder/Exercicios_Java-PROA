package A_Bit_Of_Geometry;

import java.util.Scanner;

// Área do paralelogramo: A = base x altura
public class Paralelogramo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = ler.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = ler.nextDouble();

        double area = base * altura;

        System.out.println("A área do paralelogramo é: " + area);

    }
}

package A_Bit_Of_Geometry;

import java.util.Scanner;

// Área do círculo: A = π x raio²
public class Circulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        double raio = ler.nextDouble();

        double area = Math.PI * raio * raio;

        System.out.println("A área do círculo é: " + area);

    }
}

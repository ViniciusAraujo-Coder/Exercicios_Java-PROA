package A_Bit_Of_Geometry;

import java.util.Scanner;

// Área do quadrado: A = lado x lado
public class Quadrado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o lado: ");
        double lado = ler.nextDouble();

        double area = lado * lado;

        System.out.println("A área do quadrado é: " + area);


    }
}

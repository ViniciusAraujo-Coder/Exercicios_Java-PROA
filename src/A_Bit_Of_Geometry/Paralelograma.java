package A_Bit_Of_Geometry;

import java.util.Scanner;

public class Paralelograma {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.print("Digite base: ");
        base = ler.nextDouble();

        System.out.print("Digite altura: ");
        altura = ler.nextDouble();

        area = base * altura;

        System.out.println("A área do paralelograma é: " + area);

    }
}

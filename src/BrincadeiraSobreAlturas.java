/// 15 - Uma Brincadeira Sobre Alturas
/// Anacleto tem 1,50 metro e cresce 2 centímetros por ano, enquanto Felisberto tem 1,1O metro e cresce 3
/// centímetros por ano.
///
/// Construa um programa que calcule e imprima quantos anos serão necessários para que Felisberto seja maior
/// que Anacleto.

public class BrincadeiraSobreAlturas {
    public static void main(String[] args){

        double anacletoAltura = 1.5;
        double felisbertoAltura = 1.10;
        int ano = 0;

        while(anacletoAltura > felisbertoAltura){

            anacletoAltura += 0.02;
            felisbertoAltura += 0.03;
            ano++;

        }

        System.out.printf("\nSerá necessário %d anos para Felisberto passar Anacleto\n", ano);
        System.out.printf("\nFELISBERTO TERÁ: %.2fm", felisbertoAltura);
        System.out.printf("\nANACLETO TERÁ: %.2fm", anacletoAltura);

    }
}

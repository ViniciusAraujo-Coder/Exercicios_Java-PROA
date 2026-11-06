/// 11 - BOOOOMMM
/// Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0.
/// Escreva a contagem em tela e no final da repetição escreva "EXPLOSÃO".

import java.util.Scanner;

public class boooommm {
    public static void main(String[] args) throws InterruptedException {

        Scanner ler = new Scanner(System.in);

        for (int i = 10; i >= 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("BOOMMMMMMMM");

    }
}

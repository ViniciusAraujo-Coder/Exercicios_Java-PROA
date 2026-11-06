/// 3 - A Bit of Information
/// Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

import java.util.Scanner;

public class A_Bit_of_Information {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        String nome;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();

        System.out.print("Digite sua idade: ");
        idade = ler.nextInt();

        System.out.println( "Olá, " + nome + ", sua idade é " + idade);
    }
}

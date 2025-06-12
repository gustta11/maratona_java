package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

import java.util.Scanner;

public class JogadorTest03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome do jogador que deseja adicionar:");
        String nomeJogador = entrada.nextLine();

        Jogador jogador01 = new Jogador(nomeJogador);
        Jogador[] jogadors = {jogador01};

        System.out.println("Informe o nome do time que quer adicionar esse jogador:");
        String nomeTime = entrada.nextLine();

        Time time1 = new Time(nomeTime, jogadors);
        time1.imprime();

    }
}

package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Arrascaeta");
        Jogador[] jogadors = {jogador01,jogador02};
        Time time = new Time("Bahia");
        Time time1 = new Time("Santos", jogadors);
        time.setJogadores(jogadors);
        time.imprime();
        time1.imprime();

    }
}

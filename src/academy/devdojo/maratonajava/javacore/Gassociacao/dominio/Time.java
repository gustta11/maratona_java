package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome){
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogador){
        this.nome=nome;
        this.jogadores = jogador;
    }

    public void imprime(){
        if(jogadores == null)return;
        for(Jogador jogador:jogadores){
            System.out.println(jogador.getNome()+ " do " + this.nome);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}

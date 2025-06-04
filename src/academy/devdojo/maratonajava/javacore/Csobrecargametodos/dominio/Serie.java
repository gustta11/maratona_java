package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Serie {
    private String nome;
    private int temporadas;
    private String genero;
    private int classificacao;
    private String plataforma;


    public void init(String nome, int temporadas, String genero){
        this.nome = nome;
        this.temporadas = temporadas;
        this.genero = genero;
    }

    public void init(String nome, int temporadas, String genero, int classificacao){
        this.init(nome,temporadas,genero);
        this.classificacao = classificacao;
    }

    public void init (String nome, int temporadas, String genero, int classificacao, String plataforma){
        this.init(nome,temporadas,genero,classificacao);
        this.plataforma = plataforma;

    }

    public void setTipo(String nome){
        this.nome = nome;
    }

    public String getTipo(){
        return nome;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public int getTemporadas(){
        return temporadas;
    }

    public void setGenero(String genero ){
        this.genero = genero;
    }

    public String genero(){
        return genero;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}

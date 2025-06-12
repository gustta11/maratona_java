package academy.devdojo.maratonajava.javacore.Hexercicioassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String especialidade, String nome) {
        this.especialidade = especialidade;
        this.nome = nome;
    }

    public Professor(String especialidade, String nome, Seminario[] seminarios){
        this.especialidade = especialidade;
        this.nome = nome;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("*********");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if(seminarios == null) return;
        System.out.println("*** Seminários Cadastrados ***");
        for(Seminario seminars:seminarios){
            System.out.println("Titulo: "+seminars.getTitulo());
            System.out.println("Local: "+ seminars.getLocal().getLocal());
            if(seminars.getAlunos() == null || seminars.getAlunos().length == 0) continue;
            System.out.println("** ALunos **");
            for(Aluno aluns: seminars.getAlunos()){
                System.out.println(aluns.getNome());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}

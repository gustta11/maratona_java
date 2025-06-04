package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {

    public static void main(String[] args) {
        double salario = 5000;
        String mensagemDoar = "Vou doar 500";
        String mensagemNaoDoar = "Não tenho condições";

        String mensagemFinal = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(mensagemFinal);
    }
}

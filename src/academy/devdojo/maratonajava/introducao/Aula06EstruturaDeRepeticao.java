package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao {

    // Ver em quantas parcelas pode dividir o carro
    // parcelas =>1000

    public static void main(String[] args) {
        double valorTotal = 20000;
        double valorParcela;

        for(int parcela = 1 ; parcela <= valorTotal; parcela++){
            valorParcela = valorTotal/parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela " + parcela +" valor " + valorParcela );
        }
    }
}

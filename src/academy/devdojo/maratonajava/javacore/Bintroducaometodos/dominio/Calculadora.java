package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {


    public void somaDoisNumeros(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        return num1 / num2;
    }

    public void arraySoma(int[] numeros){
        int soma = 0;
        for(int aux:numeros){
            soma+=aux;
        }
        System.out.println(soma);
    }

    public void varArgs(int... numeros){
        int soma = 0;
        for(int aux:numeros){
            soma+=aux;
        }
        System.out.println(soma);
    }
}

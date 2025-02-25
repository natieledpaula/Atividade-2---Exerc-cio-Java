// 1)Crie um programa e declare nele 3 variáveis numéricas int, inicializando-as com algum valor e obtenha a soma dessas variáveis e a média delas, imprimindo esses resultados na tela.

public class exerc1 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int soma = num1 + num2 + num3;
        int media = soma / 3;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
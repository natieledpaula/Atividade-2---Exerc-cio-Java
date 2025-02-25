// 3) Crie um programa que elabore o orçamento de uma construtora para o cálculo do valor total de construção de uma piscina. O valor total será dado pela cubagem da piscina (metros cúbicos) multiplicada por R$100,00, que é o preço do metro cúbico construído de piscina. Faça a simulação dos cálculos no programa para ver se está tudo funcionando corretamente.

public class exerc3 {
    public static void main(String[] args) {
        int largura = 10;
        int altura = 20;
        int profundidade = 30;
        int volume = largura * altura * profundidade;
        double preco = volume * 100.0;

        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Profundidade: " + profundidade);
        System.out.println("Volume: " + volume);
        System.out.println("Preço: " + preco);
    }
}
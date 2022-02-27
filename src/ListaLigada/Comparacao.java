package ListaLigada;

import java.util.ArrayList;

public class Comparacao {
    public static void main(String[] args) {
        // comparação de tempo de execução entre listas e vetores
        ListaLigada<Integer> lista = new ListaLigada<Integer>();

        ArrayList<Integer> vetor = new ArrayList<>();

        // adicionar elementos

        // vetor
        int limite = 1000;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;
        for (int i = 0; i < limite; i++) {
            vetor.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou " + limite + " elementos no vetor");
        System.out.println(tempoFinal - tempoInicial);

        // Lista
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < limite; i++) {
            lista.adicionar(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nAdicionou " + limite + " elementos na lista");
        System.out.println(tempoFinal - tempoInicial);

        // ler valores do vetor
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < vetor.size(); i++) {
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\ntempo de leitura do vetor");
        System.out.println(tempoFinal - tempoInicial);

        // ler valores da lista
        tempoInicial = System.currentTimeMillis();
        IteratorListaLigada<Integer> iterator = lista.getIterator();
        while (iterator.temProximo()) {
            iterator.getProximo();
        }
        for (int i = 0; i < lista.getTamanho(); i++) {
            lista.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\ntempo de leitura da lista");
        System.out.println(tempoFinal - tempoInicial);

    }
}
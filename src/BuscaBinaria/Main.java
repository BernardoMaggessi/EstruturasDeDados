package BuscaBinaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
            System.out.println(vetor[i]);
        }
        System.out.println("Qual número vc busca?");
        Scanner leitor = new Scanner(System.in);
        int buscado = leitor.nextInt();

        int contador = 0;
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length;
        int meio;
        while (inicio <= fim) {
            meio = (int) ((inicio + fim) / 2);
            contador++;// contador de testes
            if (vetor[meio] == buscado) {
                achou = true;
                break;
            } else if (vetor[meio] < buscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        System.out.println("contador: " + contador);
        if (achou == true) {
            System.out.println("achou");
        } else {
            System.out.println("não achou");
        }
        leitor.close();
    }
}
package BuscaLinear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int [] vetor = new int[100];
        //Complexidade O(log n); umas da melhores formas de execução de algoritmo, executa menos passos do que a busca linear
        //sorteia um número aleátoria até 100.000
        for(int i=0; i<vetor.length; i++){
                vetor[i] =(int) (Math.random() * 100000);
                System.out.println(vetor[i]);
        }
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual número vc busca?");
        int N = leitor.nextInt();
        
        int contador = 0;
        boolean achou = false;
        for(int i = 0; i<vetor.length;i++){
           contador++;
            if(vetor[i] == N){
                System.out.println("achou");
                achou = true;
                break;
            }
        }
        if(achou){
            System.out.println("Achou");
        }else{
            System.out.println("Não achou");
        }
        System.out.println("contador"+contador);
       
        leitor.close();
    }
}

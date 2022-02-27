package árvoresBinaria;

import java.security.SecureRandom;

public class Main {
    public static void main(String[] args){
    Tree<Integer> tree = new Tree<Integer>();
    SecureRandom randomNumber = new SecureRandom();

    System.out.println("Inserting the following values: ");

    //insere 10 inteiros aleatórios de 0 a 99 na árvore
    for(int i =0;i<= 10;i++){
        int value = randomNumber.nextInt();
        System.out.printf("%d ", value);
        tree.insertNode(value);

    }
    System.out.printf("%n%nPreorder traversla%n");
    tree.preorderTransversal();

    System.out.println("%n%nInorder Transversal%n");
    tree.inorderTransversal();
    
    System.out.println("%n%nPostorder trasversal%n");
    tree.postorderTransversal();
    System.out.println();   
    }
}
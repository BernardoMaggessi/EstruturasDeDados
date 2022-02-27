package árvoresBinaria;

public class Tree <T extends Comparable<T>>{
    private TreeNode<T> root;

    public Tree(){
        root = null;
    }
    public void insertNode(T insertValue){
        if(root == null)
            root = new TreeNode<T>(insertValue);
        else
            root.insert(insertValue);
    }//inicia o recurso na pré ordem
    public void preorderTransversal(){
        preorderHelper(root);
    }
    //método recursivo para realizar percurso na pré ordem
    public void preorderHelper(TreeNode<T> node){
        if(node == null)
            return;
        System.out.printf("%s ", node.data);//gera saida de dados do nó
        preorderHelper(node.leftnode);//percorre subarvore esquerda
        preorderHelper(node.rightNode);//percorre subarvore direita
    }
    public void inorderTransversal(){
        inorderHelper(root);
    }
    public void inorderHelper(TreeNode<T> node){
        if(node == null)
            return;
        inorderHelper(node.leftnode); // percorre subárvore esquerda
        System.out.printf("%s ", node.data); // gera saída de dados do nó
        inorderHelper(node.rightNode); // percorre subárvore direita
    }
    public void postorderTransversal(){
        postorderHelper(root);
    }
    public void postorderHelper(TreeNode<T> node){
        if(node == null)
            return;
        postorderHelper(node.leftnode);
        postorderHelper(node.rightNode);
        System.out.printf("%s ", node.data); // gera saída de dados do nó

    }
}

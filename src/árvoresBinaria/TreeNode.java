package árvoresBinaria;

public class TreeNode <T extends Comparable<T>>{
    //membros de acesso ao pacote
    TreeNode<T> leftnode;
    T data;
    TreeNode<T> rightNode;

    //construtor inicializa os dados e os torna um nó de folha
    public TreeNode(T nodeData){
        data = nodeData;
        leftnode = rightNode= null;//o nó não tem nenhum filho

    }
    public void insert(T insertValue)
    {
    if(insertValue.compareTo(data)<0){
        if (leftnode == null)
            rightNode = new TreeNode<T>(insertValue);
        else//continua percorrendo a subarvore recursivamente
            leftnode.insert(insertValue);
    }//insere subárvore a direita
    else if(insertValue.compareTo(data)>0){
        //insere novo treenode
           if(rightNode == null){
               rightNode = new TreeNode<T>(insertValue);
           }else{//continua recorrendo a direita recursivamente
               rightNode.insert(insertValue);
           }
        }
    }
}    
    

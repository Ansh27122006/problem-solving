package advanced.dsa.tree;

import java.util.ArrayDeque;
import java.util.Queue;

class BST{
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    Node root;
    void insert(int data) {
        if(root==null){
            root=new Node(data);
            return;
        }
        insert(root,data);
    }
    Node insert(Node root, int data){
        if(root==null){
            return new Node(data);
        }
        if(root.data>data){
            root.left=insert(root.left,data);
        }else{
            root.right=insert(root.right,data);
        }
        return root;
    }
    void delete(int data){
        if(root==null) return;
        root=delete(root,data);
    }
    Node delete(Node root, int data){
        if(root==null) return root;
        if(root.data>data){
            root.left=delete(root.left,data);
        }else if(root.data<data){
            root.right=delete(root.right,data);
        }else{
            if(root.left==null){
                return root.right;
            }
            if(root.right==null) {
                return root.left;
            }
            Node suc=inOrderSuccesor(root.right);
            root.data=suc.data;
            root.right=delete(root.right,suc.data);
        }
        return root;
    }
    Node inOrderSuccesor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    void preOrderTraversal(){
        preOrderTraversal(root);
    }
    void preOrderTraversal(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    void inOrderTraversal(){
        inOrderTraversal(root);
    }
    void inOrderTraversal(Node root){
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
    void postOrderTraversal(){
        postOrderTraversal(root);
    }
    void postOrderTraversal(Node root){
        if(root==null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }
    void levelOrderTraversal(){
        if(root==null){
            return;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.print(current.data+" ");
            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }
        }
        System.out.println();
    }
}
public class BSTMain {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(1);
        tree.insert(7);
        tree.insert(8);
        tree.insert(2);
        tree.insert(6);
        tree.insert(9);
        tree.inOrderTraversal();
        System.out.println();
        tree.postOrderTraversal();
        System.out.println();
        tree.preOrderTraversal();
        System.out.println();
        tree.levelOrderTraversal();
        tree.delete(7 );
        tree.inOrderTraversal();
    }

}
package advanced.dsa.tree;


// LL Rotataion - unbalanced node left side rotates in clockwise direction
// RR Rotataion - unbalanced node right side rotates in anti-clockwise direction
// RL Rotataion - RR rotation + LL rotation
// LR Rotataion - LL rotation + RR rotation
class AVLTree{
    class Node{
        int data;
        Node left;
        Node right;
        int height;

        Node(int data){
            this.data=data;
            this.height=1;
        }
    }

    Node root;

    int height(Node node){
        if(node==null) return 0;
        return node.height;
    }

    int getBalance(Node root){
        if(root==null) return 0;
        return height(root.left)-height(root.right);
    }

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
        root.height=Math.max(height(root.left),height(root.right))+1;

        int balance = getBalance(root);

        //LL
        if(balance>1 && root.left.data>data){
            return rotateRight(root);
        }

        //LR
        if(balance>1 && root.left.data<data){
            root.left=rotateLeft(root.left);
            return rotateRight(root);
        }
        //RR
        if(balance<1 && root.right.data<data){
            return rotateLeft(root);
        }

        //RL
        if(balance<1 && root.left.data>data){
            root.right=rotateRight(root.right);
            return rotateLeft(root);
        }
        return root;
    }
    Node rotateLeft(Node y){
        Node x=y.right;
        Node t2=x.left;
        y.left = x;
        x.right = t2;
        x.height = Math.max(height(x.left),height(x.right)) + 1;
        y.height = Math.max(height(y.left),height(y.right)) + 1;
        return y;
    }
    Node rotateRight(Node y){
        Node x=y.left;
        Node t2=x.right;
        x.right=y;
        y.left=t2;
        y.height = Math.max(height(y.left),height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
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

}
public class AVLTreeMain {
    public static void main(String[] args) {

    }
}

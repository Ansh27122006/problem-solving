package advanced.dsa.tree;

import java.util.*;

class BinaryTree{
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;
    int max=Integer.MIN_VALUE;
    int secondMax=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    int secondMin=Integer.MAX_VALUE;

    void insert(int data){
        Node newNode= new Node(data);
        if(root==null){
            root=newNode;
            return;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            if(current.left==null){
                current.left=newNode;
                return;
            }else if(current.right==null){
                current.right=newNode;
                return;
            }
            queue.add(current.left);
            queue.add(current.right);
        }
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

    int max(){
        return max(root);
    }
    int max(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int max1=max(root.left);
        int max2=max(root.right);
        return Math.max(Math.max(max1,max2),root.data);
    }

    int min(){
        return min(root);
    }
    int min(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int min1=min(root.left);
        int min2=min(root.right);
        return Math.min(Math.min(min1,min2),root.data);
    }
    int secondMax(){
        secondMax(root);
        return secondMax;
    }
    void secondMax(Node root){
        if(root ==null) return;
        if(root.data>max){
            secondMax=max;
            max=root.data;
        }
        if(root.data>secondMax && root.data!=max){
            secondMax=root.data;
        }
        secondMax(root.left);
        secondMax(root.right);
    }
    int secondMin(){
        secondMin(root);
        return secondMin;
    }
    void secondMin(Node root){
        if(root ==null) return;
        if(root.data<min){
            secondMin=min;
            min=root.data;
        }
        if(root.data<secondMin && root.data!=min){
            secondMin=root.data;
        }
        secondMin(root.left);
        secondMin(root.right);
    }
    int sum(){
        return sum(root);
    }
    int sum(Node root){
        if(root == null) return 0;
        return root.data+sum(root.left)+sum(root.right);
    }
    int height(){ //assume height of leaf node as 0
        return height(root);
    }
    int height(Node root){
        if(root ==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    boolean find(int ele){
        return find(root,ele);
    }
    boolean find(Node root, int ele){
        if(root == null){
            return false;
        }
        return root.data==ele || find(root.left,ele) || find(root.right,ele);
    }
    int product(){
        return product(root);
    }
    int product(Node root){
        if(root==null){
            return 1;
        }
        return root.data * product(root.left) * product(root.right);
    }
    void invert(){
        invert(root);
    }
    void invert(Node root){
        if(root==null) return;
        if(root.left!=null && root.right!=null){
            int temp=root.left.data;
            root.left.data=root.right.data;
            root.right.data=temp;
        }
        invert(root.left);
        invert(root.right);
    }
    void leftView(){
        Queue<Node> queue = new ArrayDeque<>();
        if(root==null) return ;
        queue.add(root);
        while(!queue.isEmpty()){
            int n= queue.size();
            for(int i=0;i<n;i++){
                Node first = queue.poll();
                if(i==0){
                    System.out.print(first.data+" ");
                }
                if(first.left!=null){
                    queue.add(first.left);
                }
                if(first.right!=null){
                    queue.add(first.right);
                }
            }
        }
        System.out.println();
    }
    void rightView(){
        Queue<Node> queue = new ArrayDeque<>();
        if(root==null) return ;
        queue.add(root);
        while(!queue.isEmpty()){
            int n= queue.size();
            for(int i=0;i<n;i++){
                Node first = queue.poll();
                if(i==0){
                    System.out.print(first.data+" ");
                }
                if(first.right!=null){
                    queue.add(first.right);
                }
                if(first.left!=null){
                    queue.add(first.left);
                }
            }
        }
        System.out.println();
    }
    void topView() {
        if(root==null) return;
        class Pair{
            Node node;
            int hd;//horizontal distance
            Pair(Node node, int hd){
                this.node=node;
                this.hd=hd;
            }
        }
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(root,0));
        Map<Integer,Integer> map = new TreeMap<>();
        while(!q.isEmpty()){
            Pair first = q.poll();
            if (!map.containsKey(first.hd)){
                map.put(first.hd,first.node.data);
            }
            if(first.node.left!=null){
                q.add(new Pair(first.node.left,first.hd-1));
            }
            if(first.node.right!=null){
                q.add(new Pair(first.node.right,first.hd+1));
            }
        }
        for(int i:map.values()){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    void bottomView() {
        if(root==null) return;
        class Pair{
            Node node;
            int hd;//horizontal distance
            Pair(Node node, int hd){
                this.node=node;
                this.hd=hd;
            }
        }
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(root,0));
        Map<Integer,Integer> map = new TreeMap<>();
        while(!q.isEmpty()){
            Pair first = q.poll();
            map.put(first.hd,first.node.data);
            if(first.node.left!=null){
                q.add(new Pair(first.node.left,first.hd-1));
            }
            if(first.node.right!=null){
                q.add(new Pair(first.node.right,first.hd+1));
            }
        }
        for(int i:map.values()){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    void diagonalTraversal(){
        if(root==null) return;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            Node current = q.poll();
            while(current!=null){
                System.out.print(current.data+" ");
                if(current.left!=null) q.add(current.left);
                current=current.right;
            }
        }
        System.out.println();
    }
    void zigzagTraversal() {
        Queue<Node> queue = new ArrayDeque<>();
        if (root == null) return;
        queue.add(root);
        boolean leftToRight=true;
        while (!queue.isEmpty()) {
            LinkedList<Integer> list = new LinkedList<>();
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                Node first = queue.poll();
                if(leftToRight) list.addLast(first.data);
                else list.addFirst(first.data);
                if (first.left != null) {
                    queue.add(first.left);
                }
                if (first.right != null) {
                    queue.add(first.right);
                }
            }
            for(int e:list){
                System.out.print(e+" ");
            }
            leftToRight=!leftToRight;
        }
        System.out.println();
    }
    void verticalTraversal() {
        if(root==null) return;
        class Pair{
            Node node;
            int hd;//horizontal distance
            Pair(Node node, int hd){
                this.node=node;
                this.hd=hd;
            }
        }
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(root,0));
        Map<Integer,ArrayList<Integer>> map = new TreeMap<>();
        while(!q.isEmpty()){
            Pair first = q.poll();
            if (!map.containsKey(first.hd)){
                map.put(first.hd,new ArrayList<>());
            }
            map.get(first.hd).add(first.node.data);
            if(first.node.left!=null){
                q.add(new Pair(first.node.left,first.hd-1));
            }
            if(first.node.right!=null){
                q.add(new Pair(first.node.right,first.hd+1));
            }
        }
        for(ArrayList<Integer> list:map.values()){
            for(int i:list){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
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
        System.out.println("Max of tree: "+tree.max());
        System.out.println("Min of tree: "+tree.min());
        System.out.println("Second Max of tree: "+tree.secondMax());
        System.out.println("Second Min of tree: "+tree.secondMin());
        System.out.println("Sum of tree is: "+tree.sum());
        System.out.println("Height of tree is:"+tree.height());
        System.out.println("Is 8 in tree? : "+tree.find(8));
        System.out.println("Product of tree: "+tree.product());
        tree.invert();
        tree.levelOrderTraversal();
        tree.invert();
        tree.leftView();
        tree.rightView();
        tree.topView();
        tree.bottomView();
        tree.diagonalTraversal();
        tree.zigzagTraversal();
        tree.verticalTraversal();
    }
}

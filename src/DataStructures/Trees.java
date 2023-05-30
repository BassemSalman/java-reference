package DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Trees<T extends Comparable<T>> {
    /*
     * Tree is a graph with no cycles
     * 
     * Binary Tree is a Tree where each node has 
     * 2 children by maximum
     * 
     * Binary Search Tree is a Binary Tree where
     * for all nodes, left<current<right
     * 
     * preorder on BST produces sorted list of data 
     */

    Node<T> root;
    private static class Node<T extends Comparable<T>> {
        Node<T> left, right; // could be List of children if graph
        T data;
        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }



    private void addRightChild(Node<T> node, T data){
        Node<T> n = node.right;
        Node<T> newNode = new Node<>(data);
        newNode.right = n;
        node.right = newNode;
    }

    private void inorder(Node<T> node){
        if(node == null) return;
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }

    private void postorder(Node<T> node){
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data);
    }

    private void preorder(Node<T> node){
        if(node == null) return;
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }


    public void levelOrder() {
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);
        Node<T> node;
        while(!queue.isEmpty()){
            node = queue.remove();
            System.out.println(node.data);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
    }

    public void inorderIterative() {
        if (root == null) {
            return;
        }

        Deque<Node<T>> stack = new LinkedList<>();
        Node<T> current = root;

        while (current != null || !stack.isEmpty()) {

            // keep pushing lefts
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // pop the leftmost
            current = stack.pop();
            System.out.println(current.data);

            // try to go right once before continuing going left
            current = current.right;
        }
    }


    public void preorderIterative() {
        if (root == null) {
            return;
        }

        Deque<Node<T>> stack = new ArrayDeque<>();
        stack.push(root);
        Node<T> current = root;

        while (current != null || !stack.isEmpty()) {
            current = stack.pop();
            System.out.println(current.data);
            
            // left would be popped before right
            if (current.right != null) {
                stack.push(current.right);
            }
            if(current.left != null) {
                stack.push(current.left);
            }
        }
    }

    public void postorderIterative() {
        if (root == null) {
            return;
        }

        Deque<Node<T>> stack = new ArrayDeque<>();
        stack.push(root);
        Node<T> current = root;

        while (current != null || !stack.isEmpty()) {
            current = stack.pop();
            System.out.println(current.data);
            
            // left would be popped before right
            if (current.right != null) {
                stack.push(current.right);
            }
            if(current.left != null) {
                stack.push(current.left);
            }
        }
    }

    private void binaryInsert(Node<T> n, T data){
        if(n == null) return;

        int c = (n.data).compareTo(data);
        if(c >= 0){
            if(n.right == null) {
                n.right = new Node<>(data);
                return;
            }
            binaryInsert(n.right, data);
        }
        else if(c > 0){
            if(n.left == null) {
                n.left = new Node<>(data);
                return;
            }
            binaryInsert(n.left, data);
        }
    }

    private int numberOfLeaves(Node<T> n) {
        if(n == null) return 0;
        if(n.left == null && n.right == null) return 1;
        return numberOfLeaves(n.left) + numberOfLeaves(n.right);
    }

    private boolean isFullBinaryTree(Node<T> n) {
        if(n == null) return true;
        if(n.left == null && n.right != null) return false;
        if(n.right == null && n.left != null) return false;
        return isFullBinaryTree(n.left) && isFullBinaryTree(n.right);
    }

    private boolean treeSearch(Node<T> n, T data) {
        if(n == null) return false;
        if(n.data.equals(data)) return true;
        return treeSearch(n.left, data) || treeSearch(n.right, data);
    }

    private boolean binarySearch(Node<T> n, T data) {
        if(n == null) return false;
        int c = (n.data).compareTo(data);
        if(c == 0) return true;
        if(c > 0) return binarySearch(n.left, data);
        return binarySearch(n.right, data);
    }

    private Node<T> buildHelper(T[] inputs, int start, int end) {
        if(start > end) return null;
        int mid = (start+end)/2;
        Node<T> node = new Node<>(inputs[mid]);
        node.left = buildHelper(inputs, start, mid - 1);
        node.right = buildHelper(inputs, mid + 1, end);
        return node; // mid of main array inputs
    }
    private Trees<T> build(T[] inputs){
        Trees<T> t = new Trees<>();
        t.root = buildHelper(inputs, 0, inputs.length-1);
        return t;
    }
}

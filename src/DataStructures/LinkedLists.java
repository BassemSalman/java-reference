package DataStructures;

public class LinkedLists<T> {
    private Node<T> head;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void pushHead(T data) { // works even if empty
        Node<T> temp = head;
        head = new Node<T>(data);
        head.next = temp;
    }

    public void pushAfter(Node<T> node, T data) {
        Node<T> nextNode = node.next;
        Node<T> newNode = new Node<T>(data);
        newNode.next = nextNode;
        node.next = newNode;
    }

    public void printListRecursive(Node<T> node){
        if(node == null) return;
        System.out.println(node.data);
        printListRecursive(node.next);
    }
    public void printList(){
        printListRecursive(head);        
    }

    public void printListIterative(){
        Node<T> n = head;
        while(n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public void reverseList(Node<T> node){
        if(node == null) return; // Empty
        if(node.next == null) {
            head = node;
            return; // last node is reached
        }
        reverseList(node.next);
        node.next.next = node;
    }

}

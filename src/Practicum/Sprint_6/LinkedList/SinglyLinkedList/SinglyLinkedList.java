package Practicum.Sprint_6.LinkedList.SinglyLinkedList;

public class SinglyLinkedList<T> {
    public Node<T> head;
    private int size = 0;

}

class Node<T> {

    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

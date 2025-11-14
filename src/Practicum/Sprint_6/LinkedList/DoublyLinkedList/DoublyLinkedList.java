package Practicum.Sprint_6.LinkedList.DoublyLinkedList;//package Practicum.Sprint_6.LinkedList;

public class DoublyLinkedList<T> {
    public Node<T> head;
    public Node<T> tail;
    private int size = 0;

}

class Node <T> {
    public T data;
    public Node<T> next;
    public Node<T> prev;


    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

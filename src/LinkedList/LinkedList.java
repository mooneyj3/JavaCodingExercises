package LinkedList;

/**
 * Created by J-moneyham on 5/23/17.
 * Singly Linked List that stores integers in each node
 */
public class LinkedList {

    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void add(int number) {
        Node node = new Node(number);
        add(size, node);
    }

    public void addFirst(int number) {
        Node node = new Node(number);
        addFirst(node);
    }

    public void addFirst(Node node) {
        add(0, node);
    }

    public void add(int index, Node node) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("");
        }

        else if (index == 0) {
            Node temp = head;
            head = node;
            head.setNext(temp);
        }

        else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            Node next = current.getNext();
            current.setNext(node);
            node.setNext(next);
        }

        size++;
    }

    public String toString() {

        if (head == null)
            return "null";

        String result = new String();
        result += head.getNumber();
        Node next = head.getNext();

        while (next != null) {
            result += " -> ";
            result += next.getNumber();
            next = next.getNext();
        }

        return result;
    }

    public void displayLinkedList() {
        String result = toString();
        System.out.println(result);
    }

    public int getSize() {
        return size;
    }

}

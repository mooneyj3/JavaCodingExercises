package LinkedList;

/**
 * Created by J-moneyham on 5/23/17.
 */
public class Node {

    private int number;
    private Node next;


    public Node() {
        number = 0;
        next = null;
    }

    public Node(int number) {
        this.number = number;
        this.next = null;
    }

    public Node(int number, Node next) {
        this.number = number;
        this.next = next;
    }

    public int getNumber() {
        return number;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

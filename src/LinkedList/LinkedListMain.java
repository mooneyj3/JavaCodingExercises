package LinkedList;

/**
 * Created by J-moneyham on 5/23/17.
 */
public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList[] lists = new LinkedList[5];

        lists[0] = new LinkedList();
        lists[1] = new LinkedList();
        lists[2] = new LinkedList();

        for (int i = 10; i > 0; i--) {
            lists[0].add(i);
            lists[1].addFirst(i);
            Node lnode3 = new Node(i);
            if (lists[2].getSize() == 0) {
                lists[2].add(0,lnode3);
            }
            else if (i > 5) {
                lists[2].add(lists[2].getSize()-1, lnode3);
            }
            else {
                lists[2].add(lists[2].getSize()-i, lnode3);
            }
        }

        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                System.out.print("list" + i + " (" + lists[1].getSize() + "): ");
                lists[i].displayLinkedList();
            }
        }


    }
}

public class LinkedList {
    private Node head;

    private class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void delete(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        System.out.println("Linked List after insertion:");
        list.printList(); // Output: 1 2 3

        list.delete(2);
        System.out.println("Linked List after deletion of 2:");
        list.printList(); // Output: 1 3

        list.delete(1);
        System.out.println("Linked List after deletion of 1:");
        list.printList(); // Output: 3

        list.delete(3);
        System.out.println("Linked List after deletion of 3:");
        list.printList(); // Output: (empty)
    }
}

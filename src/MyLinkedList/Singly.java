package MyLinkedList;

public class Singly {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    public void addLast(int data) {
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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        } else {
            System.err.println("List is empty already!!");
        }
    }

    public void display() {
        if (head == null) {
            System.err.println("List is empty!!");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
            ;
            ;
        }
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void removeLast() {
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public static void main(String[] args) {
        Singly list = new Singly();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        list.display();// print 1 2 3

        list.addFirst(50);
        list.display();//print 50 1 2 3

        list.removeFirst();
        list.display();

        if (list.contains(2)) {
            System.out.println("List has 2");
        } else {
            System.out.println("List does not have 2");
        }

        System.out.println("List size: " + list.size());
    }
}





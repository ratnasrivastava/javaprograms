package programswithJUNITtestcase;

public class MergeSortForLinkedList {
    Node head = null;

    public static Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String args[]) {
        MergeSortForLinkedList a = new MergeSortForLinkedList();
        a.push(3);
        a.push(1);
        a.push(5);
        a.push(4);
        a.push(2);
        a.push(3);

        a.head = a.mergeSort(a.head);
        a.printLinkedList(a.head);
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node middle = getMiddle(head);
        Node middleOfNext = middle.next;
        middle.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(middleOfNext);

        Node sortedList = sortedMerge(left, right);
        return sortedList;
    }

    public Node sortedMerge(Node a, Node b) {
        Node result = null;
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }

        if (a.val <= b.val) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    public void push(int val) {
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;
    }

    public void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}

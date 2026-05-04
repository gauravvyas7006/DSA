class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveNode {
    public static void main(String[] args) {

        Node l1 = new Node(1);
        l1.next = new Node(2);
        l1.next.next = new Node(3);
        l1.next.next.next = new Node(4);
        l1.next.next.next.next = new Node(5);

        int n = 2; 

        Node dummy = new Node(0);
        dummy.next = l1;

        Node slow = dummy;
        Node fast = dummy;

        
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        
        slow.next = slow.next.next;

        
        Node curr = dummy.next;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
    }
}
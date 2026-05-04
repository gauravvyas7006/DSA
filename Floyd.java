class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class Floyd{

    public static boolean  hasCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node tr = new Node(1);
        tr.next = new Node(2);
        tr.next.next = new Node(3);
        tr.next.next.next = new Node(4);
        tr.next.next.next.next = new Node(5);
        Node head = tr;
        boolean result = hasCycle(head);
        System.out.print(result);
        
        
    }
}    
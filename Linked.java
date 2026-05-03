class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class Linked{

    public static ListNode reverseList(ListNode head){
     ListNode prev = null;
     ListNode curr = head;
     while(curr != null){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
     }

        return prev;
    }  

    public static void main(String[] args){
        ListNode tr = new ListNode(10);

        tr.next = new ListNode(20);
        tr.next.next = new ListNode(30);
        tr.next.next.next = new ListNode(40);
        tr.next.next.next.next = new ListNode(50);
        ListNode reversed = reverseList(tr);
        
        ListNode temp = reversed;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
        
    }
}
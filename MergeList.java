class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class MergeList {
    public static Node merge(Node fr, Node sr){
        Node dummy = new Node(0);
        Node current = dummy;
        while(fr != null && sr != null){
            
            if(fr.val < sr.val){
                current.next = fr;
                fr = fr.next;
            }
            else{
                current.next = sr;
                sr = sr.next;
            }
           current = current.next;
        }

        if(fr != null){
            current.next = fr;
        } else {
            current.next = sr;
        }
      return dummy.next;
    }
     
     
     public static void main(String[] args) {
        Node fr = new Node(1);
        fr.next = new Node(3);
        fr.next.next = new Node(5);
        Node sr = new Node(2); 
        sr.next = new Node(4);
        sr.next.next = new Node(6);
        
        Node result = merge(fr,sr);
         Node temp = result;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        
        
    }
}
package datastructure;

public class SingliLinkList {

    // Given a Node List and Print all elements List
    public  void display(ListNode head){
    if(head == null){
        return;
    }
    ListNode current = head;
    while(current != null){
        System.out.print(current.data+" ");//print current elements'data
        current = current.naxt;
    }
        System.out.print(current); // here current will be null

    }
    private static class ListNode {
         private int data;
         private ListNode naxt;

         ListNode(int data) {
             this.data = data;
             this.naxt = null;
         }
     }

    public static void main(String[] args){
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        //10...>20...>30..>40
        head.naxt = second;
        second.naxt = third;
        third.naxt = fourth;

        SingliLinkList singliLinkList = new SingliLinkList();
        singliLinkList.display(head);
    }
}

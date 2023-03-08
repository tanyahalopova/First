import java.util.Scanner;

public class Main {
      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode first = new ListNode();
          int c = 0;
          ListNode s = first;
          s.val = (l1.val+l2.val+c)%10;
          c = (l1.val+l2.val+c)/10;
          while(l1.next!=null || l2.next!=null || c!=0){
              if (l1.next!=null){
                  l1=l1.next;
              }
              else{
                  l1.val=0;
              }
              if (l2.next!=null){
                  l2=l1.next;
              }
              else{
                  l2.val=0;
              }
              ListNode f = new ListNode((l1.val+l2.val+c)%10);
              c = (l1.val+l2.val+c)/10;
              s.next = f;
              s=f;
          }
          return first;
    }
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          ListNode s = new ListNode();
          ListNode c = s;
          while (scanner.nextInt()!=0){;
              ListNode f = new ListNode(scanner.nextInt());
              c.next = f;
              c = f;
          }

    }
}
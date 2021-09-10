/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     
        ListNode p1 = l1;ListNode p2 = l2;            // 1. when dealing with linked list we create temporary linked list as to not mess with original linked list value
        ListNode ans = new ListNode(0);               // 2. ans contains the final linked list which we have to return
        ListNode cur=ans;                             //3.  as we have to update the value in 'ans' linked list we will store in another temporary linked list
        int carry=0;                                  //4. we have to keep the carry in check for adding
        
        while(p1!=null || p2!=null)             // let p1 = 2,4,3  p2 = 5,6,4
        {
            int a = (p1!=null)?p1.val:0;        // (for 1'st time in while loop) p1.val!=null  a=2
            int b = (p2!=null)?p2.val:0;        //b=5
            
            int sum = carry+a+b;              // sum = 0+2+5; (7)
            carry=sum/10;                       //carry = 7/10 = 0
            cur.next = new ListNode(sum%10);            // cur = 0,7 ( 0 is already present in cur linked list because in step 2 we inset 0 as new node in ans and in step 3 we say cur=ans
            cur=cur.next;                       
            
            if(p1!=null){p1=p1.next;}                   
            if(p2!=null){p2=p2.next;}                   
        }
        if(carry>0)                                 
        {
            cur.next=new ListNode(carry);
        }
        ans=ans.next;                                 
        return ans;
    }
}

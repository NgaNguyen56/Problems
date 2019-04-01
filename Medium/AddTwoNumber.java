/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int extra = 0;
        int digitSum = l1.val + l2.val + extra;
        if(digitSum >= 10) {
            digitSum -= 10;
            extra = 1;
        }
        else{
            extra = 0;
        }
        ListNode result = new ListNode(digitSum);
        ListNode newNode = result;
        while(l1.next != null || l2.next!=null || extra == 1){
            digitSum = extra;
            if(l1.next != null) {
                l1 = l1.next;
                digitSum += l1.val;
            }
            if(l2.next != null) {
                l2 = l2.next;
                digitSum += l2.val;
            }
            
            if(digitSum >= 10) {
                digitSum = digitSum - 10;
                extra = 1;
            }
            else{
                extra = 0;
            }
            newNode.next = new ListNode(digitSum);
            newNode = newNode.next;
        }
        return result;
    }
}
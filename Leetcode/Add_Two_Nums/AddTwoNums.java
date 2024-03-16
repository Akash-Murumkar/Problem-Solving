
/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, 
 * and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

 */

class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class solution
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans= new ListNode();
        ListNode current =ans;
        int carry=0;
        while(l1 != null || l2 !=null || carry !=0)
        {
            int sum = carry;
            if(l1 !=null)
            {
                sum += l1.val;
                l1=l1.next;
            }
            if(l2 != null)
            {
                sum+=l2.val;
                l2 = l2.next;
            }
            carry = sum/10;
            current.next=new ListNode(sum%10);
            current = current.next;
            
        }
        return ans.next;
    }


}

public class AddTwoNums {
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Example input: representing the numbers 243 and 564
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Create an instance of the solution class
        solution sol = new solution();

        // Call the addTwoNumbers method
        ListNode result = sol.addTwoNumbers(l1, l2);

        // Print the result
        printList(result);
    }

    // Helper function to print the linked list
    


    
}
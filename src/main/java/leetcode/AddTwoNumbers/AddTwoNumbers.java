package leetcode.AddTwoNumbers;

public class AddTwoNumbers {
    public static void main(String[] args) {
        //243 listNode
        ListNode list1Node2 = new ListNode(3);
        ListNode list1Node1 = new ListNode(4, list1Node2);
        ListNode list1Node0 = new ListNode(2, list1Node1);

        //564 listNode
        ListNode list2Node2 = new ListNode(4);
        ListNode list2Node1 = new ListNode(6, list2Node2);
        ListNode list2Node0 = new ListNode(5, list2Node1);

        ListNode result = addTwoNumbers(list1Node0, list2Node0);
        System.out.println(result.val + "" + result.next.val + result.next.next.val);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        int carry = 0;
        ListNode pointerL1 = l1;
        ListNode pointerL2 = l2;
        ListNode currentNode = res;

        while(pointerL1 != null || pointerL2 != null) {
            int val1 = pointerL1 != null ? pointerL1.val : 0;
            int val2 = pointerL2 != null ? pointerL2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum/10;

            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;

            if (pointerL1 != null) {
                pointerL1 = pointerL1.next;
            }
            if (pointerL2 != null) {
                pointerL2 = pointerL2.next;
            }

        }
        if (carry > 0) {
            currentNode.next = new ListNode(carry);
        }
        return res.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {

        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }
}

package org.example.letcode.solution21;

class ListNode { int val;
 ListNode next;
ListNode() {}
ListNode(int val) { this.val = val; }
ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        new Solution().mergeTwoLists(listNode1,listNode2);
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergeList = new ListNode();
        ListNode head = mergeList;
        while (list1 !=null && list2 !=null){
            if(list1.val<list2.val){
                mergeList.next = new ListNode(list1.val);
                list1 = list1.next;
            }else {
                mergeList.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            mergeList = mergeList.next;
        }
        if(list1 == null){
            mergeList.next = list2;
        }else {
            mergeList.next = list1;
        }
        return head.next;
    }
    private void soutList(ListNode listNode){
        while (listNode !=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

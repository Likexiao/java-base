package com.java.base.algorithm;

import java.util.HashSet;
import java.util.Set;

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode l1 = headA;
        ListNode l2 = headB;
        while(l1 !=null || l2 != null){
            if(l1 !=null){
                if(!set.add(l1)) return l1;
                l1 = l1.next;
            }
            if(l2 != null){
                if(!set.add(l2)) return l2;
                l2 = l2.next;
            }
        }
        return null;
    }
      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}

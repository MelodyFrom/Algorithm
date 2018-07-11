package com.gaop.demo.leetcode.linked;

public class ListNode {
	
	int val;
	ListNode next;
	public ListNode(int x) { val = x; }
	
    public void deleteNode(ListNode node) {
    	// if target is a head node
    	if(val == node.val) {
    		node = node.next;
    		return;
    	}
    	// the other situation
    	while(node != null) {
    		if(next.val == node.val) {
    			next = next.next;
    			return;
    		}
    	}
    }
	
	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}
	
	
}

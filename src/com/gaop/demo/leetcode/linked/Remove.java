package com.gaop.demo.leetcode.linked;

/**
 * @description 	
 * 	ɾ�������еĽڵ�
 * @author gaop
 * @date 2018��7��10�� ����8:47:25
 */
public class Remove {

	public static void main(String[] args) {
		// create a demo list
		ListNode node1 = new ListNode(4);
		ListNode node2 = new ListNode(5);
		ListNode node3 = new ListNode(1);
		ListNode node4 = new ListNode(9);
		node3.next = node4;
		node2.next = node3;
		node1.next = node2;
		System.out.println(node1);
		
		System.out.println(node1);
	}
	
    public void deleteNode(ListNode node) {
    	node.val = node.next.val;
    	node.next = node.next.next;
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        return null;
    }
	
}

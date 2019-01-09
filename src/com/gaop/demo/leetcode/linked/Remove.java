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
		deleteNode(node3);
		System.out.println(node1);
	}
	
	/**
	 * ɾ��ָ���ڵ㣬ע������ġ�ָ���ڵ㡱��ͬһ������
	 * @param node
	 */
    public static void deleteNode(ListNode node) {
    	node.val = node.next.val;
    	node.next = node.next.next;
    }
    
    /**
     * ɾ������ĵ�����N���ڵ㡣����Ҫ�ҵ�ָ����λ�ã���Ҫ����ִ��һ�α�����
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	int length = 1;
    	ListNode node = head;
    	while(null != node.next) {
    		node = node.next;
    		length ++;
    	}
    	System.out.println("������Ϊ:" + length);
    	int target = length - n + 1;
    	int count = 1;
    	while(null != node.next) {
    		if(count == target) {
    			node.val = node.next.val;
    			node.next = node.next.next;
    		}
    		node = node.next;
    		count ++;
    		
    	}
        return head;
    }
	
}

package com.gaop.demo.leetcode.linked;

/**
 * @description 	
 * 	删除链表中的节点
 * @author gaop
 * @date 2018年7月10日 下午8:47:25
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
	 * 删除指定节点，注意这里的“指定节点”是同一个引用
	 * @param node
	 */
    public static void deleteNode(ListNode node) {
    	node.val = node.next.val;
    	node.next = node.next.next;
    }
    
    /**
     * 删除链表的倒数第N个节点。链表要找到指定的位置，需要至少执行一次遍历。
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
    	System.out.println("链表长度为:" + length);
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

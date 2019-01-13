package com.gaop.BinaryTree.traverse;

import com.gaop.BinaryTree.BNode;

/**
 * @author gaopeng@doctorwork.com
 * @date 2019-01-13 23:31
 **/
public class Base {

    public static void visit(BNode<Integer> bNode) {
        System.out.print(bNode.getData() + " ");
    }
}

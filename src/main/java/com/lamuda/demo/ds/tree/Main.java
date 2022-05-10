package com.lamuda.demo.ds.tree;

/**
 * @author 王斯博
 * 2021-09-14 10:14
 */
public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();
        bst.put(9,"9");
        bst.put(4, "4");
        bst.put(3, "3");
        System.out.println(bst.findNotBalanceParentNodeKey());
        bst.put(1, "1");
        System.out.println(bst.findNotBalanceParentNodeKey());
        bst.put(2, "2");
        System.out.println(bst.findNotBalanceParentNodeKey());
        System.out.println();
    }
}

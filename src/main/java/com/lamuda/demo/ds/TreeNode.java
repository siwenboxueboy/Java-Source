package com.lamuda.demo.ds;

/**
 * @description:tree node 节点
 * @author: 王斯博
 * @date: 2021-08-18 08:10
 **/
public class TreeNode<T> {
    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;

    public TreeNode() {
    }

    public TreeNode(T data) {
        this.data = data;
    }

    public TreeNode(T data, TreeNode<T> left, TreeNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

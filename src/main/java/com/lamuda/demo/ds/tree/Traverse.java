package com.lamuda.demo.ds.tree;

import com.lamuda.demo.ds.TreeNode;
import com.lamuda.demo.ds.TreeNodeInt;

import java.util.LinkedList;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-23 09:45
 **/
public class Traverse {

    private Traverse() {
    }

    public static void preTraverse(TreeNode node) {
        if (node != null) {
            visit(node);
            preTraverse(node.left);
            preTraverse(node.right);
        }
    }

    private static void visit(TreeNode node) {
        System.out.print(node.data + "  ");
    }

    public static void midTraverse(TreeNode node) {
        if (node != null) {
            midTraverse(node.left);
            visit(node);
            midTraverse(node.right);
        }
    }

    public static void postTraverse(TreeNode node) {
        if (node != null) {
            postTraverse(node.left);
            postTraverse(node.right);
            visit(node);
        }
    }

    public static void preTraverseIteration(TreeNode node) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        if (node == null) {
            return;
        }
        /*
         * 遍历到左子树最下节点时，node == null stack ！= null
         * 开始的时候，还有遍历完根节点的左子树的时，node != null stack == null
         * */
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                visit(node);
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                node = node.right;
            }
        }
    }

    public static void postTraverseIteration(TreeNode node) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<TreeNode> resStack = new LinkedList<>();
        if (node == null) {
            return;
        }
        //先序遍历的基础上只改变了 right 和 left,visit 改成了放进栈里面
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                resStack.push(node);
                stack.push(node);
                node = node.right;
            } else {
                node = stack.pop();
                node = node.left;
            }
        }
        while (!resStack.isEmpty()) {
            visit(resStack.pop());
        }
    }

    public static void midTraverseIteration(TreeNode node) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        if (node == null) {
            return;
        }
        //先序遍历的基础上改变了visit(node)的时机
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                //出栈后，即左子树已经遍历完成，转向右子树之前，刚好可以遍历
                visit(node);
                node = node.right;
            }
        }
    }

    public static void traverseAll(TreeNode node) {
        System.out.println("pre traverse:");
        preTraverse(node);
        System.out.println("\nmid traverse:");
        midTraverse(node);
        System.out.println("\npost traverse:");
        postTraverse(node);
        System.out.println();
    }

    public static void main(String[] args) {
        TreeNodeInt treeNodeInt = new TreeNodeInt(1, new TreeNodeInt(2, new TreeNodeInt(4), new TreeNodeInt(5)), new TreeNodeInt(3));
        traverseAll(treeNodeInt);
    }

}

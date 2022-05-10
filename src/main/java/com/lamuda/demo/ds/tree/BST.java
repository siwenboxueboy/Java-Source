package com.lamuda.demo.ds.tree;


/**
 * @author 王斯博
 * 2021-09-14 08:53
 */
public class BST<Key extends Comparable<Key>, Value> {

    private Node root;

    private class Node {
        private Key key;
        private Value val;
        private Node left, right;
        private int N;

        public Key getKey() {
            return key;
        }

        public Value getVal() {
            return val;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public int getN() {
            return N;
        }

        public Node(Key key, Value val, int n) {
            this.key = key;
            this.val = val;
            N = n;
        }
    }

    public boolean isNotEmpty() {
        return size() > 0;
    }

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null) {
            return 0;
        } else {
            return x.N;
        }
    }

    public Value delete(Key key){

        return null;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node root, Key key) {
        if (root == null) return null;
        int cmp = key.compareTo(root.key);
        if (cmp < 0) return get(root.left, key);
        else if (cmp > 0) return get(root.right, key);
        else return root.val;
    }

    public void put(Key key, Value val) {
        root = put(root, key, val);
    }

    //相当于递归的遍历  第一次遇到节点时，若为空则新建 最后一次遇到节点时，设置节点数N
    private Node put(Node root, Key key, Value val) {
        if (root == null) return new Node(key, val, 1);
        int cmp = key.compareTo(root.key);
        if (cmp < 0) root.left = put(root.left, key, val);
        else if (cmp > 0) root.right = put(root.right, key, val);
        else root.val = val;
        //上面递归相当于设置完了子节点，则最后返回父节点，子节点的root.left，root.right刚刚都设置好了，现在的root也可以根据子节点的值来更新了
        root.N = size(root.left) + size(root.right) + 1;//size这个变量可能不会很及时
        return root;
    }

    private Node min() {
        Node node = root;
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    private Node max() {
        Node node = root;
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    //找最小不平衡子树的根节点指针
    private Node findNotBalanceNode() {
        findNotBalanceNode(root);
        minNotBalanceFinding = true;
        return minNotBalanceNode;
    }

    //找最小不平衡子树的根节点指针
    public Key findNotBalanceKey() {
        return findNotBalanceNode().key;
    }

    private Node findNotBalanceParentNode() {
        findNotBalanceNode(root);
        minNotBalanceFinding = true;
        return minNotBalanceParentNode;
    }

    public Key findNotBalanceParentNodeKey() {
        Node notBalanceParentNode = findNotBalanceParentNode();
        return notBalanceParentNode == null ? null : notBalanceParentNode.key;
    }

    private Node minNotBalanceParentNode = null;

    private Node minNotBalanceNode = null;

    private boolean minNotBalanceFinding = true;

    private int findNotBalanceNode(Node node) {
        if (node == null) return 0;
        int left = findNotBalanceNode(node.left);
        int right = findNotBalanceNode(node.right);
        //找最小不平衡子树的根节点
        if (minNotBalanceFinding && Math.abs(left - right) > 1) {
            minNotBalanceNode = node;
            minNotBalanceFinding = false;
        }
        //若为根节点，则父节点也返回根节点，若为非根节点，则返回父节点
        if (!minNotBalanceFinding && (node.left == minNotBalanceNode || node.right == minNotBalanceNode || root == minNotBalanceNode)) {
            minNotBalanceParentNode = node == root ? root : node;
        }
        return (left > right ? left : right) + 1;
    }

}

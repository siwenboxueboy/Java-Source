package com.lamuda.demo.ds.graph;

/**
 * @author 王斯博
 * 2021-09-24 15:39
 * union-find
 */
public class UF {
    // 连通分量个数
    private int count;
    // 存储一棵树
    private int[] parent;
    // 记录树的“重量”
    private int[] size;

    public UF(int count) {
        this.count = count;
        parent = new int[count];
        size = new int[count];
        for (int i = 0; i < count; i++) {
            parent[i] = i;//parent为自己
            size[i] = 1;//每个连同分量都是1
        }
    }

    /* 将 p 和 q 连接
     * 连接的时候要大树挂小树，size大的作为树根
     *  */
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ)
            return;
        if (size[rootP] > size[rootQ]) {
            //p的根节点作为树根
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        } else {
            //q的根节点作为树根
            parent[rootP] = rootQ;
            //跟新根节点的size
            size[rootQ] += size[rootP];
        }
        count--;
    }

    /* 判断 p 和 q 是否连通 */
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    /* 返回某个节点 x 的根节点 */
    private int find(int x) {
        while (parent[x] != x) {
            parent[x] = parent[parent[x]];//将x的父节点指向x父节点的父节点，加上这句，则可降低树的高度

            x = parent[x];//更新x节点为当前x的父节点,继续向上寻找
        }
        return x;
    }


    /* 返回图中有多少个连通分量 */
    public int count() {
        return count;
    }

    public static void main(String[] args) {
        UF uf = new UF(5);
        System.out.println(uf.connected(1, 2));
        uf.union(1, 2);
        System.out.println(uf.count);
        System.out.println(uf.connected(1, 2));
        System.out.println();
    }
}

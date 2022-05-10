package com.lamuda.demo.ds.graph;

public abstract class Search {

    //标记顶点是否被访问过
    //记录访问过的节点数量
    public Search(boolean[] marked, int count) {
        this.marked = marked;
        this.count = count;
    }

    protected boolean[] marked;

    protected int count;

    //v和s是连通的吗
    protected boolean marked(int V) {
        return marked[V];
    }

    //与s连通的顶点总数
    protected int count() {
        return count;
    }

    protected void visit(int v){
        System.out.print(" | 顶点 ：" + v);
    }
}

package com.lamuda.demo.ds;

import com.lamuda.demo.ds.graph.BreadthFirstSearch;
import com.lamuda.demo.ds.graph.DepthFirstSearch;
import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.In;



/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-20 15:23
 **/
public class Graph {
    private final int V;//顶点数目
    private int E;//边数
    /**
     * 邻接表数组
     * 数组下标相当于顶点编号，数组中的元素是链表，用于存储与顶点有联系的邻接点
    * */
    private Bag<Integer>[] adj;

    public int getV() {
        return V;
    }

    public int getE() {
        return E;
    }

    public Integer getFirst() {
        return adj == null ? null : 0;
    }

    //根据顶点初始化图
    public Graph(int V) {
        this.V = V;
        this.E = 0;
        adj = new Bag[V];//创建邻接表
        for (int i = 0; i < V; i++) {//将所有链表初始化为空
            adj[i] = new Bag<>();
        }
    }

    /**
     * 顶点总数
     * 边数
     */
    public Graph(int V,int[][] E){
        this(V);
        if (E == null || E.length == 0 || E[0].length != 2){
            return;
        }
        for (int[] e : E) {
            addEdge(e[0],e[1]);
        }
    }

    public Graph(In in) {
        this(in.readInt());//读取顶点并将其初始化
        int E = in.readInt();//读取边数
        //整数对范围 [0,V-1]
        for (int i = 0; i < E; i++) {
            //添加一条边
            int v = in.readInt();
            int w = in.readInt();
            addEdge(v, w);//添加一条连接他们的边
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        this.E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public String toString() {
        String s = V + " vertices, " + E + " edges\n";
        for (int v = 0; v < V; v++) {
            s += v + ": ";
            for (int w : this.adj(v)) s += w + " ";
            s += "\n";
        }
        return s;
    }

    public static void main(String[] args) {
        int[][] E = {{0,2},{2,1},{2,3},{3,4},{3,5}};
        Graph graph = new Graph(6, E);
        System.out.println(graph);
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch(graph);
        depthFirstSearch.dfs(graph,0);
        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch(graph);
        breadthFirstSearch.bfs(graph,0);
    }
}

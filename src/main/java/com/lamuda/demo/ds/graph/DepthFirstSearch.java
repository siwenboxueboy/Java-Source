package com.lamuda.demo.ds.graph;

import com.lamuda.demo.ds.Graph;

/**
 * @author 王斯博
 * 2021-09-16 09:32
 */
public class DepthFirstSearch extends Search{

    public DepthFirstSearch(Graph G) {
        super(new boolean[G.getV()],0);
    }

    public void dfs(Graph G, int v){
        marked[v] = true;
        visit(v);
        for (Integer w : G.adj(v)) {
            if (!marked[w]){
                dfs(G,w);
            }
        }
        count++;
    }
}

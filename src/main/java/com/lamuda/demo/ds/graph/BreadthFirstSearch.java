package com.lamuda.demo.ds.graph;

import com.lamuda.demo.ds.Graph;

import java.util.LinkedList;

/**
 * @author 王斯博
 * 2021-09-18 08:57
 */
public class BreadthFirstSearch extends Search {

    public BreadthFirstSearch(Graph G) {
        super(new boolean[G.getV()],0);
    }

    public void bfs(Graph G,int v){
        LinkedList<Integer> stack = new LinkedList<>();
        marked[v] = true;
        visit(v);
        stack.push(v);
        count++;
        while (!stack.isEmpty()) {
            v = stack.pop();
            for (Integer w : G.adj(v)) {
                if (!marked[w]){
                    marked[w] = true;
                    visit(w);
                    stack.push(w);
                    count++;
                }
            }
        }
    }
}

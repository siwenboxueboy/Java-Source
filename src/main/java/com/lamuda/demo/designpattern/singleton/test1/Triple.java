package com.lamuda.demo.designpattern.singleton.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-12 09:41
 **/
public class Triple {
    private static List<Triple> triples;

    static {
        triples = new ArrayList<>();
        triples.add(new Triple());
        triples.add(new Triple());
        triples.add(new Triple());
    }

    private Triple() {
        System.out.println("generate a instance ! ");
    }

    public static Triple getInstance(int index) {
        if (index < 0 || index > 3) return null;
        return triples.get(index);
    }
}

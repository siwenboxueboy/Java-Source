package com.lamuda.demo.ds.list;

import java.util.Collection;
import java.util.Iterator;

/**
 * @description: 优先队列
 * @author: 王斯博
 * @date: 2021-09-03 10:26
 **/
public class PriorityQueue<T extends Comparable> implements Iterable<T>{

    private Object[] ts;//save start from ts[1]

    private int size = 0;

    private int defaultLen = 99;

    public PriorityQueue(int defaultLen) {
        this.defaultLen = defaultLen;
    }

    public PriorityQueue(Collection<T> collection){
        defaultLen = collection.size();
        for (T t : collection) {
            put(t);
        }
    }

    public PriorityQueue(T... ts) {
        defaultLen = ts.length;
        for (T t : ts) {
            put(t);
        }
    }

    public PriorityQueue() {

    }

    public T deleteMax() {
        swap(1, size);
        //new root will sink to find suitable position from 1 to (size -1)
        size--;
        sink(1);
        //get deleted element
        return get(size+1);
    }

    public void put(T t) {
        //Initialise element space
        if (ts == null) {
            ts = new Object[defaultLen + 1];
        }
        add(t);
        swim(size);//元素位置在size
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //k element sink
    private void sink(int k) {
        ts[0] = ts[k];
        for (int i = 2 * k; i <= size; i *= 2) {
            if (i < size && ((T) ts[i]).compareTo(((T) ts[i + 1])) < 0) {
                i++;
            }
            if (((T) ts[i]).compareTo(((T) ts[0])) > 0) {
                ts[k] = ts[i];
                k = i;
            }
        }
        ts[k] = ts[0];
    }

    //i element swim
    private void swim(int i) {
        ts[0] = ts[i];
        for (int k = i/2; k >= 1; k/=2) {
            if (((T) ts[0]).compareTo(((T) ts[k])) > 0) {
                ts[i] = ts[k];
                i = k;
            }
        }
        ts[i] = ts[0];
    }

    //add element
    private void add(T t) {
        if (size < defaultLen) {
            ts[++size] = t;
        }
    }

    //get element only inner using
    private T get(int i) {
        return i <= size + 1 && i > 0 ? (T) ts[i] : null;
    }

    private void swap(int aIndex, int bIndex) {
        T tmp = (T) ts[aIndex];
        ts[aIndex] = ts[bIndex];
        ts[bIndex] = tmp;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return !isEmpty();
            }

            @Override
            public T next() {
                return deleteMax();
            }
        };
    }
}

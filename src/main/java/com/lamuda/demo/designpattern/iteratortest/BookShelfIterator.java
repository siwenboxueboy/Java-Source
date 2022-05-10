package com.lamuda.demo.designpattern.iteratortest;

import com.lamuda.demo.designpattern.iterator.Book;
import com.lamuda.demo.designpattern.iterator.Iterator;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-07-31 17:04
 **/
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        //返回当前的元素
        Book book = bookShelf.getBookAt(index);
        //指向下一个元素
        index++;
        return book;
    }
}

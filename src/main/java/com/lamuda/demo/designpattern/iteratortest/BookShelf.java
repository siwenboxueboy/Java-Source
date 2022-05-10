package com.lamuda.demo.designpattern.iteratortest;

import com.lamuda.demo.designpattern.iterator.Aggregete;
import com.lamuda.demo.designpattern.iterator.Book;
import com.lamuda.demo.designpattern.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-07-31 17:04
 **/
public class BookShelf implements Aggregete {

    private List<Book> books;//书籍列表属性不能直接操作，必须用方法操作

    public BookShelf(int initialsize) {
        this.books = new ArrayList<>(initialsize);
    }

    //    获取第几本书
    public Book getBookAt(int index){
        return books.get(index);
    }

    public void appendBook(Book book){
        this.books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}

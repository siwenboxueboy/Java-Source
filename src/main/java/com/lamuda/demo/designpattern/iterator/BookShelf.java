package com.lamuda.demo.designpattern.iterator;

/**
 * @description: 书架，相当于书籍的集合类，所以要实现Aggregate接口
 * @author: 王斯博
 * @date: 2021-07-31 16:31
 **/
public class BookShelf implements Aggregete{

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

//    获取第几本书
    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        //迭代自己
        return new BookShelfIteraotr(this);
    }
}

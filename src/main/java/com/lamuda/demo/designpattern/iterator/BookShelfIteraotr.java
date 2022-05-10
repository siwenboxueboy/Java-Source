package com.lamuda.demo.designpattern.iterator;

/**
 * @description: 遍历书籍的类
 * @author: 王斯博
 * @date: 2021-07-31 16:37
 **/
public class BookShelfIteraotr implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIteraotr(BookShelf bookShelf) {
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

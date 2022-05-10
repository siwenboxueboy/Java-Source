package com.lamuda.demo.designpattern.composite;

/**
 * @description: 向文件中增加entry时发生异常的类
 * @author: 王斯博
 * @date: 2021-08-16 15:19
 **/
public class FileTreatementException extends RuntimeException {

    public FileTreatementException() {
    }

    public FileTreatementException(String message) {
        super(message);
    }
}

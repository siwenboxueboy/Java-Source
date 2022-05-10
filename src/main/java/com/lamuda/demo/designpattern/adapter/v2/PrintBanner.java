package com.lamuda.demo.designpattern.adapter.v2;

import com.lamuda.demo.designpattern.adapter.Banner;

/**
 * @description: 对象适配器
 * 作用：将100V转换为12V
 * @author: 王斯博
 * @date: 2021-07-31 17:51
 **/
public class PrintBanner extends Print{

    private Banner banner;

    public PrintBanner(Banner banner) {
        this.banner = banner;
    }

    @Override
    void printWeak() {
        banner.showWithParen();
    }

    @Override
    void printStrong() {
        banner.showWithAster();
    }
}

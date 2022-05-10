package com.lamuda.demo.designpattern.chainOfResponsibility;

/**
 * 具体解决类 仅解决编号小于指定编号的问题
 *
 * @author 王斯博
 * 2022-03-03 08:29
 */
public class LimitSupport extends Support {

    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            // todo resolving code
            return true;
        }
        return false;
    }
}

package com.lamuda.demo.designpattern.chainOfResponsibility;

/**
 * 解决问题具体类 (仅解决奇数编号问题)
 *
 * @author 王斯博
 * 2022-03-03 08:29
 */
public class OddSupport extends Support{

    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            // todo resolving code
            return true;
        }
        return false;
    }
}

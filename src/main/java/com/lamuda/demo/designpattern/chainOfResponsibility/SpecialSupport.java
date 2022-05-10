package com.lamuda.demo.designpattern.chainOfResponsibility;

/**
 * 具体类 (仅解决指定编号问题)
 *
 * @author 王斯博
 * 2022-03-03 08:30
 */
public class SpecialSupport extends Support {
    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            // todo resolving code
            return true;
        }
        return false;
    }
}

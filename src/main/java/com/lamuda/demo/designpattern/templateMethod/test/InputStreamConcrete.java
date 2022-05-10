package com.lamuda.demo.designpattern.templateMethod.test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description:test1
 * @author: 王斯博
 * @date: 2021-08-02 15:37
 **/
public class InputStreamConcrete extends InputStream {

    @Override
    public int read() throws IOException {
        return 0;
    }
}
/*
* test2:使用final是因为这样可以限制子类去修改变动
*
* */

/*
* test4:
* 接口的设计目的，是对类的行为进行约束（更准确的说是一种“有”约束，因为接口不能规定类不可以有什
* 么行为），也就是提供一种机制，可以强制要求不同的类具有相同的行为。它只约束了行为的有无，但不
* 对如何实现行为进行限制。对“接口为何是约束”的理解，我觉得配合泛型食用效果更佳。
* 而抽象类的设计目的，是代码复用。当不同的类具有某些相同的行为(记为行为集合A)，且其中一部分行
* 为的实现方式一致时（A的非真子集，记为B），可以让这些类都派生于一个抽象类。在这个抽象类中实现
* 了B，避免让所有的子类来实现B，这就达到了代码复用的目的。而A减B的部分，留给各个子类自己实现。
* 正是因为A-B在这里没有实现，所以抽象类不允许实例化出来（否则当调用到A-B时，无法执行）。
*
* */
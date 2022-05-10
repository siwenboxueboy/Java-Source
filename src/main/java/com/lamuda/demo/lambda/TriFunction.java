package com.lamuda.demo.lambda;

//三个入参，一个回参的函数式接口
public interface TriFunction<T,U,V,R>{
//    需要与构造函数引用的签名匹配的函数式接口
    R apply(T t,U u,V v);
}

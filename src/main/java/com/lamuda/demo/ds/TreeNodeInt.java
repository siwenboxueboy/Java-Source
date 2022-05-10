package com.lamuda.demo.ds;

import cn.hutool.core.util.HexUtil;
import cn.hutool.crypto.SmUtil;


/**
 * @author 王斯博
 * 2021-09-13 16:39
 */
public class TreeNodeInt extends TreeNode<Integer>{
    public TreeNodeInt() {
    }

    public TreeNodeInt(Integer data) {
        super(data);
    }

    public TreeNodeInt(Integer data, TreeNode<Integer> left, TreeNode<Integer> right) {
        super(data, left, right);
    }


    public static void main(String[] args) {
        String string = SmUtil.sm4(HexUtil.decodeHex("63727578e5a4a9e4b88be697a0e6958c")).encryptHex("123456");
        System.out.println(string);
        String s = SmUtil.sm4(HexUtil.decodeHex("63727578e5a4a9e4b88be697a0e6958c")).decryptStr("d9236e14956e5ddcad88e5d70fd01a41");
        System.out.println(s);
    }
}

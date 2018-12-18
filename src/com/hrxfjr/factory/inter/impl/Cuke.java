package com.hrxfjr.factory.inter.impl;

import com.hrxfjr.factory.inter.Vegetables;

/**
 * @Auther: RCY
 * @Date: 2018/12/18 11:07
 * @Description: 黄瓜类
 */
public class Cuke implements Vegetables {
    @Override
    public void cultivate() {
        System.out.println("黄瓜类的养护方法！！！");
    }
}

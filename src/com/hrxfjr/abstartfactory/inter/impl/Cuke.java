package com.hrxfjr.abstartfactory.inter.impl;


import com.hrxfjr.abstartfactory.inter.Vegetables;

/**
 * @Auther: RCY
 * @Date: 2018/12/18 11:07
 * @Description: 黄瓜类
 */
public class Cuke implements Vegetables {

    @Override
    public void cultivate() {
        System.out.println("黄瓜的养殖方法！");
    }
}

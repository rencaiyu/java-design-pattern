package com.hrxfjr.abstartfactory.inter.impl;


import com.hrxfjr.abstartfactory.inter.Vegetables;

/**
 * @Auther: RCY
 * @Date: 2018/12/18 11:08
 * @Description: 红萝卜类
 */
public class Carrot implements Vegetables {


    @Override
    public void cultivate() {
        System.out.println("红萝卜的养殖方法！");
    }
}

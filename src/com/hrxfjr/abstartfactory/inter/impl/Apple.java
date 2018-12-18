package com.hrxfjr.abstartfactory.inter.impl;

import com.hrxfjr.abstartfactory.inter.Fruits;

/**
 * @Auther: RCY
 * @Date: 2018/12/18 15:08
 * @Description:
 */
public class Apple implements Fruits {
    @Override
    public void cultivate() {
        System.out.println("苹果种植的方法！！！");
    }
}

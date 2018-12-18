package com.hrxfjr.abstartfactory.inter.impl;

import com.hrxfjr.abstartfactory.inter.Fruits;

/**
 * @Auther: RCY
 * @Date: 2018/12/18 15:09
 * @Description: 香蕉实体类
 */
public class Banana implements Fruits {

    @Override
    public void cultivate() {
        System.out.println("香蕉种植的方法！！！");
    }
}

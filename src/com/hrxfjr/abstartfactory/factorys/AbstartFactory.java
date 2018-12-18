package com.hrxfjr.abstartfactory.factorys;

import com.hrxfjr.abstartfactory.inter.Fruits;
import com.hrxfjr.abstartfactory.inter.Vegetables;

/**
 * @Auther: RCY
 * @Date: 2018/12/18 15:17
 * @Description:
 */
public abstract class AbstartFactory {
    //获取水果
    public abstract Fruits getFruits(String type);

    //获取蔬菜
    public abstract Vegetables getVegetables(String type);
}

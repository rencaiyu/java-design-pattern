package com.hrxfjr.abstartfactory.factorys;

import com.hrxfjr.abstartfactory.inter.Fruits;
import com.hrxfjr.abstartfactory.inter.Vegetables;
import com.hrxfjr.abstartfactory.inter.impl.Apple;
import com.hrxfjr.abstartfactory.inter.impl.Banana;

/**
 * @Auther: RCY
 * @Date: 2018/12/18 15:38
 * @Description:
 */
public class FruitsFactory extends AbstartFactory {

    public static final String APPLE = "apple";
    public static final String BANANA = "banana";


    @Override
    public Fruits getFruits(String type) {
        Fruits fruits = null;
        switch (type) {
            case "apple":
                fruits = new Apple();
                break;
            case "banana":
                fruits = new Banana();
                break;
        }
        return fruits;
    }

    @Override
    public Vegetables getVegetables(String type) {
        return null;
    }
}

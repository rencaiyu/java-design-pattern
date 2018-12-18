package com.hrxfjr.abstartfactory.factorys;

import com.hrxfjr.abstartfactory.inter.Fruits;
import com.hrxfjr.abstartfactory.inter.Vegetables;
import com.hrxfjr.abstartfactory.inter.impl.Carrot;
import com.hrxfjr.abstartfactory.inter.impl.Cuke;

/**
 * @Auther: RCY
 * @Date: 2018/12/18 15:39
 * @Description:
 */
public class VegetablesFactory extends AbstartFactory {

    public static final String CARROT = "currot";
    public static final String CUKE = "cuke";


    @Override
    public Fruits getFruits(String Type) {
        return null;
    }

    @Override
    public Vegetables getVegetables(String type) {
        Vegetables vegetables = null;
        switch (type) {
            case "currot":
                vegetables = new Carrot();
                break;
            case "cuke":
                vegetables = new Cuke();
                break;
        }
        return vegetables;
    }
}

package com.hrxfjr.factory.factouys;

import com.hrxfjr.factory.inter.impl.Carrot;
import com.hrxfjr.factory.inter.impl.Cuke;
import com.hrxfjr.factory.inter.Vegetables;

/**
 * @Auther: RCY
 * @Date: 2018/12/18 11:14
 * @Description: 抽象出来一个专门来生产的蔬菜工厂，进一步实现解耦
 */
public class VegetablesFactory {

    public static final String CARROT = "currot";
    public static final String CUKE = "cuke";

    public Vegetables getVegetables(String vegetabesType) {
        Vegetables vegetables = null;

        switch (vegetabesType) {
            case "currot":
                vegetables = new Carrot();
                break;
            case "cuke":
                vegetables = new Cuke();
                break;
            default:
                System.out.println("没有此蔬菜");
                break;
        }
        return vegetables;
    }

}

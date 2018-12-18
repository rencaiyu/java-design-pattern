package com.hrxfjr.factory.test;

import com.hrxfjr.factory.factouys.VegetablesFactory;
import com.hrxfjr.factory.inter.Vegetables;

/**
 * @Auther: RCY
 * @Date: 2018/12/18 11:10
 * @Description:
 */
public class VegetablesTest {
    public static void main(String[] args) {
        VegetablesFactory vegetablesFactory = new VegetablesFactory();
        Vegetables vegetables = vegetablesFactory.getVegetables(VegetablesFactory.CARROT);
        vegetables.cultivate();



    }
}

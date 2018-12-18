package com.hrxfjr.abstartfactory.producer;

import com.hrxfjr.abstartfactory.factorys.AbstartFactory;
import com.hrxfjr.abstartfactory.factorys.FruitsFactory;
import com.hrxfjr.abstartfactory.factorys.VegetablesFactory;

/**
 * @Auther: RCY
 * @Date: 2018/12/18 15:50
 * @Description: 工厂创造器
 */
public class FactoryProducer {

    public AbstartFactory getFactory(String type) {
        if (type.equals("fruits")) {
            return new FruitsFactory();
        }
        if (type.equals("vegetables")) {
            return new VegetablesFactory();
        }
        return null;
    }
}

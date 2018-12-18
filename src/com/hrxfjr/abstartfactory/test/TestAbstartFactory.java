package com.hrxfjr.abstartfactory.test;

import com.hrxfjr.abstartfactory.factorys.AbstartFactory;
import com.hrxfjr.abstartfactory.factorys.VegetablesFactory;
import com.hrxfjr.abstartfactory.inter.Fruits;
import com.hrxfjr.abstartfactory.inter.Vegetables;
import com.hrxfjr.abstartfactory.producer.FactoryProducer;

/**
 * @Auther: RCY
 * @Date: 2018/12/18 15:55
 * @Description:
 */
public class TestAbstartFactory {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        //首先获取不同的工厂
        AbstartFactory fruits = factoryProducer.getFactory("fruits");
        //获取到具体的对象
        Fruits fruits1 = fruits.getFruits("apple");
        fruits1.cultivate();
        //首先获取不同的工厂
        AbstartFactory fruits2 = factoryProducer.getFactory("vegetables");
        //获取到具体的对象
        Vegetables currot = fruits2.getVegetables("currot");
        currot.cultivate();

    }
}

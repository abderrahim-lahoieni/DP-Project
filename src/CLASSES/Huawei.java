/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASSES;

import Prototype.SmartPhonePrototype;

/**
 *
 *
 */
public class Huawei extends SmartPhonePrototype {
    
    public Huawei(String model) {
        this.setPrice(1100);
        this.setModel(model);
    }

    @Override
    public SmartPhonePrototype clone() throws CloneNotSupportedException {
        return (Huawei) super.clone();
    }
}

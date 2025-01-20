/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASSES;

import Prototype.SmartPhonePrototype;

/**
 */
public class Apple extends SmartPhonePrototype {
    
    public Apple(String model) {
        this.setPrice(1200);
        this.setModel(model);
    }

    @Override
    public SmartPhonePrototype clone() throws CloneNotSupportedException {
        return (Apple) super.clone();
    } 
    
}

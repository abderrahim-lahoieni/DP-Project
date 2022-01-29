/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author salma elaakkouchi
 */
public abstract class SmartPhonePrototype implements Cloneable {
    private String model;
    private int price;
    private int additionalPrice = 0;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price + this.additionalPrice;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAdditionalPrice(int additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    @Override
    public SmartPhonePrototype clone() throws CloneNotSupportedException {
        return (SmartPhonePrototype) super.clone();
    }

    
    @Override
    public String toString() {
        return "SmartPhone [model=" + getModel() + ", price=" + getPrice() + "]";
    }
}

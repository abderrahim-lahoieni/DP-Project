/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype_smartphone_salma_mouna;

import CLASSES.Apple;
import CLASSES.Huawei;
import CLASSES.Samsung;
import Prototype.SmartPhonePrototype;

/**
 *
 * @author salma elaakkouchi
 */
public class Prototype_SmartPhone_Salma_Mouna {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {

       
        SmartPhonePrototype galaxyA30 = new Samsung("SAMSUNG GALAXY A30");
        SmartPhonePrototype iphoneX = new Apple("iPhoneX");
        SmartPhonePrototype novaY60 = new Huawei("nova Y60");

        System.out.println("=== Products for Normal Peoples ===");
         
        System.out.println(galaxyA30);
        System.out.println(iphoneX);
        System.out.println(novaY60);
        System.out.println();

        System.out.println("=== Products for VIPs ===");

        SmartPhonePrototype galaxyA30GoldVips = galaxyA30.clone();
        galaxyA30GoldVips.setAdditionalPrice(50);
        System.out.println(galaxyA30GoldVips);

        SmartPhonePrototype iphoneX128Vips = iphoneX.clone();
        iphoneX128Vips.setAdditionalPrice(100);
        System.out.println(iphoneX128Vips);
        
        SmartPhonePrototype novaY60Vips = novaY60.clone();
        novaY60Vips.setAdditionalPrice(100);
        System.out.println(novaY60Vips);

        System.out.println();
        System.out.println("=== Products for Students ===");

        SmartPhonePrototype galaxyA30Students = galaxyA30.clone();
        galaxyA30Students.setAdditionalPrice(-200);
        System.out.println(galaxyA30Students);

        SmartPhonePrototype iphoneXStudents = iphoneX.clone();
        iphoneXStudents.setAdditionalPrice(-300);
        System.out.println(iphoneXStudents);
        
        SmartPhonePrototype novaY60Students = novaY60.clone();
        novaY60Students.setAdditionalPrice(-100);
        System.out.println(novaY60Students);
    }
    
}

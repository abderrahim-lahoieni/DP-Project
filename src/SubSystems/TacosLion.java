/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubSystems;

import Service.FranchiseService;

/**
 *
 * @author salma elaakkouchi
 */
public class TacosLion implements FranchiseService{

    @Override
    public void Option() {
        System.out.println("Tacos de Lion.");
    }

    @Override
    public void Cost() {
        System.out.println("100 DH.");
    }
    
}

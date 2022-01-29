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
public class BurgerKing implements FranchiseService {

    @Override
    public void Option() {
        System.out.println("BurgerKing .") ;
    }

    @Override
    public void Cost() {
        System.out.println("200 DH.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Service.FranchiseService;
import SubSystems.BurgerKing;
import SubSystems.McDonalds;
import SubSystems.TacosLion;

/**
 *
 * @author salma elaakkouchi
 */
public class FranchiseServiceFacade {
       private FranchiseService TacosLion;
       private FranchiseService McDonalds;
       private FranchiseService BurgerKing;
       public FranchiseServiceFacade(){
              TacosLion = new TacosLion();
              McDonalds = new McDonalds();
              BurgerKing = new BurgerKing();
       }
       public void BuyTacosLionFranchise(){
              TacosLion.Option();
              TacosLion.Cost();
       } 
       public void BuyMcDonaldsFranchise(){
              McDonalds.Option();
              McDonalds.Cost();
       }
       public void BuyBurgerKingFranchise(){
              BurgerKing.Option();
              BurgerKing.Cost();
       }

}

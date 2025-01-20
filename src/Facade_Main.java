/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Facade.FranchiseServiceFacade;
import java.util.Scanner;

/**
 *
 */
public class Facade_Main {

    /**
     * @param args the command line arguments
     */
     private static int choice;
         public static void main(String args[]) throws NumberFormatException{
                   do{
                              System.out.print("Welcome to Franchise Service Registration...\n");
                              System.out.print(" 1. Tacos de Lion \n");
                              System.out.print(" 2. McDonalds \n");
                              System.out.print(" 3. Burger King \n");
                              System.out.print(" 4. EXIT \n");
                              System.out.print("Please Enter your Franchise Option Number: \n");
                              FranchiseServiceFacade sp=new FranchiseServiceFacade();
                   Scanner scan = new Scanner(System.in);
                   choice=scan.nextInt();
                  
                   
 
         switch (choice) {
                   case 1: {
                           sp.BuyTacosLionFranchise();
                            break;
                   }
                  
                  case 2: {
                          sp.BuyMcDonaldsFranchise();
                          break;
                  }
                  
                   case 3: {
                          sp.BuyBurgerKingFranchise();
                          break;
                  }
                  
                  default: {
                          System.out.println("Please Check the input and try again");
                          break;
                  }
          
          }
 
       }while(choice!=4);
    
        
    }
    
}

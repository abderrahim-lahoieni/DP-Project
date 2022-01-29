/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator_profilesocialmedia_salma_mouna;
import Profile.Profile;
import java.util.Scanner;
import social_networks.Facebook;
import social_networks.LinkedIn;
import social_networks.SocialNetwork;
import Spammer.SocialSpammer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author salma elaakkouchi
 */
public class Iterator_ProfileSocialMedia_Salma_Mouna {

    /**
     * @param args the command line arguments
     */
   public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please specify social network to target spam tool (default:Facebook):");
        System.out.println("1. Facebook");
        System.out.println("2. LinkedIn");
        String choice = scanner.nextLine();

        SocialNetwork network;
        if (choice.equals("2")) {
            network = new LinkedIn(createTestProfiles());
        }
        else {
            network = new Facebook(createTestProfiles());
        }

        SocialSpammer spammer = new SocialSpammer(network);
        spammer.sendSpamToFriends("salma.elaakkouchi@gmail.com",
                "Hey! This is Salma's friend Mouna. Can you do me a favor and like this post [link]?");
        spammer.sendSpamToCoworkers("mouna.elyounssi@gmail.com",
                "Hey! This is Mouna's boss Salma. Mouna told me you would be interested in [link].");
    }

    public static List<Profile> createTestProfiles() {
        List<Profile> data = new ArrayList<Profile>();
        
        data.add(new Profile("salma.elaakkouchi@gmail.com", "Salma EL AAKKOUCHI",
                "friends:mouna.elyounssi@gmail.com", "friends:sara.elaakkouchi@gmail.com",
                "asuna.yuuki@gmail.com"));
        data.add(new Profile("mouna.elyounssi@gmail.com", "Mouna EL YOUNSSI", 
                "friends:salma.elaakkouchi@gmail.com", "sara.elaakkouchi@gmail.com"));
        data.add(new Profile("sara.elaakkouchi@gmail.com", "Sara EL AAKKOUCHI", 
                "amine.elaakkouchi@gmail.com"));
        data.add(new Profile("asuna.yuuki@gmail.com", "Asuna Yuuki", "salma.elaakkouchi@gmail.com"));
        return data;
    }
    
    
  }
    



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
 */
public class Iterator_Main {

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
        } else {
            network = new Facebook(createTestProfiles());
        }

        SocialSpammer spammer = new SocialSpammer(network);
        spammer.sendSpamToFriends("lahoieni-Abderrahim@gmail.com",
                "Hey! This is Abderrahim's friend Mohamed. Can you do me a favor and like this post [link]?");
        spammer.sendSpamToCoworkers("elmaimouni-mohamed@gmail.com",
                "Hey! This is Mohamed's boss Abderrahim. Mohamed told me you would be interested in [link].");
    }

    public static List<Profile> createTestProfiles() {
        List<Profile> data = new ArrayList<Profile>();

        data.add(new Profile("lahoieni-Abderrahim@gmail.com", "Abderrahim LAHOIENI",
                "friends:elmaimouni-mohamed@gmail.com", "friends:ahmed-lahoieni@gmail.com",
                "ahmed-elmaimouni@gmail.com"));
        data.add(new Profile("elmaimouni-mohamed@gmail.com", "Mohamed ELMAIMOUNI",
                "friends:lahoieni-Abderrahim@gmail.com", "ahmed-lahoieni@gmail.com"));
        data.add(new Profile("ahmed-lahoieni@gmail.com", "Ahmed LAHOIENI",
                "amine.elaakkouchi@gmail.com"));
        data.add(new Profile("ahmed-elmaimouni@gmail.com", "Ahmed ELMAIMOUNI",
                "lahoieni-Abderrahim@gmail.com"));
        return data;
    }
}
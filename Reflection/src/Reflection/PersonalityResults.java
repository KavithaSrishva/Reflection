/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reflection;

/**
 *
 * @author KavithaSrishva
 */
/*The following class deals with try catch ArrayIndexOutOfBoundsException and static Arrays*/
public class PersonalityResults {

    void persona(int value) {
        System.out.println("Hooray!! Your Personality");
        try {
            String[] personality = new String[10];
            personality[0] = "Warmly interested in people";
            personality[1] = "Service-oriented, usually putting the needs of others above their own";
            personality[2] = "Future-oriented";
            personality[3] = "Creative and inspirational";
            personality[4] = "Original and individualistic";
            personality[5] = "Hard-working and dependable";
            personality[6] = "Well organized";
            personality[7] = "Straight-forward and honest";
            personality[8] = "Stable, practical and down-to-earth";
            personality[9] = "Community minded \"good citizens\"";

            System.out.println("You are" + " " + personality[value] + "\n");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Please enter your nick name and a valid number from 0 to 9");
        }
    }
}

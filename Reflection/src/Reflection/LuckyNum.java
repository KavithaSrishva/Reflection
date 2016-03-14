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
/* This class inherits Personality class then generates random value, overrides display and 
 calculate methods to obtain the result.*/
import java.util.Random;

public class LuckyNum extends Personality {

    int result2;
    Random random = new Random();
    int randomvalue = random.nextInt(10) + 2;

    @Override
    void display() {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Hi" + " " + super.getName().toUpperCase() + " " + "the number you've provided is" + " " + super.getNum() + " " + ",let's see what is in store for you");
        System.out.println("-----------------------------------------------------------------------------------");
    }

    @Override
    int calculate() {
        result2 = (super.getNum() * (super.getName().length()) + randomvalue);
        return result2;
    }

}

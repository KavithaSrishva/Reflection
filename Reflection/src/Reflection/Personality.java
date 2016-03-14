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
/* The following class has getter and setter methods, displays the details and calculates the value
 using the user given number and lenth of the name provided */
public class Personality {

    private int num;
    private String name;
    int result1;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Hi" + " " + name.toUpperCase() + " " + "the number you've provided is" + " " + num + " " + ",let's see what is in store for you");
        System.out.println("-----------------------------------------------------------------------------------");
    }

    int calculate() {
        result1 = (num * (name.length()));
        return result1;
    }
}

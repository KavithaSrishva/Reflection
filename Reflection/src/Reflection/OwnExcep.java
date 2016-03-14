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
/* The following class creates User defined exception*/
//import java.io.*;
public class OwnExcep extends Exception {

    int year;

    public OwnExcep(int year) {
        this.year = year;
    }

    public int getyear() {
        return year;
    }

}

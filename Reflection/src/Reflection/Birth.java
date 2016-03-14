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
/*This class obtains the date of birth and also displays the values */
public class Birth {

    private int day;
    private int month;
    private int year;

    Birth(int d, int mth, int y) {
        day = d;
        month = mth;
        year = y;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void showDate() {
        System.out.println(day + "/" + month + "/" + year + " isn't it :)\n");
    }

}

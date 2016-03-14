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
/*This class inherits zodiac class and displays the relevant result.
 It is called using reference variable of zodiac*/
public class Colour extends Zodiac {

    public Colour(Birth dob) {
        super(dob); // Kavitha ask ma'am 
    }

    @Override
    void zodiacMessage() {

        if (dob.getYear() == 1960 || dob.getYear() == 1972 || dob.getYear() == 1984 || dob.getYear() == 1996 || dob.getYear() == 2008) {
            System.out.println("Lucky Numbers:2, 3\n" + "Lucky Colors:gold, blue, green");
        } else if (dob.getYear() == 1961 || dob.getYear() == 1973 || dob.getYear() == 1985 || dob.getYear() == 1997 || dob.getYear() == 2009) {
            System.out.println("Lucky Numbers:1, 9\n" + "Lucky Colors:red, blue, purple");
        } else if (dob.getYear() == 1962 || dob.getYear() == 1974 || dob.getYear() == 1986 || dob.getYear() == 1998 || dob.getYear() == 2010) {
            System.out.println("Lucky Numbers:1, 3, 4\n" + "Lucky Colors:grey, blue, white, orange");
        } else if (dob.getYear() == 1963 || dob.getYear() == 1975 || dob.getYear() == 1987 || dob.getYear() == 1999 || dob.getYear() == 2011) {
            System.out.println("Lucky Numbers:3, 4, 9\n" + "Lucky Colors:red, blue, pink, purple");
        } else if (dob.getYear() == 1964 || dob.getYear() == 1976 || dob.getYear() == 1988 || dob.getYear() == 2000 || dob.getYear() == 2012) {
            System.out.println("Lucky Numbers:1, 6, 7\n" + "Lucky Colors:gold, silver, hoary");
        } else if (dob.getYear() == 1965 || dob.getYear() == 1977 || dob.getYear() == 1989 || dob.getYear() == 2001 || dob.getYear() == 2013) {
            System.out.println("Lucky Numbers:2, 8, 9\n" + "Lucky Colors:red, light yellow, black");
        } else if (dob.getYear() == 1966 || dob.getYear() == 1978 || dob.getYear() == 1990 || dob.getYear() == 2002 || dob.getYear() == 2014) {
            System.out.println("Lucky Numbers:2, 3, 7\n" + "Lucky Colors:brown, yellow, purple");
        } else if (dob.getYear() == 1967 || dob.getYear() == 1979 || dob.getYear() == 1991 || dob.getYear() == 2003 || dob.getYear() == 2015) {
            System.out.println("Lucky Numbers:3, 4, 9\n" + "Lucky Colors:green, red, purple");
        } else if (dob.getYear() == 1968 || dob.getYear() == 1980 || dob.getYear() == 1992 || dob.getYear() == 2004 || dob.getYear() == 2016) {
            System.out.println("Lucky Numbers:1, 7, 8\n" + "Lucky Colors:white, gold, blue");
        } else if (dob.getYear() == 1969 || dob.getYear() == 1981 || dob.getYear() == 1993 || dob.getYear() == 2005) {
            System.out.println("Lucky Numbers:5, 7, 8\n" + "Lucky Colors:gold, brown, yellow");
        } else if (dob.getYear() == 1970 || dob.getYear() == 1982 || dob.getYear() == 1994 || dob.getYear() == 2006) {
            System.out.println("Lucky Numbers:3, 4, 9\n" + "Lucky Colors:green, red, purple");
        } else if (dob.getYear() == 1971 || dob.getYear() == 1983 || dob.getYear() == 1995 || dob.getYear() == 2007) {
            System.out.println("Lucky Numbers:2, 5, 8\n" + "Lucky Colors:yellow, grey, brown, gold");
        }

    }
}

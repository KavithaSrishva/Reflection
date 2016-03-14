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
/* The following class uses composition and finds the zodiac sign of the user. 
 It also handles user defined exception*/
public class Zodiac {

    Birth dob;

    Zodiac(Birth dob) {
        this.dob = dob;
    }

    void details(String name) {
        System.out.println("               Hi " + name.toUpperCase() + " the given Date of Birth is");
        dob.showDate();
    }

    void zodiacMessage() throws OwnExcep {

        if (dob.getYear() == 1960 || dob.getYear() == 1972 || dob.getYear() == 1984 || dob.getYear() == 1996 || dob.getYear() == 2008) {
            System.out.println("Chinese Zodiac sign for given Birth Date is  Rat");
        } else if (dob.getYear() == 1961 || dob.getYear() == 1973 || dob.getYear() == 1985 || dob.getYear() == 1997 || dob.getYear() == 2009) {
            System.out.println("Chinese Zodiac sign for given Birth Date is  Ox");
        } else if (dob.getYear() == 1962 || dob.getYear() == 1974 || dob.getYear() == 1986 || dob.getYear() == 1998 || dob.getYear() == 2010) {
            System.out.println("Chinese Zodiac sign for given Birth Date is  Tiger");
        } else if (dob.getYear() == 1963 || dob.getYear() == 1975 || dob.getYear() == 1987 || dob.getYear() == 1999 || dob.getYear() == 2011) {
            System.out.println("Chinese Zodiac sign for given Birth Date Rabit");
        } else if (dob.getYear() == 1964 || dob.getYear() == 1976 || dob.getYear() == 1988 || dob.getYear() == 2000 || dob.getYear() == 2012) {
            System.out.println("Chinese Zodiac sign for given Birth Date Dragon");
        } else if (dob.getYear() == 1965 || dob.getYear() == 1977 || dob.getYear() == 1989 || dob.getYear() == 2001 || dob.getYear() == 2013) {
            System.out.println("Chinese Zodiac sign for given Birth Date is  Snake");
        } else if (dob.getYear() == 1966 || dob.getYear() == 1978 || dob.getYear() == 1990 || dob.getYear() == 2002 || dob.getYear() == 2014) {
            System.out.println("Chinese Zodiac sign for given Birth Date is  Horse");
        } else if (dob.getYear() == 1967 || dob.getYear() == 1979 || dob.getYear() == 1991 || dob.getYear() == 2003 || dob.getYear() == 2015) {
            System.out.println("Chinese Zodiac sign for given Birth Date is  Goat");
        } else if (dob.getYear() == 1968 || dob.getYear() == 1980 || dob.getYear() == 1992 || dob.getYear() == 2004 || dob.getYear() == 2016) {
            System.out.println("Chinese Zodiac sign for given Birth Date is  Monkey");
        } else if (dob.getYear() == 1969 || dob.getYear() == 1981 || dob.getYear() == 1993 || dob.getYear() == 2005) {
            System.out.println("Chinese Zodiac sign for given Birth Date is  Rooster");
        } else if (dob.getYear() == 1970 || dob.getYear() == 1982 || dob.getYear() == 1994 || dob.getYear() == 2006) {
            System.out.println("Chinese Zodiac sign for given Birth Date is  Dog");
        } else if (dob.getYear() == 1971 || dob.getYear() == 1983 || dob.getYear() == 1995 || dob.getYear() == 2007) {
            System.out.println("Chinese Zodiac sign for given Birth Date is  Pig");
        } else if (dob.getYear() < 1960 || dob.getYear() > 2016) {

            throw new OwnExcep(dob.getYear());
        }

                //System.out.println("Enter a valid year");
    }

}

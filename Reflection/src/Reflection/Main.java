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
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     * @throws Reflection.OwnExcep
     */
    /* The following project "Know about U!!" will be able to detect your personality, 
     find your lucky number and find your Chinese Zodiac sign */
    /*The main class handles try catch exception, throws with user defined exception, dynamic method dispatch
     parameterized constructors and methods passing the value*/
    public static void main(String[] args) throws OwnExcep {
        Scanner sc2 = new Scanner(System.in);
        String con = "yes";

        do {
            try {
                Scanner sc = new Scanner(System.in);

                PersonalityResults pr = new PersonalityResults();

                System.out.println("Choose 1 to know your Personality \n 2 to find your lucky number \n 3 to know your Chinese Zodiac sign");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        Personality pst = new Personality();
                        System.out.println("Choose a number from 0 to 9");
                        int num1 = sc.nextInt();
                        pst.setNum(num1);
                        System.out.println("Enter your name");
                        String name1 = sc2.next();
                        pst.setName(name1);
                        pst.display();
                        int result1 = pst.calculate();
                        pr.persona(result1);
                        break;
                    case 2:

                        LuckyNum ln = new LuckyNum();
                        System.out.println("Enter your favourite number");
                        int num2 = sc.nextInt();
                        ln.setNum(num2);
                        System.out.println("Enter your name");
                        String name2 = sc2.next();
                        ln.setName(name2);
                        ln.display();
                        int result2 = ln.calculate();
                        System.out.println("Cool!! Your lucky number is\n" + result2);

                        break;
                    case 3:
                        try {
                            System.out.println("Enter your name");
                            String name3 = sc2.next();
                            System.out.println("Enter your Date of birth in dd/mm/yyyy format");
                            int date = sc.nextInt();
                            int month = sc.nextInt();
                            int year = sc.nextInt();
                            if (date < 1 || date > 31 && month < 1 || month > 12) {
                                System.out.println("Hey " + name3.toUpperCase() + " please enter Valid date ");
                            } else {
                                Birth bd = new Birth(date, month, year);
                                Zodiac z = new Zodiac(bd);
                                Zodiac referenceVariable;
                                referenceVariable = z;
                                referenceVariable.details(name3);
                                System.out.println("----------------------------------------------------");
                                referenceVariable.zodiacMessage();
                                System.out.println("----------------------------------------------------");
                                Colour c = new Colour(bd);
                                referenceVariable = c;
                                referenceVariable.zodiacMessage();
                            }
                        } catch (OwnExcep ex) {
                            System.out.println("The given year " + ex.getyear() + " is an invalid year!! \n Please enter a valid year");
                        }
                        break;

                    default:
                        System.out.println("Invalid choice");

                }

            } catch (InputMismatchException ime) {
                System.out.println("Wrong input, Please enter a number.");
            }
            System.out.println("Enter Yes to continue and No to Exit");

            con = sc2.next();
        } while (con.equalsIgnoreCase("yes"));
    }

}

package com.company;
/**
 * This class is for game
 */

import java.util.Scanner;

public class PlayGame {
    /**
     * constructor with no parameter and will display a message that the game started
     */
    public PlayGame()
    {
        System.out.println("Play game started\n");
    }

    /**
     * Choose your own adventure game start
     */
    public static void StartGame()
    {

        String choice1, choice2, choice3 = null;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
            System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" " +
                    "or into the\n" + "\"kitchen\"?");
            choice1 = scanner.next();
        } while(!choice1.equalsIgnoreCase("kitchen") && !choice1.equalsIgnoreCase("upstairs"));

        if (choice1.equalsIgnoreCase("kitchen")) {
            do {
                System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side\n" +
                        "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
                        "or look in a \"cabinet\".");
                choice2 = scanner.next();
            } while (!choice2.equalsIgnoreCase("refrigerator") && !choice2.equalsIgnoreCase("cabinet"));
            //System.out.println(choice2);
            if (choice2.equalsIgnoreCase("cabinet")) {
                do {
                    System.out.println("Inside the cabinet you see a container. It looks pretty old.\n" +
                            "Would you like to open it? (\"yes\" or \"no\")");
                    choice3 = scanner.next();
                } while (!choice3.equalsIgnoreCase("yes") && !choice3.equalsIgnoreCase("no"));

                if (choice3.equalsIgnoreCase("yes")) {
                    System.out.println("You will get very precious treasure.\n");
                } else {
                    System.out.println("You will be very curious on what is in the container.\n");
                }
            } else {
                do {
                    System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                            "Would you like to eat some of the food? (\"yes\" or \"no\")");
                    choice3 = scanner.next();
                } while (!choice3.equalsIgnoreCase("yes") && !choice3.equalsIgnoreCase("no"));
                if (choice3.equalsIgnoreCase("yes") || choice3.equalsIgnoreCase("no")) {
                    if (choice3.equalsIgnoreCase("yes")) {
                        System.out.println("You will get very delicious new food.\n");
                    } else {
                        System.out.println("You die of starvation... eventually\n.");
                    }
                }
            }
        }
        //upstairs
        else
        {
            do {
                System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n"+
                        "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n"+
                        "to go?");
                choice2 = scanner.next();
            }while(!choice2.equalsIgnoreCase("bedroom") && !choice2.equalsIgnoreCase("bathroom"));
            //System.out.println(choice2);
            if (choice2.equalsIgnoreCase("bedroom"))
            {
                do {
                    System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n"+
                            "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n"+
                            "like to open the door? (\"yes\" or \"no\")");
                    choice3 = scanner.next();
                }while(!choice3.equalsIgnoreCase("yes") && !choice3.equalsIgnoreCase("no"));
                if (choice3.equalsIgnoreCase("yes")) {
                    System.out.println("You will meet someone who lived there long time ago\n");
                } else {
                    System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\n" +
                            "I'm tired of making nested if statements.\n");
                }
            }
            else
            {
                do {
                    System.out.println("You are in creepy bathroom, with a unique mirror on the wall. \nWould you "+
                            "like to look at the mirror? (\"yes\" or \"no\")");
                    choice3 = scanner.next();
                }while(!choice3.equalsIgnoreCase("yes") && !choice3.equalsIgnoreCase("no"));
                if (choice3.equalsIgnoreCase("yes")) {
                    System.out.println("You will meet a ghost behind you.\n");
                } else  {
                    System.out.println("You can get some gold coins inside the toilet.\n");
                }
            }
        }
    }
}

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static String input;
    private static String output = "";
    private static Hedges hedges = new Hedges();
    private static Qualifiers qualifiers = new Qualifiers();

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geed day. What is your problem?");
        System.out.println("Enter your response here or Q to quit: ");
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        input=buf.readLine();


        while (!input.equalsIgnoreCase("q")) {

            if (input.contains("play game"))
            {
                PlayGame playGame=new PlayGame();
                playGame.StartGame();
            }
            else
            {
                ElizaResponse eliza = new ElizaResponse(input);
                output=eliza.MakeOutput();
                System.out.println(output);
            }

            final String ANSI_BLACK = "\u001B[30m";
            System.out.println(ANSI_BLACK+"Enter your response here or Q to quit: ");
            buf = new BufferedReader(new InputStreamReader(System.in));
            input=buf.readLine();
        }
    }
}

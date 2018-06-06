package com.company;

import java.util.*;

/**
 * to make a message according to the user input
 */
public class ElizaResponse {

    public static String input;
    public static String output="";
    public static String message;
    private static Hedges hedges = new Hedges();
    private static Qualifiers qualifiers = new Qualifiers();
    private static HashMap<String, String> hmap = new HashMap<String, String>();

    /**
     * constructor with no parameter
     * It will put values to HashMap
     * key value is the word to be replaced and the value of Map is the word to replace with
     */
    public ElizaResponse() {
        hmap.put("I", "you");
        hmap.put("my", "your");
        hmap.put("me", "you");
        hmap.put("am", "are");
    }
    /**
     * constructor with String input
     * It will put values to HashMap
     * key value is the word to be replaced and the value of Map is the word to replace with
     */
    public ElizaResponse(String input) {
        hmap.put("I", "you");
        hmap.put("my", "your");
        hmap.put("me", "you");
        hmap.put("am", "are");
        this.input = input;
    }

    /**
     * make message for display in main
     * @return String message
     */
    public static String MakeOutput() {
        String[] splited = input.split(" ");
        Iterator it = hmap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();

            if (Arrays.asList(splited).contains(pair.getKey().toString())) {
                int index = Arrays.asList(splited).indexOf(pair.getKey().toString());
                splited[index] = pair.getValue().toString();
            }
        }
        for (int i = 0; i < splited.length; i++) {
            output = output + " " + splited[i];
        }

        if (output.contains("pig")) {
            output = output.replaceAll("pig", "porcus");
        }
        Random rand = new Random();
        int x = rand.nextInt(2);
        switch (x) {
            case 0:
                int i = rand.nextInt(3);
                if (output.contains("caps") && !output.contains("red")) {
                    message= hedges.sendMessge(i).toUpperCase();

                } else if (output.contains("red") && !output.contains("caps")) {
                    final String ANSI_RED = "\u001B[31m";
                    message= ANSI_RED + hedges.sendMessge(i);
                    // System.out.println("2");
                } else if (output.contains("caps") && output.contains("red")) {
                    final String ANSI_RED = "\u001B[31m";
                    message= ANSI_RED + hedges.sendMessge(i).toUpperCase();
                    //System.out.println("3");
                } else {
                    message= hedges.sendMessge(i);
                    //System.out.println("4");
                }
                output = "";
                break;
            case 1:
                int n = rand.nextInt(3);
                if (output.contains("caps") && !output.contains("red")) {
                    message= qualifiers.sendMessge(n).toUpperCase() + output.toUpperCase();
                    //System.out.println("5");
                } else if (output.contains("red") && !output.contains("caps")) {
                    final String ANSI_RED = "\u001B[31m";
                    message= ANSI_RED + qualifiers.sendMessge(n) + output;
                    //System.out.println("6");
                } else if (output.contains("caps") && output.contains("red")) {
                    final String ANSI_RED = "\u001B[31m";
                    message= ANSI_RED + qualifiers.sendMessge(n).toUpperCase() + output.toUpperCase();
                    //System.out.println("7");
                } else {
                    message= qualifiers.sendMessge(n) + output;
                    //System.out.println("8");
                }
                output = "";
                break;
        }

        return message;

    }
}


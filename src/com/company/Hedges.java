package com.company;

import java.util.ArrayList;

public class Hedges {
    /**
     * constructor with no parameter
     */
    public Hedges()
    {
        AddHedge();
    }
    private static ArrayList<String> hedges = new ArrayList<>();

    public static void AddHedge()
    {
        hedges.add("Please tell me more");
        hedges.add("Many of my patients tell me the same thing");
        hedges.add("It is getting late, maybe we had better quit");
    }

    public static String sendMessge(int i)
    {
        return hedges.get(i);
    }

}

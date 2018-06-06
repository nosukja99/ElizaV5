package com.company;

import java.util.ArrayList;

public class Qualifiers {
    /**
     * constructor with no parameter
     */
    public Qualifiers()
    {
        AddQualifiers();
    }
    private static ArrayList<String> qualifiers = new ArrayList<>();

    public static void AddQualifiers()
    {
        qualifiers.add("Why do you say that");
        qualifiers.add("You seem to think that");
        qualifiers.add("So, you are concerned that");
    }

    public static String sendMessge(int i)
    {
        return qualifiers.get(i);
    }
}

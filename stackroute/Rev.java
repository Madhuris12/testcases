package com.stackroute;


public class Rev {

    public String reverseStr()
    {
        String str = "Madhuri";
        String rev = "";

        int len = str.length();


        for (int i = len - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        return rev;
    }
}


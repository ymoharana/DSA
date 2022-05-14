package com.yudhi;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        String patternGroup = "(?<words>\\w+)(?<digits>\\d+)";
       Pattern pattern =  Pattern.compile(patternGroup);
        Matcher matcher = pattern.matcher("This is India");
        boolean find = true;
        if(matcher.matches()){
            String s = matcher.group("words");
            System.out.println(s);
        }


    }

}

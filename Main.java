package com.metanit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

    public static void main(String[] args) {
        String str = "Jane hurried to the bargain sale intending to buy some cheap and nice garments: shirts, skirts, and breeches";
        String regexp = "([a-z]+)";
        StringBuilder rezult = new StringBuilder();

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            rezult.append(str.substring(matcher.end() - 1, matcher.end()));
        }

        System.out.println(rezult);
    }
}

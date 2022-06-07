package com.epam.training.iaroslav_bulimov.module_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        if (color == null) {
            return false;
        } else {
            String regex = "^#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(color);
            return matcher.matches();
        }

    }
}

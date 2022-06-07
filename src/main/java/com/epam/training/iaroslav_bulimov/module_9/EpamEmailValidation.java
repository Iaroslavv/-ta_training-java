package com.epam.training.iaroslav_bulimov.module_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {
        if (email == null) {
            return false;
        } else {
            String regex = "(\\w{1,}_\\w{1,})@epam.com";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
    }
}

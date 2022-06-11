package com.epam.training.iaroslav_bulimov.module_15;

import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        OptionalInt optionalInt;
        if (values != null && values.length > 0) {
            int maximum = values[0];
            for (int i = 1; i < values.length; i ++) {
                if (values[i] > maximum) {
                    maximum = values[i];
                }
            }
            optionalInt = OptionalInt.of(maximum);
        } else {
            optionalInt = OptionalInt.empty();
        }
        return optionalInt;
    }

    public static void main (String[]args){
        int[] vals = new int[]{-2, 0, 10, 5};
        int[] nullValue = null;
        OptionalInt result = MaxMethod.max(vals);
//            OptionalInt result = MaxMethod.max(nullValue);
        System.out.println(result.getAsInt() == 10); // true
    }
}


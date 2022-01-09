package ru.clevertec.task;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {

        if(isNumeric(str)) {
            return Long.parseLong(str) > 0;
        }

        return false;
    }
}

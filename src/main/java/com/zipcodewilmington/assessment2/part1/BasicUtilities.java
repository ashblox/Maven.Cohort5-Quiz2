package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        boolean isGreaterThan5 = false;
        if (value >= 5) {
            isGreaterThan5 = true;
        }
        return isGreaterThan5;
    }

    public Boolean isLessThan7(Integer value) {
        boolean isLessThan7 = false;
        if (value <= 7) {
            isLessThan7 = true;
        }
        return isLessThan7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        boolean isBetween5And7 = false;
        if (valueToEvaluate >= 5 && valueToEvaluate <=7) {
            isBetween5And7 = true;
        }
        return isBetween5And7;
    }

    public Boolean startsWith(String string, Character character) {
        String converted = "" + character;
        converted = converted.toLowerCase();
        if (string.toLowerCase().charAt(0) == converted.charAt(0)) {
            return true;
        } else {
            return false;
        }
    }
}

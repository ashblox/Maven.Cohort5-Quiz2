package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        return value >= 5;
    }

    public Boolean isLessThan7(Integer value) {
        return value <= 7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        return valueToEvaluate <= 7 && valueToEvaluate >=5;
    }

    public Boolean startsWith(String string, Character character) {
        String converted = "" + character;
        converted = converted.toLowerCase();
        return string.toLowerCase().charAt(0) == converted.charAt(0);
    }
}

package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if (array.length % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Integer[] range(int start, int stop) {
        int length = stop - start;
        if (length > 0) {
            Integer[] range = new Integer[length + 1];
            for (int i = 0; i < range.length; i++) {
                range[i] = start++;
            }
            return range;
        } else {
            return null;
        }
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[0] * array[1];
    }
}

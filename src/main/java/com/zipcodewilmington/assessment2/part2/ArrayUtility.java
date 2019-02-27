package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer [] merged = new Integer[array1.length + array2.length];
        for (int i = 0; i < array1.length ; i++) {
            merged[i] = array1[i];
        }
        int indexOfArr2 = 0;
        for (int j = array1.length; j < merged.length; j++) {
            merged[j] = array2[indexOfArr2];
            indexOfArr2++;
        }
        return merged;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] rotated = new Integer[array.length];
        int newIndex1 = index;
        for (int i = 0; i < array.length - index; i++) {
            rotated[i] = array[index];
            newIndex1++;
        }
        int newIndex2 = 0;
        for (int j = index - 1; j < array.length; j++) {
            rotated[j] = array[newIndex2];
            newIndex2++;
        }
        return rotated;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == valueToEvaluate) {
                count++;
            }
        }
        for (int j = 0; j < array2.length; j++) {
            if (array2[j] == valueToEvaluate) {
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (frequencies.containsKey(array[i])) {
                Integer value = frequencies.get(array[i]);
                value++;
                frequencies.put(array[i], value);
            } else {
                frequencies.put(array[i], 1);
            }
        }
        Integer mostCommon = null;
        for (Map.Entry<Integer, Integer> entry: frequencies.entrySet()) {
            if (mostCommon == null || mostCommon < entry.getKey()) {
                mostCommon = entry.getKey();
            }
        }
        return mostCommon;
    }
}

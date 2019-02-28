package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ArrayUtility {

    public Integer[] merge(Integer[] array1, Integer[] array2) {
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(array1));
        arr1.addAll(Arrays.asList(array2));
        Integer[] merged = new Integer[arr1.size()];
        return arr1.toArray(merged);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] arr1 = Arrays.copyOfRange(array, 0, index);
        Integer[] arr2 = Arrays.copyOfRange(array, index, array.length);
        return merge(arr2, arr1);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer freqInArr1 = Collections.frequency(Arrays.asList(array1), valueToEvaluate);
        Integer freqInArr2 = Collections.frequency(Arrays.asList(array2), valueToEvaluate);
        return freqInArr1 + freqInArr2;
    }

    public Integer mostCommon(Integer[] array) {
        Integer occurrences = null;
        Integer mostCommon = null;
        for (int i = 0; i < array.length; i++) {
            Integer frequency = Collections.frequency(Arrays.asList(array), array[i]);
            if (occurrences == null || occurrences < frequency) {
                occurrences = frequency;
                mostCommon = array[i];
            }
        }
        return mostCommon;
    }
}

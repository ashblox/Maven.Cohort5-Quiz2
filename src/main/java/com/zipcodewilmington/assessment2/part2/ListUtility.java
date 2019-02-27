package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ListUtility {
    List<Integer> list = new ArrayList<>();

    public Boolean add(int i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> unique = new HashSet<>();
        for (Integer entry: list) {
            unique.add(entry);
        }
        List<Integer> modified = new ArrayList<>();
        for (Integer entry: unique) {
            modified.add(entry);
        }
        return modified;
    }

    public String join() {
       String concat = "";
        for (int i = 0; i < list.size(); i++) {
            concat += Integer.toString(list.get(i)) + ", ";

        }
        concat = concat.substring(0, concat.length()-2);
        return concat;
    }

    public Integer mostCommon() {
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (frequencies.containsKey(list.get(i))) {
                Integer value = frequencies.get(list.get(i));
                value++;
                frequencies.put(list.get(i), value);
            } else {
                frequencies.put(list.get(i), 1);
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

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}

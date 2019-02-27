package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    public int compare (Animal animal1, Animal animal2) {
        Integer animal1Speed = new Integer(animal1.getSpeed());
        Integer animal2Speed = new Integer(animal2.getSpeed());
        return animal2Speed.compareTo(animal1Speed);
    }
}

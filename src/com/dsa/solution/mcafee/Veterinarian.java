package com.dsa.solution.mcafee;

import java.util.LinkedList;
import java.util.Queue;

public class Veterinarian {
    Queue<String> pets = new LinkedList<String>();

    public void accept(String petName) {
        //  throw new UnsupportedOperationException("Waiting to be implemented.");
        pets.add(petName);
    }

    public String heal() {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        while (!pets.isEmpty()) {
            return pets.remove();
        }
        return null;
    }

    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.accept("Barkley");
        veterinarian.accept("Mittens");
        System.out.println(veterinarian.heal());
        System.out.println(veterinarian.heal());
    }
}
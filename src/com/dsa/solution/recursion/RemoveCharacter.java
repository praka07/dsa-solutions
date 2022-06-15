package com.dsa.solution.recursion;

// remove character a from given string
public class RemoveCharacter {
    public static void main(String[] args) {

        String input = "abcadefa";
        System.out.println(removeCharacter(input, 0));

    }

    private static StringBuilder removeCharacter(String input, int index) {
        StringBuilder sb = new StringBuilder();
        if (input.length() == index) {
            return sb;
        }
        if (input.charAt(index) != 'a') {
            sb.append(input.charAt(index));
        }
        StringBuilder returnValue = removeCharacter(input, index + 1);
       // System.out.println("returned " + returnValue);
        return sb.append(returnValue);

    }

}

package com.exampleCusomArrayList.www;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        numbers = removeElementByIndex(numbers, 2);
    }

    // TODO HOMEWORK!

    // TODO: update

    // TODO:  read some amount of elements, if user want to read elements from 3 to 6

    // TODO: Push / add item to array

    static int[] removeElementByIndex(int[] arrayOfNumbers, int indexToDelete) {
        int[] updatedArray = new int[arrayOfNumbers.length - 1];

        for(int i = 0, j = 0; i < arrayOfNumbers.length; i++) {
            if(i == indexToDelete) continue;

            updatedArray[j++] = arrayOfNumbers[i];

        }

        System.out.println(Arrays.toString(updatedArray));

        return updatedArray;
    }
}

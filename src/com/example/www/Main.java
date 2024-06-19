package com.example.www;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println("Here is all alright!");
//        System.out.println("HERE IS MY OWN METHOD WHICH WILL RETURN FOR US FN : " + getFavoriteNumber());

        // Arrays - fixed sizes
        // To create an array use : {0 : "Cup", 1: "Cola"}
        String[] store = {"Cup", "Cola", "Pepsi"};
        double[] prices = {3.14, 23.23, 13.13};

        // TO get indexes data []
        System.out.println("Pepsi: " + store[2]);

        String[] cart = new String[3];
        double[] amount = {1, 3, 23};

        String[] newStore = addNewItem(store, "Fish");
        System.out.println(Arrays.toString(store));
        System.out.println(Arrays.toString(newStore));

        // There is a method which allows us to see items of the array.
        // System.out.println(Arrays.toString(store));

    }
    public static String[] addNewItem(String[] arr,String newItem) {
        String[] newArray = Arrays.copyOf(arr, arr.length + 1);
        newArray[newArray.length - 1] = newItem;

        return newArray;
    }

    public static int getFavoriteNumber() {
        return 13;
    }
}
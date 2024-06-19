package com.exampleArrayList.www;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Empty []
        ArrayList<String> students = new ArrayList<String>();
        // add
        students.add("Hanna");
        students.add("John");
        students.add("Maria");
        students.add(1,"Angelina");

        // remove
        students.remove(students.size() - 1);
        students.remove("John");

        // Read
        System.out.println(students.get(1));

        // update
        students.add("John");
        students.set(students.size() - 1, "Maria");

        // indexOf - find element
        int index = students.indexOf("Maria");
        students.remove(index);
        System.out.println(index);

        int i = 0;
        // if you are not interested in indexes you are able to use forEach
        for(String student : students) {
            System.out.println("[student]: " + (i+1) + ")" + student);
            i++;
        }

        System.out.println(students);
    }
}

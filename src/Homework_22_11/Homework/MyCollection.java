package Homework_22_11.Homework;

import Homework_31_10.ContractEmployee;
import Homework_31_10.Employee;
import Homework_31_10.SalariedEmployee;

import java.util.*;

public class MyCollection {

    static int position2 = 2;
    static int position8 = 8;
    static int position5 = 5;

    static int value1 = 1;
    static int value2 = -3;
    static int value3 = -4;

    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNum = (int) (Math.random() * 40);
            myCollection.add(randomNum);
        }
        System.out.println("My Collection = "+myCollection);

        ArrayList<Integer> newCollection = returnValue1(myCollection);
        System.out.println("more 5 = " + newCollection);

        ArrayList<Integer> less20Collection = returnValue(myCollection);
        System.out.println("less 20 = " + less20Collection);

        ArrayList<Integer> insertCollection = insertElement(newCollection);
        System.out.println("insert Element  = " + insertCollection);

        insertCollection.sort(Integer::compareTo);
        System.out.println("Sort = "+ insertCollection);


    }

    static ArrayList<Integer> returnValue1(ArrayList<Integer> myCollection) {
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) <= 5) {                          //more than 5
                // System.out.print(myCollection.get(i)+" ");
                myCollection.remove(myCollection.get(i));
            }
        }
        return myCollection;
    }

    static ArrayList<Integer> returnValue(ArrayList<Integer> myCollection) {
        for (int j = 0; j < myCollection.size(); j++) {
            if (myCollection.get(j) > 20) {                          //more than 5
                myCollection.remove(j);
            }
        }
        return myCollection;
    }

    static ArrayList<Integer> insertElement(ArrayList<Integer> myCollection) {
        if (myCollection.size() >= 2) {
            myCollection.set(position2-1, value1);
        }  if (myCollection.size() >= 5) {
            myCollection.set(position5-1, value3);
        }  if (myCollection.size() >= 8) {
            myCollection.set(position8-1, value2);
        }
        return myCollection;
    }

}

/*
Step 1: array=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9] index = 0 array[index] = 0
        Удаляется 0.
        Step 2: array=[1, 2, 3, 4, 5, 6, 7, 8, 9] index = 1 array[index] = 2
        Удаляется 2.
        Step 3: array=[1, 3, 4, 5, 6, 7, 8, 9] index = 2 array[index] = 4
        Удаляется 4.*/

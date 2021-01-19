package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        int num = 5;
        //primitive type= class, kept on stack
        // if left blank - 0
        Integer number = 5;
        //object cannot be changed, can be reset using number=7; which is new reference
        //but not to change it in the heap
        //kept on the heap
        //reference type blank - null
        String s = number.toString(); //s will now be string 5

        List<Integer> myList;

        myList = new ArrayList<Integer>();


        List<Double> myOtherList = new ArrayList<Double>();
        //created as one line


        myList.add(5);
        myList.add(10);
        myList.add(2);
        myList.add(99);

        for (int i=0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }



        //for each can only print value of all, can't skip
        for (int value : myList){
            System.out.println(value);
        }
            //: is like saying value of



    }
}

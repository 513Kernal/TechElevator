package com.techelevator;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        //make a list of integers

        List<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(10);
        numbers.add(10);
        numbers.add(4096);
        numbers.add(110);
        numbers.add(220);
        numbers.add(926);

        System.out.println(numbers);

        for (int number : numbers){
            System.out.println(number);
        }

        //Set<Integer> moreNumbers = new HashSet<>();   // no obvious order
        //Set<Integer> moreNumbers = new LinkedHashSet<>();   in order of entered
        Set<Integer> moreNumbers = new TreeSet<>();  //sorting them in numerical order
        moreNumbers.add(12);
        moreNumbers.add(10);
        moreNumbers.add(10);
        moreNumbers.add(4096);
        moreNumbers.add(110);
        moreNumbers.add(220);
        moreNumbers.add(926);
        System.out.println(moreNumbers);

        for (int number : moreNumbers){
            System.out.println(number);
        }

        Map<String, String> studentClass = new HashMap<>();
        studentClass.put("Kris", "Java");
        studentClass.put("Austin", "Java");
        studentClass.put("Wesley", ".Net");

        System.out.println(studentClass);





    }
}

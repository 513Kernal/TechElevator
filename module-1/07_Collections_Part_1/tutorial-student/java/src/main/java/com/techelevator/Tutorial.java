package com.techelevator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Tutorial {
	
    public static void main(String[] args) {

    	// Step One: Declare a List
       List<String> myList = new ArrayList<String>();

    	
    	// Step Two: Add values to a List

        myList.add("Ada");
        myList.add("Grace");
        myList.add("Margaret");
        myList.add("Adele");

    	
    	// Step Three: Looping through a List in a for loop

        for (int i=0; i< myList.size(); i++){
            System.out.println("The name at index " + i + " is " + myList.get(i));
        }

    	
    	// Step Four: Remove an item

        myList.remove("Ada");

    	
    	// Step Five: Looping through List in a for-each loop

        for (String name : myList) {
            System.out.println("Name: " + name);
        }

    }

}

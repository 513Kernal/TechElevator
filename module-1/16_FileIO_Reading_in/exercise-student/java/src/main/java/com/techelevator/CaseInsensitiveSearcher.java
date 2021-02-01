package com.techelevator;


public class CaseInsensitiveSearcher {

    public boolean checkingCase(String line, String word){
    boolean result = false;
    String allLowerCase = word.toLowerCase();
    String firstLetterCapital = word.substring(0,1).toUpperCase()
            + allLowerCase.substring(1);
    if(line.contains(allLowerCase) || line.contains(firstLetterCapital)){
        result = true;
    }
        return result;
    }
}



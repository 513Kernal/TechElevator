package com.techelevator;

import java.util.*;

public class Lecture {

    //1. removeDuplicates([1,2,1,1,2,1,2]) -> [1,2] or [2,1]
    public List<Integer> removeDuplicates(List<Integer> input) {
        Set<Integer> noDuplicates = new HashSet<>(input);
        List<Integer> output = new ArrayList<>(noDuplicates);

        return output;
    }

    //2. musicalGroupNames() -> {2="duo",3="trio",4="quartet"}
    public Map<Integer,String> musicalGroupNames() {
        Map<Integer, String> musicNames = new HashMap<>();
        musicNames.put(2, "duo");
        musicNames.put(3, "trio");
        musicNames.put(4, "quartet");

        return musicNames;
    }

    //3. coinValues() -> {"penny"=1,"nickel"=5,"dime"=10,"quarter"=25}
    public Map<String,Integer> coinValues() {
        Map<String, Integer> coinOutput = new HashMap<>();
        coinOutput.put("penny", 1);
        coinOutput.put("nickel", 5);
        coinOutput.put("dime", 10);
        coinOutput.put("quarter", 25);

        return coinOutput;
    }

    //4. describeGroup(3, "violin") -> "violin trio"
    //   describeGroup(0, "trumpet") -> "trumpet group"
    public String describeGroup(int count, String instrument) {
        Map<Integer, String> groups =  musicalGroupNames();//get the map we created in #2
        String result = instrument + " ";  // start creating result string with instrument name and space
        if (groups.containsKey(count)){ //check is map contains key for specified name for instruments
            result = result + groups.get(count); //if there is special group name, concatenate to result
        } else {
            result = result + "group"; //otherwise just concatenate group onto result
        }

        return result;
    }

    //5. totalCents({"nickel","quarter","penny","penny"}) -> 32
    public int totalCents(String[] coins) {
        Map<String, Integer> values = coinValues();
        int total = 0;
        for (String coin : coins){
            int value = values.get(coin);
            total += value;
        }


        return total;
    }

    //6. validCoin("dime") -> "valid"
    //   validCoin("token") -> "invalid"
    public String validCoin(String coin) {
        Map<String, Integer> validate = coinValues();
        String result = "invalid";
        if (validate.containsKey(coin)){
            result = "valid";
        }

        return result;
    }

    //7. stateNames({"Ohio"="Columbus","Kentucky"="Frankfort","Indiana"="Indianapolis"})
    //             -> ["Ohio","Kentucky","Indianapolis"]
    // use keyset
    public List<String> stateNames(Map<String,String> capitals) {
        Set<String> stateSet = capitals.keySet();
        List<String> result = new ArrayList<>(stateSet);

        return result;
    }

    //8. availableColors({"red"=true,"blue"=false,"green"=true,"yellow"=true,"gray"=false})
    //                  -> ["red","green","yellow"]
    public List<String> availableColors(Map<String,Boolean> availability) {
        List<String> colors = new ArrayList<>();
        //Set<Map.Entry<String, Boolean>> allEntries = availability.entrySet();    LONG WAY
        for (Map.Entry<String,Boolean> entry : availability.entrySet()){
            if (entry.getValue() == true){
                colors.add(entry.getKey());
            }
        }

        return colors;
    }

    //9. addBonus({"Player 1"=5000,"Player 2"=2500,"Player 3"=4500}, 500)
    //         -> {"Player 1"=5500,"Player 2"=3000,"Player 3"=5000}
    public void addBonus(Map<String,Integer> scores, int bonus) {
        for (Map.Entry<String, Integer> entry : scores.entrySet()){
            //String playerName = entry.getKey();//this is available but not used in this syntax
            int score = entry.getValue();
            score += bonus;
            entry.setValue(score);
        }


    }

    //10. Modify and return the given map as follows: for this problem the map may or may not contain the
    //    "a" and "b" keys. If both keys are present, append their 2 string values together and store the
    //    result under the key "ab".
    //    mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
    //    mapAB({"a": "Hi"}) → {"a": "Hi"}
    //    mapAB({"b": "There"}) → {"b": "There"}

    //NO LOOP NEEDED

    public Map<String, String> mapAB(Map<String,String> input) {

        if(input.containsKey("a") && input.containsKey("b")){
            String combinedValue = input.get("a") + input.get("b");
            input.put("ab", combinedValue);  //this combines the inputs into a combined value
        }


        return input;
    }

}

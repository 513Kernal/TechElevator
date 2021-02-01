package com.techelevator;


import java.nio.file.Path;
import java.util.Scanner;

public class WordSearch {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the fully qualified name of the file that should be searched? ");
        String filename = scan.nextLine();
        Path path = Path.of(filename);
        System.out.println("What is the search word you are looking for?");
        String word = scan.nextLine();
        System.out.println("Should the search be case sensitive (Y\\N)");
        String YorN = scan.nextLine();

        boolean isCaseSensitive = false;
        if(YorN.equals("Y")){
            isCaseSensitive = true;
        }

        CaseInsensitiveSearcher sneeze = new CaseInsensitiveSearcher();

        try (Scanner scan1 = new Scanner(path)){
            int lineNumber = 1;
            while (scan1.hasNextLine()){
                String line = scan1.nextLine();
                if (line.contains(word) && isCaseSensitive){
                    System.out.println(lineNumber + ") " + line);
                }else if (sneeze.checkingCase(line, word) && !isCaseSensitive){
                    System.out.println(lineNumber + ") " + line);
                }
                lineNumber++;
            }


        } catch (Exception e){
            System.out.println("ERROR");
        }
    }


}
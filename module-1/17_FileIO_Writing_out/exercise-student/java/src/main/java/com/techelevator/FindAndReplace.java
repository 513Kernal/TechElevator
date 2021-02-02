package com.techelevator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is the search word?: ");
        String inputWord = userInput.nextLine();

        System.out.println("What is the replacement word?: ");
        String replacementWord = userInput.nextLine();

        System.out.println("What is the source file?: ");
        String sourceFile = userInput.nextLine();

        System.out.println("What is the destination file?: ");
        String destFile = userInput.nextLine();

        Path source = Path.of(sourceFile);
        try (Scanner sourceScanner = new Scanner(source)) {
            try (PrintWriter destinationWriter = new PrintWriter(destFile)) {
                while (sourceScanner.hasNextLine()){
                    String line = sourceScanner.nextLine();  //reads the line
                    if(line.contains(inputWord)){
                        String replace = line.replaceAll(inputWord, replacementWord);
                        destinationWriter.println(replace);
                    } else {
                        destinationWriter.println(line);
                    }
                }

            }catch (FileNotFoundException e) {
                System.out.println("Output file could not be written to!! ");
            }
        } catch (IOException e) {
            System.out.println("Couldn't read from the input file!!");
        }

    }
}






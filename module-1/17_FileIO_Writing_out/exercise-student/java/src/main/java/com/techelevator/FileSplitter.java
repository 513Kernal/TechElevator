package com.techelevator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSplitter {

    public static void main(String[] args) {

        //take input file
        //split into smaller chunks
        // first ask user how many


        Scanner userInput = new Scanner(System.in);

        System.out.println("Where is the input file? ");
        String sourceFile = userInput.nextLine();

        System.out.println("How many lines of text (max) should there be in the split files? ");
        String lineAmounts = userInput.nextLine();
        int userLineAmount = Integer.parseInt(lineAmounts);

        int count = 0;
        List<String> linesFromInput = new ArrayList<>();

        Path source = Path.of(sourceFile);
        try (Scanner sourceScanner = new Scanner(source)) {
            while (sourceScanner.hasNextLine()) {
                linesFromInput.add(sourceScanner.nextLine());
                count++;
            }
        }catch (IOException e){
            System.out.println("This did not work. ");
        }
        int totalNumberOfLines = linesFromInput.size();
        System.out.println("The input file has " +totalNumberOfLines + " lines of text.");

    int numberFiles = totalNumberOfLines % userLineAmount == 0 ? totalNumberOfLines/userLineAmount : ((totalNumberOfLines/userLineAmount) + 1);

    System.out.println("For a " + totalNumberOfLines + " line input file \"" + sourceFile + "\", this produces " + numberFiles + " output files. ");
    System.out.println("\n**GENERATING OUTPUT**\n");


    String[] fileNameParts = sourceFile.split("\\.");


    for (int i = 1; i <= numberFiles; i++){
        String sourceFileName = fileNameParts[0] + "-" + i + "." + fileNameParts[1];
        try (PrintWriter destWriter = new PrintWriter(sourceFileName)){
            System.out.println("Generating " +sourceFileName);

            try{
                for (int xmen = 0; xmen < userLineAmount; xmen++){
                    destWriter.println(linesFromInput.remove(0));
                }
            }catch (IndexOutOfBoundsException e) {
                break;
            }


        }catch (FileNotFoundException e){
            System.out.println("File was not found");
        }



//        int fileNumberCount = 1;
//
//        Path source = Path.of(sourceFile);
//        try (Scanner sourceScanner = new Scanner(source)) {
//            while (sourceScanner.hasNextLine()) {
//                String line =sourceScanner.nextLine();
//
//
//        } catch (IOException e) {
//            System.out.println("This did not work :/");
        }
        System.out.println("Thanks for using the file splitter");
    }

}
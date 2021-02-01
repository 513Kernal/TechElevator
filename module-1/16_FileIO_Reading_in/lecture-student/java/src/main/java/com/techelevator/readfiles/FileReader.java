package com.techelevator.readfiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) {
        //Two ways to represent a file:
        File myFile = new File("input.txt"); //Older style, can convert to Path with .toPath()
        Path myPath = Path.of("input.txt");    //Newer style, can convert to File with .toFile()

        //mypath is the new way to do it, n(new)io shows that. default to this
        //file may be ran into when running into old code

        try (Scanner fileScanner = new Scanner(myPath)){
            //Scanner fileScanner = new Scanner(myPath);
            while (fileScanner.hasNextLine()){
                String s = fileScanner.nextLine();
                System.out.println(s);
            }

           // fileScanner.close(); old way and isn't needed when you follow line 18's try with
            // resources code
        } catch (IOException e) {
            //this would catch files not named above ex input.txt changed to
            //input1 would throw the error below
            System.out.println("Can't read from that file!");
        }



    }
}

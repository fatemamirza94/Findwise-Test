package com;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TfIdfMain {
    
    /**
     * Main method
     * @param args
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        DocumentParser dp = new DocumentParser();
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter a file path: ");  
        String fileP= sc.nextLine();              //reads string   
        System.out.print("You have entered the filepath: "+fileP); //enter the filepath 
        dp.parseFiles(fileP);
        System.out.println();
        dp.tfIdfCalculator(); //calculates tfidf
        dp.getCosineSimilarity(); //calculated cosine similarity   
    }
}


// C:\\Users\\GL62M\\eclipse-workspace\\Findwise-Test\\src\\com\\test-docs
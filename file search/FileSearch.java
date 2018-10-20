/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesearch;
import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hamad
 */
public class FileSearch {
 
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int numberOfMatches=0;
        System.out.println("Enter the file name ..");
        Scanner getName=new Scanner(System.in);
            String fileName=getName.nextLine();
        System.out.println("Enter the word its duplicate to be printed ");
        Scanner getWord=new Scanner(System.in);
        String word=getWord.nextLine();
        System.out.println("enter the word to be replaced with");
                Scanner replaceWith=new Scanner(System.in);
                String replaceWord=replaceWith.nextLine();
        
        
    
        
                File file1=new File("C:\\Users\\hamad\\Desktop\\"+fileName+".txt");
        FileReader readText = new FileReader(file1);
        BufferedReader read1=new BufferedReader(readText);
        Scanner fileScan=new Scanner(read1);
       
        String wordline="";
        String wordLine="";
        
        while(fileScan.hasNext()){
              
            wordline=fileScan.nextLine();
            wordLine=wordLine+wordline;
       
            
           
           
        // TODO code application logic here
    }
       String newWordLine=wordLine.replaceAll(word, replaceWord);
       String[] wordLines=wordLine.split(" ");
      
             for(String woord:wordLines){
                      
             if (!woord.equals(word)){
             } else {
                 numberOfMatches++;
            
            }
             
             }
           
        System.out.println("number of matches in the file="+numberOfMatches);
        read1.close();
       
            FileWriter writeText=new FileWriter(file1);
            BufferedWriter write1=new BufferedWriter(writeText);
            write1.write(newWordLine);
            System.out.println(newWordLine);

 

        
        write1.close();
}
}

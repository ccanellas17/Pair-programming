package com.company;

import java.io.*;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        LinkedList<String> dictionary = new LinkedList<String>();

        //Create access to the unsorted dictionary file
        File f = new File("/Users/carlos/IdeaProjects/pair-programming/unsorteddict.txt");

        //Create FileReader to read the file
        FileReader r = new FileReader(f);
        BufferedReader reader = new BufferedReader(r);


        String line;
        while((line = reader.readLine()) != null){
            dictionary.add(line);
        }

        System.out.println(dictionary);
    }
}








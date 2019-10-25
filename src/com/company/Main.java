package com.company;

import java.io.*;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args) throws IOException {
        LinkedList<String> dictionary = new LinkedList<String>();

        //Create access to the unsorted dictionary file
        File f = new File("/Users/carlos/IdeaProjects/pair-programming/unsorteddict.txt");

        //Create FileReader to read the file
        FileReader r = new FileReader(f);

        BufferedReader reader = new BufferedReader(r);

        //Create a FileWriter for the sorted dictionary
        FileWriter writer = new FileWriter("/Users/carlos/IdeaProjects/pair-programming/unsorteddict.txt");

        }

        //Create fill() method to fill words in alphabetical order
        public static void fill (LinkedList<String> dict){
            for (int i = 0; i < dict.size(); i++) {
                for (int j = i + 1; j < dict.size(); i++) {
                    if (dict.get(i).compareTo(dict.get(j)) > 0) {
                        String word = dict.get(j);
                        dict.set(j, dict.get(i));
                        dict.set(i, word);
                    }
                }
            }
        }

    }






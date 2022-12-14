package com.shortesttransition;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Given a START word, an END word, and a dictionary 
 * of valid words, find the shortest transformation sequence
 * from START to END such that only one letter is 
 * changed at each step of the sequence, and each
 * transformed word exists in the dictionary. If there is no
 * possible transformation, return NULL. Each word in the 
 * dictionary have the same length as START and END and is lowercase
 * 
 * For example given START = "dog"
 *                   END   = "cat"
 * and dictionary = {"dot", "dop", "dat", "cat"}
 * return {"dog", "dot", "dat", "cat"}
 * 
 * Given START = "dog", END = "cat"
 * dictionary = {"dot", "tod", "dat", "dar"}
 * return NULL
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Declare HashMap as per prompt
        HashMap<Integer, String> dict1 = new HashMap<Integer, String>();
        dict1.put(0, "dot");
        dict1.put(1, "dop");
        dict1.put(2, "dat");
        dict1.put(3, "cat");
        // Declare HashMap that returns null
        HashMap<Integer, String> dict2 = new HashMap<Integer, String>();
        dict2.put(0, "dot");
        dict2.put(1, "tod");
        dict2.put(2, "dat");
        dict2.put(3, "dar");

        // Declare start and end strings
        String start = "dog";
        String end = "cat";
        // Send Hash, start and end to a function
        shortestTransition(dict2, start, end);

    }

    // Method takes start string and transitions to end string via Hash comparison
    private static void shortestTransition(HashMap<Integer, String> a, String start, String end) {
        // Create list to store steps.
        LinkedList<String> listOfWords = new LinkedList<String>();
        // Create temp String to keep track of progress
        String temp = start;
        // Add start to list
        listOfWords.add(temp);

        // Iterate through Hash and compare
        for (int i = 0; i < a.size(); i++) {
            // Initialize string 
            String value = "";
            // Pull value from Hashmap
            value = a.get(i);

            // Check for common letters
            for (int j = 0; j < value.length(); j++) {
                if (value.charAt(j) == end.charAt(j)) {
                    temp = value;
                    listOfWords.add(temp);
                    break;
                }
            }

            if (temp.compareTo(end) == 0) {
                printList(listOfWords);
                break;
            }
        }

        if (temp.compareTo(end) != 0) {
            listOfWords.clear();
            listOfWords.add(null);
            printList(listOfWords);
        }

        
    }

    // Print List
    private static void printList(LinkedList<String> list) {
        System.out.printf("\n{ ");
        for (String elem: list) {
            System.out.printf("\"%s\" ", elem);
        }
        System.out.printf("}\n");
    }
}

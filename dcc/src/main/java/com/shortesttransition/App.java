package com.shortesttransition;

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
        System.out.println( "Hello World!" );
    }
}

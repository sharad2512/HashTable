package com.hash_table;

public class HashTableMain {
    public static void main(String[] args) {
        System.out.println("Welcome To HashTable Program");
        MyHashTable<String, Integer> hashTable = new MyHashTable();
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        // Storing given paragraph in an array.
        // Converting the para words to lower case and removing spaces.

        String[] sentenceArray = sentence.toLowerCase().split(" ");

        // Iterating over the array.
        for (String word : sentenceArray) {
            Integer value = hashTable.get(word);

            if( value == null)
                value = 1;
            else
                value = value + 1;
            hashTable.add(word , value);
        }
        System.out.println(hashTable);
    }
}

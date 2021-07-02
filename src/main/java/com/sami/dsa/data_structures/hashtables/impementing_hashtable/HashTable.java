package com.sami.dsa.data_structures.hashtables.impementing_hashtable;

import java.util.ArrayList;
import java.util.Arrays;

public class HashTable {

    ArrayList<KeyValue>[] data;
    int currentLength;

    public HashTable(int size) {
        data = new ArrayList[size];
        currentLength = 0;
    }

    private int hash(String key) {

        int hash = 0;

        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % data.length;
        }

        return hash;
    }

    public void set(String key, int value) {

        int address = hash(key);

        if (data[address] == null) {
            ArrayList<KeyValue> arrayAtAddress = new ArrayList<>();
            data[address] = arrayAtAddress;
            currentLength++;
        }

        KeyValue pair = new KeyValue(key, value);
        data[address].add(pair);
    }

    public Integer get(String key) {

        int address = hash(key);
        ArrayList<KeyValue> bucket = data[address];

        if (bucket != null) {
            for (KeyValue keyValue : bucket) {
                if (keyValue.getKey().equals(key)) {
                    return keyValue.getValue();
                }
            }
        }

        return null;
    }

    public String[] getKeys() {

        ArrayList<KeyValue>[] bucket = data;
        String[] keysArray = new String[currentLength];
        int count = 0;

        for (ArrayList<KeyValue> keyValues : bucket) {
            if (keyValues != null) {
                keysArray[count] = keyValues.get(0).getKey();
                count++;
            }
        }

        return keysArray;
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(50);

        hashTable.set("grapes", 1000);
        hashTable.set("apples", 1500);

        System.out.println(hashTable.get("grapes"));
        System.out.println(hashTable.get("apples"));

        System.out.println(Arrays.toString(hashTable.getKeys()));

    }
}


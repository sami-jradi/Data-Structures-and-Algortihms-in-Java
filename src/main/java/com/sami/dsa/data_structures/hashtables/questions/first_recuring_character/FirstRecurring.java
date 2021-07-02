package com.sami.dsa.data_structures.hashtables.questions.first_recuring_character;

//Given an array = [2,5,1,2,3,5,1,2,4]: It should return 2
//Given an array = [2,1,1,2,3,5,1,2,4]: It should return 1
//Given an array = [2,3,4,5]: It should return null
//Given an array = [2,5,5,2,3,5,1,2,4]: return 5 because the pairs are before 2,2

import java.util.HashSet;

public class FirstRecurring {

    private Integer firstRecurringCharacter(int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int element : array) {
            if (hashSet.contains(element)) {
                return element;
            } else {
                hashSet.add(element);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 5, 2, 3, 5, 1, 2, 4};
        FirstRecurring object = new FirstRecurring();
        System.out.println(object.firstRecurringCharacter(array));
    }
}

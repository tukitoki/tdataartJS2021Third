package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        int first = 0;
        int second = 0;
        int helpNumber = 1;
        for (Integer i : firstNumber) {
            first = first + (i * helpNumber);
            helpNumber *= 10;
        }
        helpNumber = 1;
        for (Integer i : secondNumber) {
            second = second + (i * helpNumber);
            helpNumber *= 10;
        }
        return first + second;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        ArrayList<T> newList = new ArrayList<>();
        int counter = 1;
        for (T obj : list) {
            if (counter % 2 != 0) {
                newList.add(obj);
            }
            counter++;
        }
        return newList;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        if (list.size() == 0) {
            return list;
        }
        ArrayList<T> newList = new ArrayList<>();
        if (list.size() == 1) {
            newList.add(list.get(0));
            return newList;
        }
        if (list instanceof LinkedList) {
            newList.add(((LinkedList<T>) list).getFirst());
            newList.add(((LinkedList<T>) list).getLast());
            return newList;
        }
        newList.add(list.get(0));
        newList.add(list.get(list.size() - 1));
        return newList;
    }
}

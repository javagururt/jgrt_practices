package com.javaguru.practices.practice_6.task2;

class ArrayUtils {

    public double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double)sum / array.length;
        return average;
    }

    public int max(int[]array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public int min(int[]array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public int[] resize(int[]array, int newSize){

        int[]newArray = new int[newSize];

        for (int i = 0; i < newSize && i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}

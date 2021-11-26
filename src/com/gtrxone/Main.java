package com.gtrxone;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       printArray(sortIntegers(getIntegers(5)));
    }

    public static int[] getIntegers(int length) {
        int[] userInputs = new int[length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + length + " Integers");
        for (int i = 0; i < length; i++) {
            userInputs[i] = scanner.nextInt();
        }
        return userInputs;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array){
        int[] sortedArray =new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i]=array[i];
        }
        boolean flag =true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}

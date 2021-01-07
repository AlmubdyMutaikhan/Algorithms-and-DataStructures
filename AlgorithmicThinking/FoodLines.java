package com.company;

import java.util.Scanner;

/**
 * Code by Mutaikhan Almubdi
 * */


public class FoodLines {

    public static int findMin(int[]arr, int len) {
        int min = 0;
        for(int i = 0; i < len;i++) {
            if(arr[i] < arr[min]) {
                min = i;
            }
        }

        return min;
    }

    public static void printArray(int[]arr, int len) {
        for(int i = 0; i < len;i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
        System.out.println("******************************");
    }

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int number_of_lines = scanner.nextInt();
    int number_of_newcomers = scanner.nextInt();
    int[]ppl_in_lines = new int[number_of_lines];

    for(int i = 0; i < number_of_lines;i++) {
        ppl_in_lines[i] = scanner.nextInt();
    }

    int base_number_of_newcomers = number_of_newcomers + 1;

    System.out.println("ppl in lines looks like this one: ");
    printArray(ppl_in_lines, ppl_in_lines.length);

    while(number_of_newcomers != 0) {
            int min = findMin(ppl_in_lines, ppl_in_lines.length);
            System.out.println("customer-"+(base_number_of_newcomers - number_of_newcomers) +
                    " joined to the line where " +  ppl_in_lines[min] + " ppl ");
            System.out.println("after joining");;
            number_of_newcomers -= 1;
            ppl_in_lines[min] += 1;
            printArray(ppl_in_lines, ppl_in_lines.length);
        }
    }
}

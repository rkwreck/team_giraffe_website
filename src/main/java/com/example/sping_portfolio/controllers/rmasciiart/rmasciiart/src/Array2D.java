package com.example.sping_portfolio.controllers.rmasciiart.rmasciiart.src;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ctralie
 */

public class Array2D {
    /**
     *
     * @param x A 2D array to print
     * @param showCommas Whether or not to display the commas
     */
    public static void printArray(double[][] x, boolean showCommas) {
        // Loops through rows
        for (int i = 0; i < x.length; i++) {
            // For each row, I loop through all of the elements of
            // that row (all of the columns)
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]);
                if (showCommas && j < x[i].length - 1) {
                    System.out.print(",");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        double[][] x = new double[20][15];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                x[i][j] = 1;
            }
        }

        for (int i = 15; i < 20; i++) {
            for (int j = 10; j < 15; j++) {
                x[i][j] = 2;
            }
        }

        int number = 0;
        while (number < x.length && number < x[number].length) {
            x[number][number] = 7;
            number++;
        }

        printArray(x, false);
    }
}




package com.csci38004.assignment;

public class Arrays {
    private int[] squares = new int[10];
    int[] revarr = new int[10];

    public Arrays() {
        int square = 2;
        int val = 0;
        int i;
        int[] squares = new int[10];
        int[] revArr = new int[10];
        for (i = 0; i < 10; i++) {
            val = square * square;
            squares[i] = val;
            square = square + 2;

        }

        for (int j = 9; j >= 0; j--) {
            //  revArr[j]= squares[j];
            System.out.println(squares[j]);
        }


    }


}

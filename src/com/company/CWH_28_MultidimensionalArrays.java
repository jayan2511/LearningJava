package com.company;

public class CWH_28_MultidimensionalArrays {
    public static void main(String[] args) {


//        A multidimensional array is an array of arrays
        int [] marks; // A 1D array

        int [] [] flats; // A 2D array
        flats = new int [2] [3];
        flats [0] [0] = 101;
        flats [0] [1] = 102;
        flats [0] [2] = 103;
        flats [1] [0] = 201;
        flats [1] [1] = 202;
        flats [1] [2] = 203;

        System.out.println(flats[0][1]);
//        Similarly 3D, 4D, 5D..... arrays can be created

//      Printing a 2D array using loop
        for (int i = 0;i<flats.length;i++){
            for (int j = 0; j<flats[i].length; j++){
                System.out.println(flats[i][j]);
                System.out.println("");
            }
            System.out.println("");
        }
    }
}

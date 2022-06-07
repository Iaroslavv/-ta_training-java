package com.epam.training.iaroslav_bulimov.module_4;

class Spiral {
    static int[][] spiral(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        int num = 1;
        int max = rows * cols;

        int rmin = 0, rmax = rows - 1;
        int cmin = 0, cmax = cols - 1;

        while (num <= max) {
            for (int i = cmin; num <= max && i <= cmax; i++) {
                arr[rmin][i] = num++;
            }
            rmin++;
            for (int i = rmin; num <= max && i <= rmax; i++) {
                arr[i][cmax] = num++;
            }
            cmax--;
            for (int i = cmax; num <= max && i >= cmin; i--) {
                arr[rmax][i] = num++;
            }
            rmax--;
            for (int i = rmax; num <= max && i >= rmin; i--) {
                arr[i][cmin] = num++;
            }
            cmin++;
        }

        return arr;
    }
    public static void main(String[] args) {
        {
            int[][] spiral = Spiral.spiral(3, 4);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
        {
            int[][] spiral = Spiral.spiral(4, 3);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
        {
            int[][] spiral = Spiral.spiral(5, 6);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
        {
            int[][] spiral = Spiral.spiral(5, 5);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
    }
}

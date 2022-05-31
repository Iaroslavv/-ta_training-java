package com.epam.training.iaroslav_bulimov.module_3;

import java.util.Arrays;
import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int pizzas = sc.nextInt();
        int pizzaCounter = 1;
        while ((pizzas*pizzaCounter) % people != 0) {
            ++pizzaCounter;
        }
        System.out.println(pizzaCounter);
    }
}


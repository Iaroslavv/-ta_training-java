package com.epam.training.iaroslav_bulimov.module_12.house;
import com.epam.training.iaroslav_bulimov.module_12.residents.cats.*;
import com.epam.training.iaroslav_bulimov.module_12.residents.dogs.*;

public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog("Rax");
        Puppy randy = new Puppy("Randy");
        Cat barbos = new Cat("Barbos");
        Kitten murzik = new Kitten("Murzik");

        House dogHouse = new House();
        dogHouse.enter(rex);
        dogHouse.enter(randy);
        System.out.println(dogHouse);

        House catHouse = new House();
        catHouse.enter(barbos);
        catHouse.enter(murzik);
        System.out.println(catHouse);
    }
}


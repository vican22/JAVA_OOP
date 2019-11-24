package com.company;

import burger.DeluxeBurger;
import burger.Hamburger;
import burger.HealthyBurger;
import model.*;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);

        System.out.println("Total Burger is $" + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);

        healthyBurger.addHealthAddition1("Egg", 5.43);
        System.out.println("Total Burger is $" + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();

    }
}

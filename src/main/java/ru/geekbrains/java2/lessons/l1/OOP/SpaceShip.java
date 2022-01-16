package ru.geekbrains.java2.lessons.l1.OOP;

import java.io.Serializable;

public class SpaceShip implements Flying, Serializable {
    @Override
    public void fly() {
        System.out.println("Space ship fly");
    }
}
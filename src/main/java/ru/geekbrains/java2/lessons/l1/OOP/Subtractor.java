package ru.geekbrains.java2.lessons.l1.OOP;

public class Subtractor implements Calculator {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}

package com.example.javafxtestapp;

public class Random {

    static public double getRandom(int length){
        java.util.Random random = new java.util.Random();
        return Math.round(Math.random()*Math.pow(10, length));
    }

}

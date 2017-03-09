package com.epam.util;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Util {

    private static Random rnd = new Random();

    //choose random seat at the plane
    public static int getRandomSeat(int numberOfSeats) {
        return rnd.nextInt(numberOfSeats) + 1;
    }


}

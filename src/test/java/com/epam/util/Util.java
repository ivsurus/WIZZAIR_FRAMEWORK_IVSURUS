package com.epam.util;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Util {

    private static Random rnd = new Random();

    //choose random seat at the plane
    public static int getRandomSeat(int numberOfSeats)
    {
        return rnd.nextInt(numberOfSeats) +  1;
    }

    public static void main(String[] args) {

        /*Integer[] xxx = {1,2,3,4};
        Integer[] zzz = {1,4};
*/
        List<Integer> newXXX = Arrays.asList(1,2,3,4);
        List<Integer> newZZZ = Arrays.asList(1,4,2,3);

      //  ArrayList<Integer> newX = new ArrayList<Integer>(newXXX);
      //  ArrayList<Integer> newZ = new ArrayList<Integer>(newZZZ);

        System.out.println(newXXX.reAll(newZZZ));


       /* for(Integer numb: newXXX){
            System.out.println(numb);
        }
*/

        //ArrayList <Integer> yyy = Arrays.asList(xxx);
    }
}

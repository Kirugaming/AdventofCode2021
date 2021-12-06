package com.kirugaming.dayone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Two
{
    public static ArrayList<Integer> intInputToList() throws FileNotFoundException {
        Scanner reader = new Scanner(new File("input/day-one.txt"));
        ArrayList<Integer> listOfInts = new ArrayList<>();

        while(reader.hasNextInt()) {
            listOfInts.add(reader.nextInt());
        }

        return listOfInts;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> depths = intInputToList();

        int sumIncrease = 0;
        int window1 = 0;
        int window2 = 0;

        for (int i = 0; i < depths.size()-3; i++) {
            window1 = (depths.get(i) + depths.get(i+1) + depths.get(i+2));
            window2 = (depths.get(i+1) + depths.get(i+2) + depths.get(i+3));
            if (window1 < window2) {
                sumIncrease++;
            }
        }

        System.out.println(sumIncrease);
    }
}

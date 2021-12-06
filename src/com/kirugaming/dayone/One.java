package com.kirugaming.dayone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class One
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

        int countLarger = 0;

        ArrayList<Integer> depths = intInputToList();

        for (int i = 0; i < depths.size() - 1; i++) {
            if (depths.get(i) < depths.get(i + 1)) {
                countLarger++;
            }
        }

        System.out.println(countLarger);


    }


}

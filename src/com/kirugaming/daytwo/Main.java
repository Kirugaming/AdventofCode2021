package com.kirugaming.daytwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int finalDepthPartI() throws FileNotFoundException {
        Scanner reader = new Scanner((new File("input/day-two.txt")));
        ArrayList<String> directions = new ArrayList<>();

        int horizontal = 0;
        int depth = 0;
        int aim = 0;

        while (reader.hasNextLine()) {
            directions.add(reader.next());
        }

        for (int i = 0; i < directions.size() - 1; i += 2) {
            if (directions.get(i).equals("forward")) {
                horizontal += Integer.parseInt(directions.get(i+1));
                depth += aim * Integer.parseInt(directions.get(i+1));
            }
            if (directions.get(i).equals("up")) {
                aim -= Integer.parseInt(directions.get(i+1));
            }
            if (directions.get(i).equals("down")) {
                aim += Integer.parseInt(directions.get(i+1));
            }
        }

        return horizontal * depth;


    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(finalDepthPartI());
    }
}

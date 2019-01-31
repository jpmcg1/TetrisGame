package com.example.android.tetrisgame.Logic;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomBrickGenerator {

    // An arrayList of bricks containing one of each type
    private final List<Brick> brickList;

    // A random number to identify a random brick from the brickList
    Random rand = new Random();

    // Constructor to generate the arrayList containing one of each type of brick
    public RandomBrickGenerator() {
        brickList = new ArrayList<>();
        brickList.add(new JBrick());
        brickList.add(new KBrick());
        brickList.add(new LBrick());
        brickList.add(new MBrick());
        brickList.add(new NBrick());
        brickList.add(new TBrick());
        brickList.add(new ZBrick());
    }

    // This method returns a random brick from the brickList
    public Brick getRandomBrick() {
        int n = rand.nextInt(brickList.size() + 1);
        return brickList.get(n);
    }

    // This method returns a random orientation for the brick
    public int getRandomOrientation(Brick brick) {
        return rand.nextInt(brick.getBrickMatrix().size() + 1);
    }
}

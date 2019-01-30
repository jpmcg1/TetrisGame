package com.example.android.tetrisgame.Logic;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomBrickGenerator {

    Random rand = new Random();

    private final List<Brick> brickList;

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

    public List<int[][]> getRandomBrick() {
        int n = rand.nextInt(brickList.size() + 1);
        Brick brick = brickList.get(n);
        return brick.getBrickMatrix();
    }
}

package com.example.android.tetrisgame.Logic;

import android.support.annotation.NonNull;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MBrick implements Brick {

    private int position;

    private final List<int[][]> brickMatrix = new ArrayList<>();

    public MBrick() {
        brickMatrix.add(new int[][]{
                {0, 0, 0, 0},
                {0, 4, 4, 0},
                {0, 4, 4, 0},
                {0, 0, 0, 0}
        });
    }

    @NonNull
    @Override
    public String toString() {
        return "MBrick";
    }

    @Override
    // Get the position of the brick in the arrayList - the current orientation
    public int getPosition() {
        return this.position;
    }

    @Override
    // Set the orientation of the brick
    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public List<int[][]> getBrickMatrix() {
        return brickMatrix;
    }

}

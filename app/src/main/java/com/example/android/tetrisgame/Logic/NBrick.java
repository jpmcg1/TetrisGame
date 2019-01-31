package com.example.android.tetrisgame.Logic;

import android.support.annotation.NonNull;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NBrick implements Brick {

    // The position within the array to determine the initial orientation of the piece
    private int position;

    private final List<int[][]> brickMatrix = new ArrayList<>();

    public NBrick() {
        brickMatrix.add(new int[][]{
                {0, 0, 0, 0},
                {0, 5, 5, 0},
                {5, 5, 0, 0},
                {0, 0, 0, 0}
        });
        brickMatrix.add(new int[][]{
                {5, 0, 0, 0},
                {5, 5, 0, 0},
                {0, 5, 0, 0},
                {0, 0, 0, 0}
        });
    }

    @NonNull
    @Override
    public String toString() {
        return "NBrick";
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

    public void printArray() {
        int[][] a = brickMatrix.get(0);
        Log.d("NBRICK: ", Arrays.deepToString(a));
    }
}

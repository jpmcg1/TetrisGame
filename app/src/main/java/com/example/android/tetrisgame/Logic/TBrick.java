package com.example.android.tetrisgame.Logic;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

final class TBrick implements Brick {

    // The position within the array to determine the initial orientation of the piece
    private int position;

    private final List<int[][]> brickMatrix = new ArrayList<>();

    public TBrick() {
        brickMatrix.add(new int[][]{
                {0, 0, 0, 0},
                {6, 6, 6, 0},
                {0, 6, 0, 0},
                {0, 0, 0, 0}
        });
        brickMatrix.add(new int[][]{
                {0, 6, 0, 0},
                {6, 6, 0, 0},
                {0, 6, 0, 0},
                {0, 0, 0, 0}
        });
        brickMatrix.add(new int[][]{
                {0, 6, 0, 0},
                {6, 6, 6, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        });
        brickMatrix.add(new int[][]{
                {0, 6, 0, 0},
                {0, 6, 6, 0},
                {0, 6, 0, 0},
                {0, 0, 0, 0}
        });
    }

    @NonNull
    @Override
    public String toString() {
        return "TBrick";
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

package com.example.android.tetrisgame.Logic;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

final class MBrick implements Brick {

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
    public List<int[][]> getBrickMatrix() {
        return brickMatrix;
    }

}

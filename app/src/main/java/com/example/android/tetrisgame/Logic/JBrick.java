package com.example.android.tetrisgame.Logic;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

final class JBrick implements Brick {

    private final List<int[][]> brickMatrix = new ArrayList<>();

    public JBrick() {
        brickMatrix.add(new int[][]{
                {0, 0, 0 ,0},
                {1, 1, 1, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        });
        brickMatrix.add(new int[][]{
                {0, 1, 0, 0},
                {0, 1, 0, 0},
                {0, 1, 0, 0},
                {0, 1, 0, 0}
        });
    }

    @NonNull
    @Override
    public String toString() {
        return "JBrick";
    }

    @Override
    public List<int[][]> getBrickMatrix() {
        return brickMatrix;
    }
}

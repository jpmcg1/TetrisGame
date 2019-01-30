package com.example.android.tetrisgame.Logic;

import java.util.ArrayList;
import java.util.List;

final class NBrick implements Brick {

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

    @Override
    public List<int[][]> getBrickMatrix() {
        return brickMatrix;
    }
}

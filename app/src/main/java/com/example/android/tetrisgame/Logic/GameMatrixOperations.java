package com.example.android.tetrisgame.Logic;

public class GameMatrixOperations {
    // does a brick intersect
    // does a brick go out of bounds
    // copy the current game
    // translate (if down then move down)
    // if in a row, remove line and translate everything down one

    public GameMatrixOperations() {

    }

    // Return a copy of the current board
    public int[][] copy(int[][] original) {
        int length = original.length;
        int[][] copy = new int[length][original[0].length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                copy[i][j] = original[i][j];
            }
        }
        return copy;
    }
}

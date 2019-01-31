package com.example.android.tetrisgame.Logic;

import android.graphics.Point;
import android.util.Log;

import java.util.Arrays;

// Class to generate the teris board and manage brick movements
public class TetrisBoard {

    // The game board
    private int[][] gameMatrix;
    // Int to define length and width of the game board
    private int height;
    private int width;

    // Creates a brick
    private RandomBrickGenerator brickGenerator;

    // Object to rotate a brick
    private BrickRotation rotater;

    public TetrisBoard(int width, int height) {
        this.width = width;
        this.height = height;
        gameMatrix = new int[this.height][this.width];
        brickGenerator = new RandomBrickGenerator();
        rotater = new BrickRotation();
    }

    public int[][] getGameMatrix() {
        return gameMatrix;
    }

    // To get table format so easy to read, copy the output into notepad and import into
    // excel using "]" as the delimiter, then just turn from horizontal to vertical.
    public void printBoard() {
        Log.v("GAME BOARD: ", Arrays.deepToString(gameMatrix));
    }
}

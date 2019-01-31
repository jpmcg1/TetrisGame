package com.example.android.tetrisgame.Logic;

import android.graphics.Point;
import android.util.Log;

public class GameMatrixOperations {
    // if in a row, remove line and translate everything down one
    // merge bricks at the bottom

    private Point point;

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

    // If the brick will be out of the bounds of the board after the move, return true
    public boolean isOutOfBounds(int[][] board, int targetX, int targetY) {
        if (targetX >= 0 && targetX < board[targetY].length && targetY < board.length) {
            return false;
        }
        return true;
    }

    // If the intended brick move causes the game bounds to be intersected, or
    // the move encounters another brick (non zero value), return true.
    public boolean intersect(int[][] board, int x, int y) {
        for (int i = 0; i < board.length; i ++){
            for (int j = 0; j < board[i].length; j++) {
                int targetX = i + x;
                int targetY = j + y;
                if (board[i][j] != 0 && isOutOfBounds(board, targetX, targetY)
                        || board[targetX][targetY] != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}

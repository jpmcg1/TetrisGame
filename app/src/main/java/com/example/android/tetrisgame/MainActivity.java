package com.example.android.tetrisgame;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.android.tetrisgame.Logic.Brick;
import com.example.android.tetrisgame.Logic.BrickRotation;
import com.example.android.tetrisgame.Logic.GameMatrixOperations;
import com.example.android.tetrisgame.Logic.KBrick;
import com.example.android.tetrisgame.Logic.MBrick;
import com.example.android.tetrisgame.Logic.NBrick;
import com.example.android.tetrisgame.Logic.RandomBrickGenerator;
import com.example.android.tetrisgame.Logic.TetrisBoard;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TetrisBoard board = new TetrisBoard(5,10);
        GameMatrixOperations operations = new GameMatrixOperations();

        board.printBoard();

        operations.isOutOfBounds(board.getGameMatrix());
    }
}

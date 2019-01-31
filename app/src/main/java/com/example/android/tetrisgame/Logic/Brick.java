package com.example.android.tetrisgame.Logic;

import java.util.List;

public interface Brick {
    List<int[][]> getBrickMatrix();

    int getPosition();

    void setPosition(int position);
}

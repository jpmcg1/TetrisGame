package com.example.android.tetrisgame.Logic;

import java.util.List;

public class BrickRotation {

    public BrickRotation() {
    }

    public Brick rotateBrick(Brick brick) {
        if (brick == null) {
            throw new NullPointerException("The brick input was null");
        }
        // If the arrayList for the brick only contains one int[][] array, then there is
        // only one form of the brick so return the only entry in the arrayList.
        // This will be for the rectangle brick shape.
        if (brick.getBrickMatrix().size() == 1) {
            return brick;
        }

        // If the brick has more than one int[][] in the ArrayList (i.e. it has more than one
        // orientation), firstly, check if the current ArrayList position is the last position
        // for the brick, and if so, then set the new position to 0 - the brick turns
        // clockwise by 90 degrees.
        if (brick.getBrickMatrix().size() > 1) {
            int currentPosition = brick.getPosition();
            // If the current position is not the last position in the ArrayList,
            // add 1 to the current position - the brick turns clockwise by 90 degrees
            if (currentPosition + 1 == brick.getBrickMatrix().size()) {
                brick.setPosition(0);
            } else {
                brick.setPosition(currentPosition + 1);
            }
        }
        return brick;
    }
}

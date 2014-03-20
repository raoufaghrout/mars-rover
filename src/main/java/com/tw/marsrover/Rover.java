package com.tw.marsrover;

import com.tw.marsrover.direction.Direction;

public class Rover {

    private Plateau plateau;
    private int coordinateX;
    private int coordinateY;
    private Direction direction;

    public Rover(Plateau plateau, int coordinateX, int coordinateY, Direction direction) {
        this.plateau = plateau;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void spinRight() {
        direction = getDirection().spinRight();
    }

    public void spinLeft() {
        direction = getDirection().spinLeft();
    }

    public void moveForward() {
        getDirection().moveForward(this);
    }

    public String broadcastLocation() {
        return coordinateX + " "
                + coordinateY + " "
                + Character.toString(getDirection().getClass().getSimpleName().charAt(0));
    }
}
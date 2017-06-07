package com.classes.user;

public class Player {
    public int score;
    public int currentRoomNumber;

    public int getScore()
    {
        return score;
    }
    public void setScore(int score)
    {
        this.score=score;
    }
    public void calculateScore(int score) {
        this.score+=score;
    }

    public int getCurrentRoomNumber() {
        return currentRoomNumber;
    }

    public void setCurrentRoomNumber(int roomNumber) {
        this.currentRoomNumber = roomNumber;
    }
}

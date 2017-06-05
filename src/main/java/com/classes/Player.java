package main.java.com.classes;

public class Player {
    public int score;
    public int roomNumber;

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

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}

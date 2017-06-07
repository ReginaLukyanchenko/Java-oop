package com.classes.user;

public class User {
    public int id;
    public String name;
    public String login;
    public String password;
    public Player player;

    public User(){
        player = new Player();
    }
    public User(int id, String name, String login, String password)
    {
        this();
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.player.setScore(0);
        this.player.setCurrentRoomNumber(0);
    }

    public User(int id, String name, String login, String password, int score) {
        this();
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.player.setScore(score);
        this.player.setCurrentRoomNumber(0);
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id){this.id = id;}
    public String getName()
    {
        return name;
    }
    public String getLogin()
    {
        return login;
    }
    public String getPassword()
    {
        return password;
    }

    public Player getPlayer() {
        return player;
    }
}

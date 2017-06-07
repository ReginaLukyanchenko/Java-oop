package main.java.com.classes.user;

public class Profile {
    public String name;
    public String login;
    public String password;
    public Player player;

    public Profile(  String name, String login, String password)
    {
        this.name = name;
        this.login = login;
        this.password = password;
        this.player.setScore(0);
        this.player.setCurrentRoomNumber(1);
    }
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



}

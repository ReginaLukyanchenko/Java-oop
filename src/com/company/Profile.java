package com.company;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class Profile {
    public String name;
    public String login;
    public String password;
    public Player player;

    public void addNewProfile(  String name, String login, String password)
    {
        this.name = name;
        this.login = login;
        this.password = password;
        this.player.setScore(0);
        this.player.setRoomNumber(1);
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
    public Set getProfile()
    {
        Set <Profile> profileList = new Set<Profile>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Profile> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Profile profile) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Profile> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        return profileList;
    }
    public void toStringScore()
    {
        Set <Profile> profileList = new Set<Profile>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Profile> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Profile profile) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Profile> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        profileList = getProfile();
        for (Profile p : profileList) {
            System.out.println( p.name + "   "+p.player.getScore());
        }


    }


}

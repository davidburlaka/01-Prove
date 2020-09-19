package com.company;

public class User {

    private String password;
    private String salt;
    private String hash;

    public User() {
        password = "";
        salt = "";
        hash = "";
    }

    public User(String startPassword) {
        password = startPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newValue) {
        password = newValue;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String newValue) {
        salt = newValue;
    }

    public String getHashedPassword() {
        return hash;
    }

    public void setHashedPassword(String newValue) {
        hash = newValue;
    }
}
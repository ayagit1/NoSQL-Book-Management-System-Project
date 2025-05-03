package com.example.project.entities;

public class Comment {
    private String nickname;
    private String message;

    // Constructors
    public Comment() {}

    public Comment(String nickname, String message) {
        this.nickname = nickname;
        this.message = message;
    }

    // Getters and Setters
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
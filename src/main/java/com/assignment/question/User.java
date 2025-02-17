package com.assignment.question;

// Part 1: Implement Clonable interface
public class User implements ClonableObject<User> {
    private long userId;

    private String username;
    private String email;
    private String displayName;
    private int age;
    private UserType type;

    public User(long userId, String username, String email, String displayName, int age, UserType type) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.displayName = displayName;
        this.age = age;
        this.type = type;
    }

    public long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getAge() {
        return age;
    }

    public UserType getType() {
        return type;
    }

    @Override
    public User cloneObject() {
        // Shallow Copy - Just copying the references of the attrs
        // Works: Primitive Wrapper Classes are immutable in Java
        return new User(
            this.userId,
            this.username,
            this.email,
            this.displayName,
            this.age,
            this.type);
    }

}
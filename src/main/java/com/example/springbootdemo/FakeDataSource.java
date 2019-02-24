package com.example.springbootdemo;

public class FakeDataSource {
    
    private final String userName;
    private final String password;
    
    public FakeDataSource(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public String getPassword() {
        return password;
    }
}

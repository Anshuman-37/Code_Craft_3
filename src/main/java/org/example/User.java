package org.example;

public class User {
    private final String name;
    private String resumeName;
    private boolean resumeStatus;

    public User(String name, String resumeName) {
        this.name = name;
        this.resumeName = resumeName;
    }

    public boolean getAccountStatus() {
        if(this.name!=null && this.resumeName!=null)
            return true;
        return false;
    }

    public void resumeStatus(boolean status) {
        this.resumeStatus = status;
    }

    public boolean resumeGetStatus(){
        return this.resumeStatus;
    }
}

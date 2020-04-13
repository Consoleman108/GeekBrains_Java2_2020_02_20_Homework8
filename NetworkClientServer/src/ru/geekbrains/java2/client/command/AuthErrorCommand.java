package ru.geekbrains.java2.client.command;

public class AuthErrorCommand {
    private boolean endTimeoutAuth;
    private final String errorMessage;

    public AuthErrorCommand(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean getEndTimeoutAuth(){
        return endTimeoutAuth;
    }

    public void setEndTimeoutAuth(boolean endTimeoutAuth) {
        this.endTimeoutAuth = endTimeoutAuth;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}

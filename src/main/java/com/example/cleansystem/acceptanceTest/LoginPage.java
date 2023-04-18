package com.example.cleansystem.acceptanceTest;
class LoginPage {

    private String email;
    private String password;
    private String emailStatus;
    private String passwordStatus;
    private String errorMessage;

    public void goToLoginPage() {
        // navigate to login page
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void submitForm(boolean flag) {
        if (flag) {
            // submit form
            // set email status and password status based on validation result
            // set error message based on login result
        }
    }

    public String getEmailStatus() {
        return emailStatus;
    }

    public String getPasswordStatus() {
        return passwordStatus;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}


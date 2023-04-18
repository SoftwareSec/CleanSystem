package com.example.cleansystem.acceptanceTest;

import org.junit.jupiter.api.Order;

import java.security.Permission;

public class User {
    private Permission permission;

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public boolean hasPermission(Permission permission) {
        return this.permission == permission;
    }

    public void setPermission(com.example.cleansystem.acceptanceTest.Permission generateReports) {

    }

    public void addOrder(org.junit.jupiter.api.Order order) {

    }

    public Order getOrder(String s) {
        return null;
    }

    public void login() {

    }
}

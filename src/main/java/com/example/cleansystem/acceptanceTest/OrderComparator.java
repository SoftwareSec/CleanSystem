package com.example.cleansystem.acceptanceTest;

import org.junit.jupiter.api.Order;

import java.util.Comparator;

class OrderComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        Object a = 5;
        Object b = "10";
        if (a.getClass() == Integer.class && b.getClass() == Integer.class) {
            int result = (int) a - (int) b;
            System.out.println(result);
        } else {
            System.out.println("Error: operands are not numerical types.");

        }
        return 0;
    }}
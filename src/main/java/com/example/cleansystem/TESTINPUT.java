package com.example.cleansystem;

public class TESTINPUT {
    public static boolean checkName(String name) {
        name =name.toUpperCase();
        if ("Cover".equals(name)|| "Carpet".equals(name)|| "Blank".equals(name)){
            return true;

        }
        else{
            return false;
        }
    }

    public static boolean checkQuantity(String quantity) {
        boolean flag = true;
        if (quantity.length()>0){

            for (int i = 0; i < quantity.length(); i++) {
                if (!Character.isDigit(quantity.charAt(i))) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean checkSize(String string2) {
        boolean flag = true;
        if (string2.length()>0){

            for (int i = 0; i < string2.length(); i++) {
                if (!Character.isDigit(string2.charAt(i))) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean checkColor(String string2) {
        boolean flag = true;
        if (string2.length()>0){

            for (int i = 0; i < string2.length(); i++) {
                if (!Character.isDigit(string2.charAt(i))) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag){
            return true;
        }
        else{
            return false;
        }
    }

//    public static boolean checkColor(String string2) {
//
//    }
//
//    public static boolean checkSize(String string2) {
//
//    }
}

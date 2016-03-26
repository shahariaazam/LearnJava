package com.shaharia.java.learnjava;

public class DataTypes {
    int IntegerDataType;

    float FloatDataType;

    double DoubleDataType;

    char CharDataType;

    long LongDataType;

    byte ByteDataType;

    short ShortDataType;

    boolean BooleanDataType;

    public static void main(String[] args) {
        checkDataType('a');
    }

    public static void checkDataType(int variable){
        System.out.println(variable + " is an Integer");
    }

    public static void checkDataType(float variable){
        System.out.println(variable + " is a float");
    }

    public static void checkDataType(double variable){
        System.out.println(variable + " is double");
    }

    public static void checkDataType(char variable){
        System.out.println(variable + " is char");
    }

    public static void checkDataType(long variable){
        System.out.println(variable + " is long");
    }

    public static void checkDataType(byte variable){
        System.out.println(variable + " is byte");
    }

    public static void checkDataType(short variable){
        System.out.println(variable + " is short");
    }

    public static void checkDataType(boolean variable){
        System.out.println(variable + " is boolean");
    }


}

package com.csci38004.assignment;

public class Primitives {
    private int x =5 ;
    private String name;
    private double y;
    private char c;
    private boolean val;
    private void print() {
        System.out.println("type : " + "value:");

    }
    public Primitives (){
        x=5;
        name = "Harsimranjeet Singh";
        y= 4.0;
        c='h';
        val=true;
    }
    public int getx() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
        System.out.println(" X is: "+ x);
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
        System.out.println(" name is: "+ name);
    }

    public double gety() {
        return y;
    }

    public void sety(double y) {
        this.y = y;
        System.out.println(" y is: "+ y);
    }
    public char getc() {
        return c;
    }

    public void setc(char c) {
        this.c = c;
        System.out.println(" c is: " + c);

    }
    public boolean getval() {
            return val;
        }

        public void setval(boolean val) {
            this.val = val;
            System.out.println(" val is: "+ val);
        }
    }

/**
 * - No constructor with params
 * - No main() method
 */
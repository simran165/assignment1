package com.csci38004.assignment.shape;

public class Cylinder extends Circle implements Shape3D{
     double volume;
     static double height= 12.5;

    public Cylinder(double radius, double height) {
        super(radius);
        height= 12.5;
    }

    public double volume(){
        double volume = 3.1415926* radius*radius* height;
        return volume;
    }
    public static void main (String[]args)
    {
        Cylinder call= new Cylinder(radius,height);
        System.out.println ("the area is " + call.volume());
    }

}

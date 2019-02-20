package com.csci38004.assignment.shape;

public class Rectangle implements Shape {
    static double length = 4.9;
    static double width= 5.3;
    static double area ;
    static double perimeter;

    public Rectangle(double length, double width) {
          length = 4.9;
          width= 5.3;
    }

    public double area ()
    {
        double area = length* width;
        return area;
    }
    public double perimeter ()
    {
        double perimeter = 2*(length+width);
        return perimeter;

    }


    public static void main (String[]args)
    {
        Rectangle call= new Rectangle(length, width);
        System.out.println ("the area is " + call.area());
        System.out.println ("the perimeter is " + call.perimeter());

    }
}

package com.csci38004.assignment.shape;
import java.util.Scanner;
public class Circle  implements Shape {

    static double radius = 5.3;
    static double circumfrance = 2 * radius;
    static double area;
    static double perimeter;

    public Circle(double radius) {
    }
    public double area ()
    {
        double area = radius * radius * 3.1415926;
        return area;
    }
    public double perimeter ()
    {
        double perimeter = 3.1415926 * circumfrance;
        return perimeter;

    }


    public static void main (String[]args)
    {
        Circle call= new Circle(radius);
        System.out.println ("the area is " + call.area());
        System.out.println ("the circumfrance is " + circumfrance);
        System.out.println ("the perimeter is " + call.perimeter());

    }
    }


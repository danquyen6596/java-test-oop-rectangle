package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input width: ");
        double width = scanner.nextDouble();
        System.out.print("Input height: ");
        double  height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}

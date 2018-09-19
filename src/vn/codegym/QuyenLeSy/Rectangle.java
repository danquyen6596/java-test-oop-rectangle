package vn.codegym.QuyenLeSy;

public class Rectangle {
    double height, width;

    public Rectangle(){

    }

    public Rectangle(double newWidth, double newHeight){
        this.height = newHeight;
        this.width = newWidth;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }

    public String display(){
        return "Rectangle { " + "width: " + this.width + ", height: " + this.height + "}";
    }
}

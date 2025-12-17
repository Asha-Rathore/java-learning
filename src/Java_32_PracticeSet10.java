//Question 1
class Circle1{
    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double area(){
        return Math.PI * radius * radius;
    }
}

class Cylinder1 extends Circle1{
    double height;

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    double volume(){
        return Math.PI *  radius * radius * height;
    }
}

//Question 2
class Rectangle1{
    double length;
    double width;
    double height;

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    double area(){
        return length * width;
    }

    double volume(){
        return length * width * height;
    }
}

class Cuboid extends Rectangle1{
    @Override
    double area() {
        return 2 * (length * width + length * height + width * height);

    }
}

//Question 2
//Question 3
//Question 4
//Question 5

public class Java_32_PracticeSet10 {
    static void main(String[] args) {
        //Question 1
        //Question 2
        //Question 3
//        //CIRCLE
//        Circle1 circle1 = new Circle1();
//        circle1.setRadius(5);
//        System.out.println("Area of Circle is " + circle1.area());
//
//        //CYLINDER
//        Cylinder1 cylinder1 = new Cylinder1();
//        cylinder1.setRadius(10);
//        cylinder1.setHeight(15);
//        System.out.println("Area of Cylinder is " + cylinder1.area());
//        System.out.println("Volume of Cylinder is " + cylinder1.volume());

        //Question 4
        //RECTANGLE
        Rectangle1 rectangle1 = new Rectangle1();
        rectangle1.setLength(5);
        rectangle1.setHeight(15);
        rectangle1.setWidth(12);
        System.out.println("Area of Rectangle is " + rectangle1.area());
        System.out.println("Volume of Rectangle is " + rectangle1.volume());

        //CUBOID
        Cuboid cuboid = new Cuboid();
        cuboid.setLength(4);
        cuboid.setHeight(10);
        cuboid.setWidth(15);
        System.out.println("Area of Cuboid is " + cuboid.area());
        System.out.println("Volume of Cuboid is " + cuboid.volume());

        //Question 5
    }
}

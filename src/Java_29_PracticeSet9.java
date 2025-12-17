//Question 1
class Cylinder{
    private float radius;
    private float height;

    //Question 3
    public Cylinder(){
        radius = 20;
        height = 50;
    }

    public void setRadius(float r){
        radius = r;
    }

    public float getRadius(){
        return radius;
    }

    public void setHeight(float h){
        height = h;
    }

    public float getHeight(){
        return height;
    }

    //Question 2
    public float surfaceArea(){
        return 2 * 3.14f * radius * (radius + height);
    }

    public float volume(){
        return 3.14f * radius * radius * height;
    }
}


//Question 4
class Rectange{
    private int length;
    private int breadth;

    public Rectange(){
        length = 10;
        breadth = 5;
    }

    public Rectange(int l, int b){
        length = l;
        breadth = b;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }
}
//Question 5
class Sphere{
    private int radius;
    private int height;

    public void setHeight(int h) {
        height = h;
    }

    public void setRadius(int r) {
        radius = r;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }
}

public class Java_29_PracticeSet9 {
    static void main(String[] args) {
        //Question 1
//        Cylinder cylinder = new Cylinder();
//        cylinder.setRadius(10);
//        cylinder.setHeight(30);
//        System.out.println("The radius of Cylinder is " + cylinder.getRadius());
//        System.out.println("The height of Cylinder is " + cylinder.getHeight());

        //Question 2
//        System.out.println("The surface area of Cylinder is " + cylinder.surfaceArea());
//        System.out.println("The volume of Cylinder is " + cylinder.volume());

        //Question 3
//        Cylinder cylinder = new Cylinder();
//        System.out.println("The radius of Cylinder is " + cylinder.getRadius());
//        System.out.println("The height of Cylinder is " + cylinder.getHeight());

        //Question 4
//        Rectange rectange = new Rectange();
//        Rectange rectange1 = new Rectange(20, 50);
//        System.out.println("The length and breadth of Rectangle is " + rectange.getLength() + " " + rectange.getBreadth());
//        System.out.println("The length and breadth of Rectangle1 is " + rectange1.getLength() + " " + rectange1.getBreadth());

        //Question 5
        Sphere sphere = new Sphere();
        sphere.setRadius(10);
        sphere.setHeight(30);
        System.out.println("The radius of sphere is " + sphere.getRadius());
        System.out.println("The height of sphere is " + sphere.getHeight());
    }
}

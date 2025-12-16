//Question 1
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        name = name;
    }

    public void display(){
        System.out.println("Salary is " + salary);
        System.out.println("Name is " + name);

    }}

//Question 2
class CellPhone{
    public void ringing(){
        System.out.println("Ringing...");
    }

    public void calling(){
        System.out.println("Calling...");
    }
}

//Question 3
class Square{
    int side;

    public void setSide(int s){
        side = s;
    }

    public int area(){
        return side * side;
    }

    public int perimeter(){
        return 4 * side;
    }
}

//Question 4
class Rectangle{
    int length;
    int width;

    public void setLength(int l){
        length = l;
    }

    public void setWidth(int w){
        width = w;
    }

    public int area(){
        return length * width;
    }

    public int perimeter(){
        return 2 * (length + width);
    }
}

//Question 5
class TommyVecetti{
    public void hitting(){
        System.out.println("Hitting...");
    }

    public void running(){
        System.out.println("Running...");
    }

    public void firing(){
        System.out.println("Firing...");
    }
}

//Question 6
class Circle{
    float radius;

    public void setRadius(float r){
        radius = r;
    }

    public float area(){
        return 3.14f * radius * radius;
    }

    public float perimeter(){
        return 2 * 3.14f * radius;
    }
}

public class Java_25_PracticeSet8 {
    static void main(String[] args) {
        //Question 1
//        Employee asha = new Employee();
//        asha.name = "Asha";
//        asha.salary = 8000;
//        asha.getSalary();
//        asha.setName("Asha Nelson");
//        asha.getName();
//        asha.display();

        //Question 2
//        CellPhone iphone = new CellPhone();
//        iphone.ringing();
//        iphone.calling();

        //Question 3
//        Square sq = new Square();
//        sq.setSide(4);
//        System.out.println("The area of square is " + sq.area());
//        System.out.println("The perimeter of square is " + sq.perimeter());

        //Question 4
//        Rectangle r = new Rectangle();
//        r.setLength(4);
//        r.setWidth(3);
//        System.out.println("The area of rectangle is " + r.area());
//        System.out.println("The perimeter of rectangle is " + r.perimeter());

        //Question 5
//        TommyVecetti tommyVecetti = new TommyVecetti();
//        tommyVecetti.hitting();
//        tommyVecetti.running();
//        tommyVecetti.firing();

        //Question 6
        Circle circle = new Circle();
        circle.setRadius(4);
        System.out.println("The area of circle is " + circle.area());
        System.out.println("The perimeter of circle is " + circle.perimeter());
    }
}

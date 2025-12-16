class Employee1{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class Java_24_CustomClass {
    static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 asha = new Employee1();
        Employee1 nelson = new Employee1();
        asha.id = 72048;
        asha.name = "Asha Nelson";
        asha.salary = 1200;
//        System.out.println(asha.id);
//        System.out.println(asha.name);
        asha.printDetails();

        nelson.id = 1;
        nelson.name = "Engr. Nelson";
        nelson.salary = 3000;
        nelson.printDetails();

        int salary = nelson.getSalary();
        System.out.println(salary);
    }
}

class MyMainEmployee{
    private int id;
    private String name;
    private int salary;

    public MyMainEmployee(){
        id = 45;
        name = "Your-Name";
    }

    public MyMainEmployee(String myName){
        id = 45;
        name = myName;
    }

    public MyMainEmployee(int mySalary){
        salary = 100000;
    }

    public void setId(int i){
        id = i;
    }

    public int getId(){
        return id;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
}

public class Java_27_Constructors {
    static void main(String[] args) {
        MyMainEmployee asha = new MyMainEmployee("Asha");
        MyMainEmployee nelson = new MyMainEmployee();
//        asha.setName("Asha Nelson");
        System.out.println(asha.getId());
        System.out.println(asha.getName());
        System.out.println(nelson.getId());
        System.out.println(nelson.getName());
    }
}

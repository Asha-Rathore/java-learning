class MyEmployee{
    private int id;
    private String name;

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

public class Java_26_AccessModifiers {
    static void main(String[] args) {
        MyEmployee asha = new MyEmployee();
        asha.setId(45);
        asha.setName("Asha Nelson");
        System.out.println("My id is " + asha.getId());
        System.out.println("My name is " + asha.getName());
    }
}

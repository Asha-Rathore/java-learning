class Base{
    int x;

    public Base(){
        System.out.println("I am a constructor");
    }

    public Base(String name){
        System.out.println("I am a overloaded constructor " + name);
    }

    public void setX(int x) {
        System.out.println("I am setting x now");
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void printMe(){
        System.out.println("Print me");
    }
}

class Derived extends Base{
    int y;

    public Derived(){
        //To call overloaded constructor of base class
        super("Base");
        System.out.println("I am derived class constructor");
    }

    public Derived(String name){
        super(name);
        System.out.println("I am a overloaded constructor " + name);
    }
    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public void printMe() {
        super.printMe();
        System.out.println("Print me in derived");
    }

    public void setY(int y) {
        this.y = y;
    }
}

class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("I am child of derived class constructor");
    }

    ChildOfDerived(String name){
        super(name);
        System.out.println("I am child of derived class overloaded constructor");
    }
}

public class Java_30_Inheritance {
    static void main(String[] args) {
//        Base base = new Base();
        Derived derived = new Derived("Derived");
        derived.printMe();
//        derived.setX(9);
//        System.out.println(derived.getX());

//        ChildOfDerived childOfDerived = new ChildOfDerived("Child");

    }
}
